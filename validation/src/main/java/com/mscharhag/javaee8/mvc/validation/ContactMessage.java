package com.mscharhag.javaee8.mvc.validation;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.mvc.binding.MvcBinding;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

public class ContactMessage {

    @MvcBinding
    @FormParam("name")
    @NotBlank
    @Size(max = 50)
    private String name;

    @MvcBinding
    @FormParam("email")
    @Email
    @NotBlank
    private String email;

    @MvcBinding
    @FormParam("message")
    @NotBlank
    @Size(max = 1000)
    private String message;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ContactMessage{" +
                "email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
