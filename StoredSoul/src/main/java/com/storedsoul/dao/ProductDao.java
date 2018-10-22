package com.storedsoul.dao;

import com.storedsoul.dao.mappers.ProductMapper;
import com.storedsoul.models.Product;
import com.storedsoul.utilities.StoredProcedures;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class ProductDao extends DAO<Product>
{
    public List<Product> getAvailableProducts()
    {
        return mapToList(executeStoredProc(StoredProcedures.GET_ALL_AVAILABLE_PRODUCTS.getValue(), new HashMap<String, Object>(), new ProductMapper()));
    }

    public void addProduct(Product product)
    {
        executeStoredProc(StoredProcedures.ADD_PRODUCT.getValue(), new HashMap<String, Object>()
        {
            {
                put("p_name", product.getName());
                put("p_type", product.getType());
                put("p_colour", product.getColour());
                put("p_size", product.getSize());
                put("p_price", product.getPrice());
                put("p_artist_id", product.getArtistId());
            }
        }, new ProductMapper());
    }
}
