package com.storedsoul.controllers;

import com.storedsoul.models.Product;
import com.storedsoul.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("products")
@RestController
public class ProductController
{
    @Autowired
    private ProductService productService;

    // TODO: remove cross origin beforedeploying
    @CrossOrigin(origins = "*")             // only for debugging
    @GetMapping
    public List<Product> getAvailableProducts()
    {
        return productService.getAvailableProducts();
    }
}
