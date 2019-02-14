package com.storedsoul.controllers;

import com.storedsoul.models.Product;
import com.storedsoul.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RequestMapping("products")
@RestController
public class ProductController
{
    @Autowired
    private ProductService productService;

    // TODO: remove cross origin beforedeploying
    @CrossOrigin(origins = "*")             // only for debugging
    @GetMapping
    public List<Product> getAvailableProducts() throws ExecutionException, InterruptedException
    {
        return productService.getAvailableProducts();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("{productId}")
    public Product getProductDetails(@PathVariable int productId) throws ExecutionException, InterruptedException
    {
        return productService.getProductDetails(productId);
    }
}
