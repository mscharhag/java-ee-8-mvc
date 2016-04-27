package com.mscharhag.javaee8.mvc.exceptions;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class IllegalArgumentExceptionMapper implements ExceptionMapper<IllegalArgumentException> {

    @Inject
    private Models models;

    @Override
    public Response toResponse(IllegalArgumentException exception) {
        models.put("message", exception.getMessage());

        return Response.status(Response.Status.BAD_REQUEST)
                .entity("/WEB-INF/jsp/error.jsp")
                .build();
    }

}
