package com.mscharhag.mvc.csrf;


import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.CsrfValid;
import javax.mvc.binding.BindingResult;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Controller
@Path("/")
public class CsrfController {

    @Inject
    private Models models;

    @Inject
    private BindingResult br;

    @GET
    public String form() {
        return "/WEB-INF/jsp/form.jsp";
    }

    // CsrfValidationException


    @POST
//    @CsrfValid
    public String formSubmit(@BeanParam User user) {
        return "/WEB-INF/jsp/success.jsp";
    }

}