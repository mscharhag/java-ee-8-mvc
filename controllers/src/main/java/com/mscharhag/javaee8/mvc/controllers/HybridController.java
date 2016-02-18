package com.mscharhag.javaee8.mvc.controllers;

import javax.inject.Inject;
import javax.mvc.annotation.Controller;
import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("hybrid")
public class HybridController {

    @GET
    @Path("jaxrs")
    public Response jaxrs() {
        return Response.status(200).build();
    }

    @Path("mvc")
    @GET
    @Controller
    public String mvc() {
        return "/WEB-INF/jsp/hello.jsp";
    }
}
