package com.mscharhag.javaee8.mvc.requestparams;

import com.oracle.ozark.core.Models;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Controller
@Path("query-params-fields")
public class QueryParamsFieldController {

    @Inject
    Models models;

    @QueryParam("id")
    private Long id;

    @QueryParam("role")
    private Role role;

    private String name;

    @QueryParam("name")
    public void setName(String name) {
        this.name = name;
    }

    // localhost:8080/java-ee-8-request-parameters/request-parameters/query-params-fields?name=john&id=42&role=reporter
    @GET
    public String queryParams() {
        this.models.put("text", "Query parameters: id = " + id + ", name = " + name + ", role = " + role);
        return "/WEB-INF/jsp/view.jsp";
    }
}
