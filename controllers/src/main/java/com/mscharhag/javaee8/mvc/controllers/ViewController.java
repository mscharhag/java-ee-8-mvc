package com.mscharhag.javaee8.mvc.controllers;

import javax.mvc.Controller;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("views")
@View("/WEB-INF/jsp/foo.jsp")
public class ViewController {

    @GET
    @Path("first")
    public void first() {
        // renders foo.jsp
    }

    @GET
    @Path("second")
    @View("/WEB-INF/jsp/bar.jsp")
    public void second() {
        // renders bar.jsp
    }

    @GET
    @Path("third")
    public String third() {
        // renders baz.jsp
        return "/WEB-INF/jsp/baz.jsp";
    }
}