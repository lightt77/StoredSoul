package com.storedsoul.utilities;

public enum StoredProcedures
{
    GET_ALL_USERS("GET_ALL_USERS"),
    ADD_USER("ADD_USER"),
    UPDATE_USER_PASSWORD("UPDATE_USER_PASSWORD"),
    ADD_PRODUCT("ADD_PRODUCT"),
    GET_ALL_AVAILABLE_PRODUCTS("GET_ALL_AVAILABLE_PRODUCTS"),
    GET_PRODUCT_BY_ID("GET_PRODUCT_BY_ID");

    private String value;

    StoredProcedures(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return this.value;
    }

}
