package com.mscharhag.javaee8.mvc.controllers.product;

import javax.inject.Inject;
import javax.mvc.annotation.Controller;
import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("product")
@Controller
public class ProductController {

    @Inject
    private Models models;

    @Inject
    private ProductService productService;

    @GET
    public String getProductDetailPage(@QueryParam("id") long productId) {
        Product product = this.productService.getProduct(productId);
        models.put("product", product);
        return "/WEB-INF/jsp/productDetailPage.jsp";
    }
}
