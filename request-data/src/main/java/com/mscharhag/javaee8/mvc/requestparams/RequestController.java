package com.mscharhag.javaee8.mvc.requestparams;

import javax.inject.Inject;
import javax.mvc.annotation.Controller;
import javax.mvc.Models;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Controller
@Path("request")
public class RequestController {

    @Inject
    Models models;

    @GET
    public String request(@Context HttpServletRequest request) {
        String name = request.getParameter("name");
        String acceptHeader = request.getHeader("Accept");
        Cookie[] cookies = request.getCookies();
        HttpSession session = request.getSession();


        return "/WEB-INF/jsp/view.jsp";
    }

}
