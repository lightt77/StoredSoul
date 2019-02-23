package com.storedsoul.services;

import com.storedsoul.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService
{
    @Autowired
    LoginDao loginDao;

    public boolean authenticateCredentials(String userName, String password)
    {
        if(userName == null || password == null || userName.isEmpty() || password.isEmpty())
            return false;

        return loginDao.validateCredentials(userName, password);
    }
}
