package com.storedsoul.services;

import com.storedsoul.dao.ProductDao;
import com.storedsoul.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService
{
    @Autowired
    private ProductDao productDao;

    public List<Product> getAvailableProducts()
    {
        return productDao.getAvailableProducts();
    }

    public boolean isProductAvailable(String productName)
    {

        return false;
    }
}
