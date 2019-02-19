package com.storedsoul.services;

import com.storedsoul.dao.ProductDao;
import com.storedsoul.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
public class ProductService
{
    @Autowired
    private ProductDao productDao;

    public List<Product> getAvailableProducts() throws ExecutionException, InterruptedException
    {
        CompletableFuture<List<Product>> result = productDao.getAvailableProducts();
        return result.get();
    }

    public Product getProductDetails(int productId) throws ExecutionException, InterruptedException
    {
        CompletableFuture<List<Product>> result = productDao.getProductById(productId);

        if(result.get().isEmpty() || result.get().size()>1)
           return null;

        return result.get().get(0);
    }

    public boolean isProductAvailable(String productName)
    {

        return false;
    }
}
