package com.mscharhag.javaee8.mvc.requestparams;

import javax.inject.Inject;
import javax.mvc.Controller;
import com.oracle.ozark.core.Models;

import javax.ws.rs.*;

@Controller
@Path("form-params")
public class FormParamsController {

    @Inject
    Models models;

    @GET
    @Path("form")
    public String form() {
        return "/WEB-INF/jsp/form.jsp";
    }

    @POST
    @Path("params")
    public String submitParams(
            @FormParam("id") long id,
            @FormParam("name") String name,
            @FormParam("role") Role role) {

        this.models.put("text", "Form parameters: id = " + id + ", name = " + name + ", role = " + role);
        return "/WEB-INF/jsp/view.jsp";
    }

    @POST
    @Path("bean")
    public String submitBean(@BeanParam User user) {
        this.models.put("text", "User: " + user);
        return "/WEB-INF/jsp/view.jsp";
    }

}
