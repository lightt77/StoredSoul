package com.storedsoul.dao.mappers;

import com.storedsoul.models.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product>
{
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        Product product = new Product();
        product.setProductId(rs.getInt(1));
        product.setName(rs.getString(2));
        product.setType(rs.getString(3));
        product.setColour(rs.getString(4));
        product.setSize(rs.getString(5));
        product.setPrice(rs.getInt(6));
        product.setArtistId(rs.getInt(7));
        product.setDateAdded(rs.getString(8));
        product.setNoOfPurchases(rs.getInt(9));
        product.setImagePath(rs.getString(10));

        return product;
    }
}
