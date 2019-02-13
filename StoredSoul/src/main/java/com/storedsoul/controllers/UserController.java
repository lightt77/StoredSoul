package com.storedsoul.controllers;

import com.storedsoul.dao.UserDao;
import com.storedsoul.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("user")
public class UserController
{
    @Autowired
    private UserDao userDao;

    @GetMapping
    public List<User> getAllUsers() throws ExecutionException, InterruptedException
    {
        CompletableFuture<List<User>> result = userDao.findAllAsync();
        return result.get();
    }

    @PostMapping
    public void addUser(@RequestBody User user)
    {
        userDao.add(user);
    }
}
