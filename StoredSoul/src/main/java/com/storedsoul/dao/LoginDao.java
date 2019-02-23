package com.storedsoul.dao;

import org.springframework.stereotype.Repository;

@Repository
public class LoginDao
{
    public boolean validateCredentials(String userName, String password)
    {
        return true;
    }
}
