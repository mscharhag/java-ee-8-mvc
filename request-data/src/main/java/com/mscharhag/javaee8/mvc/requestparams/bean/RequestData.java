package com.mscharhag.javaee8.mvc.requestparams.bean;

import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public class RequestData {

    @PathParam("year")
    private int year;

    @PathParam("month")
    private int month;

    @QueryParam("name")
    private String name;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "RequestData{" +
                "year=" + year +
                ", month=" + month +
                ", name='" + name + '\'' +
                '}';
    }
}
