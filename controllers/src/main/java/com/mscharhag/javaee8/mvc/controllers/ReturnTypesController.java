package com.mscharhag.javaee8.mvc.controllers;

import javax.mvc.annotation.Controller;
import javax.mvc.annotation.View;
import javax.mvc.Viewable;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Controller
@Path("return-types")
public class ReturnTypesController {

    @GET
    @View("/WEB-INF/jsp/hello.jsp")
    @Path("return-void")
    public void returnVoid() {
    }

    @GET
    @Path("return-string")
    public String returnString() {
        return "/WEB-INF/jsp/hello.jsp";
    }

    @GET
    @Path("return-string")
    public Viewable returnViewable() {
        return new Viewable("/WEB-INF/jsp/hello.jsp");
    }

    @GET
    @Path("return-response")
    public Response returnResponse() {
        return Response.status(Response.Status.OK)
                .entity("/WEB-INF/jsp/hello.jsp")
                .build();
    }
}
