package com.mscharhag.javaee8.mvc.requestparams;

import com.oracle.ozark.core.Models;

import javax.inject.Inject;
import javax.mvc.Controller;
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
