package com.storedsoul.controllers;

import com.storedsoul.dao.UserDao;
import com.storedsoul.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController
{
    @Autowired
    private UserDao userDao;

    @GetMapping
    public List<User> getAllUsers()
    {
        return userDao.findAll();
    }

    @PostMapping
    public void addUser(@RequestBody User user)
    {
        userDao.add(user);
    }
}
