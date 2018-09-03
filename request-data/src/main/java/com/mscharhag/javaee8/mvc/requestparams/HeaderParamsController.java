package com.mscharhag.javaee8.mvc.requestparams;

import javax.inject.Inject;
import javax.mvc.annotation.Controller;
import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

@Controller
@Path("header-params")
public class HeaderParamsController {


    @Inject
    Models models;

    @GET
    public String getAcceptHeader(@HeaderParam("Accept") String accept) {
        this.models.put("text", "Accept header: " + accept);
        return "/WEB-INF/jsp/view.jsp";
    }
}
