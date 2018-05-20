package com.mscharhag.javaee8.mvc.validation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.mvc.binding.BindingResult;
import javax.mvc.binding.ValidationError;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Controller
@RequestScoped
@Path("/")
public class ContactController {

    @Inject
    private Models models;

    @Inject
    private BindingResult bindingResult;

    @GET
    public String form() {
        return "/WEB-INF/jsp/contact.jsp";
    }

    @POST
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String formSubmit(@Valid @BeanParam ContactMessage message) {
        if (bindingResult.isFailed()) {
            models.put("bindingResult", bindingResult);
            return "/WEB-INF/jsp/contact.jsp";
        }
        return "/WEB-INF/jsp/success.jsp";
    }
}
