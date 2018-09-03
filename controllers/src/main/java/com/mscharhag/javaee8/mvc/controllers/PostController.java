package com.mscharhag.javaee8.mvc.controllers;

import javax.mvc.annotation.Controller;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Controller
@Path("http")
public class PostController {

    @POST
    @Path("post")
    public String post() {
        return "/WEB-INF/jsp/hello.jsp";
    }
}
