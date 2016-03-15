package com.mscharhag.javaee8.mvc.requestparams.bean;

import com.oracle.ozark.core.Models;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.*;

@Controller
@Path("bean-params")
public class BeanParamsController {

    @Inject
    Models models;


    @GET
    @Path("form")
    public String form() {
        return "/WEB-INF/jsp/bean-params-form.jsp";
    }

    @POST
    @Path("submit")
    public String submit(@BeanParam User user) {
        this.models.put("text", "Bean parameters: user = " + user);
        return "/WEB-INF/jsp/view.jsp";
    }


    @GET
    @Path("/date/{year}/{month}")
    public String get(@BeanParam RequestData data) {
        this.models.put("text", "Bean parameters: data = " + data);
        return "/WEB-INF/jsp/view.jsp";
    }

}
