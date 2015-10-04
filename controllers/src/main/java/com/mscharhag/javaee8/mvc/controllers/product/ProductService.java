package com.mscharhag.javaee8.mvc.controllers.product;

public class ProductService {

    public Product getProduct(long productId) {
        return new Product("Product with ID " + productId);
    }

}
