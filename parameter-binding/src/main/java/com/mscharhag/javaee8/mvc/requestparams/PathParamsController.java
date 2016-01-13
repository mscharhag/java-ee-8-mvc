package com.mscharhag.javaee8.mvc.requestparams;

import com.oracle.ozark.core.Models;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.*;

@Controller
@Path("path-params")
public class PathParamsController {

    @Inject
    Models models;

    // http://localhost:8080/java-ee-8-request-parameters/request-parameters/path-params/date/2015/04
    @GET
    @Path("/date/{year}/{month}")
    public String pathParamDate(@PathParam("year") int year, @PathParam("month") int month) {
        this.models.put("text", "Path parameters: year = " + year + ", month = " + month);
        return "/WEB-INF/jsp/view.jsp";
    }

    // http://localhost:8080/java-ee-8-request-parameters/request-parameters/path-params/roles/admin
    @GET
    @Path("/roles/{role}")
    public String pathParamUsers(@PathParam("role") Role role) {
        this.models.put("text", "Path parameters: role = " + role);
        return "/WEB-INF/jsp/view.jsp";
    }

    // http://localhost:8080/java-ee-8-request-parameters/request-parameters/path-params/users/123
    @GET
    @Path("/users/{id : \\d+}")
    public String findUserById(@PathParam("id") long id) {
        this.models.put("text", "Path parameters: id = " + id);
        return "/WEB-INF/jsp/view.jsp";
    }

    // http://localhost:8080/java-ee-8-request-parameters/request-parameters/path-params/users/john
    @GET
    @Path("/users/{name : [a-zA-Z]+}")
    public String findUserByName(@PathParam("name") String name) {
        this.models.put("text", "Path parameters: name = " + name);
        return "/WEB-INF/jsp/view.jsp";
    }

}
