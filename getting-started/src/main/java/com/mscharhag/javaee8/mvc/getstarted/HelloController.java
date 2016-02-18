package com.mscharhag.javaee8.mvc.getstarted;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Controller
@Path("hello")
public class HelloController {

    @Inject
    Models models;

    @GET
    public String sayHello(@QueryParam("name") String name) {
        this.models.put("text", "Hello " + name);
        return "/WEB-INF/jsp/hello.jsp";
    }

}