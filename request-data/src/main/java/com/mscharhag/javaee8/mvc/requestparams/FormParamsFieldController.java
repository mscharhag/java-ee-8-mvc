package com.mscharhag.javaee8.mvc.requestparams;

import com.oracle.ozark.core.Models;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Controller
@Path("form-params-fields")
public class FormParamsFieldController {

    @Inject
    Models models;

    @FormParam("id")
    private long idField;

    @FormParam("role")
    private Role roleField;

    private String nameField;

    @FormParam("name")
    public void setNameField(String nameField) {
        this.nameField = nameField;
    }

    @POST
    public String submitParams() {
        this.models.put("text", "Form parameters: id = " + idField + ", name = " + nameField + ", role = " + roleField);
        return "/WEB-INF/jsp/view.jsp";
    }
}
