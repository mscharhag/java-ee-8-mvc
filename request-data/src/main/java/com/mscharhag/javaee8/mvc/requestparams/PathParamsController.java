package com.mscharhag.javaee8.mvc.requestparams;

import javax.inject.Inject;
import javax.mvc.annotation.Controller;
import javax.mvc.Models;
import javax.ws.rs.*;

@Controller
@Path("path-params")
public class PathParamsController {

    @Inject
    Models models;

    // e.g. /request-parameters/path-params/date/2015/04
    @GET
    @Path("/date/{year}/{month}")
    public String pathParamDate(@PathParam("year") int year, @PathParam("month") int month) {
        this.models.put("text", "Path parameters: year = " + year + ", month = " + month);
        return "/WEB-INF/jsp/view.jsp";
    }

    // e.g. /request-parameters/path-params/roles/admin
    @GET
    @Path("/roles/{role}")
    public String pathParamUsers(@PathParam("role") Role role) {
        this.models.put("text", "Path parameters: role = " + role);
        return "/WEB-INF/jsp/view.jsp";
    }

    // e.g. /request-parameters/path-params/users/123
    @GET
    @Path("/users/{id : \\d+}")
    public String findUserById(@PathParam("id") long id) {
        this.models.put("text", "Path parameters: id = " + id);
        return "/WEB-INF/jsp/view.jsp";
    }

    // e.g. /request-parameters/path-params/users/john
    @GET
    @Path("/users/{name : [a-zA-Z]+}")
    public String findUserByName(@PathParam("name") String name) {
        this.models.put("text", "Path parameters: name = " + name);
        return "/WEB-INF/jsp/view.jsp";
    }


    @PathParam("category")
    private String category;

    // e.g. /request-parameters/path-params/category/radio
    @GET
    @Path("/categories/{category}")
    public String findByCategory() {
        this.models.put("text", "Path parameters: category = " + category);
        return "/WEB-INF/jsp/view.jsp";
    }
}
