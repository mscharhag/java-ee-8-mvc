package com.mscharhag.javaee8.mvc.exceptions;

import com.oracle.ozark.core.Models;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Controller
@Path("illegal-argument")
public class ExceptionController {

    @GET
    public String exception() {
        throw new IllegalArgumentException("foo");
    }

}