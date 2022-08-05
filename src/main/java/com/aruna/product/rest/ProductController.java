package com.aruna.product.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping
    public String createProducts() {
        return "Create New Product";
    }

    @GetMapping
    public String getProducts() {
        return "Get Products";
    }

    @PutMapping
    public String updateProducts() {
        return "Update Product";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "Delete Product";
    }
}
