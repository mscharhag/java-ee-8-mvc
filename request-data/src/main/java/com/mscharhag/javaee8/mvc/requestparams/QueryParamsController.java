package com.mscharhag.javaee8.mvc.requestparams;

import com.oracle.ozark.core.Models;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Controller
@Path("query-params")
public class QueryParamsController {

    @Inject
    Models models;

//    @GET
//    public String queryParams(@QueryParam("name") String name) {
//        this.models.put("text", "Query parameter name = " + name);
//        return "/WEB-INF/jsp/view.jsp";
//    }


    // http://localhost:8080/java-ee-8-request-parameters/request-parameters/query-params?name=john&id=56&role=admin
    @GET
    public String queryParams(
            @QueryParam("id") Long id,
            @QueryParam("name") String name,
            @QueryParam("role") Role role) {

        this.models.put("text", "Query parameters: id = " + id + ", name = " + name + ", role = " + role);
        return "/WEB-INF/jsp/view.jsp";
    }


    @POST
    public String queryParamsPost(@QueryParam("name") String name) {
        this.models.put("text", "POST request query parameter: name = " + name);
        return "/WEB-INF/jsp/view.jsp";
    }

}