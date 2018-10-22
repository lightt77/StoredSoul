package com.storedsoul.models;

public class Product
{
    private int productId;
    private String name;
    private String type;
    private String colour;
    private String size;
    private int price;
    private int artistId;
    private String dateAdded;
    private int noOfPurchases;
    private String imagePath;

    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        this.productId = productId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getArtistId()
    {
        return artistId;
    }

    public void setArtistId(int artistId)
    {
        this.artistId = artistId;
    }

    public String getDateAdded()
    {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded)
    {
        this.dateAdded = dateAdded;
    }

    public int getNoOfPurchases()
    {
        return noOfPurchases;
    }

    public void setNoOfPurchases(int noOfPurchases)
    {
        this.noOfPurchases = noOfPurchases;
    }

    public String getImagePath()
    {
        return imagePath;
    }

    public void setImagePath(String imagePath)
    {
        this.imagePath = imagePath;
    }
}
