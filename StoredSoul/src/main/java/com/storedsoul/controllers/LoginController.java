package com.storedsoul.controllers;

import com.storedsoul.models.User;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/login")
@RestController
public class LoginController
{
    @PostMapping
    @CrossOrigin(origins = "*")
    public boolean login(@RequestBody User user)
    {
        if(user.getEmailId().equals("abc") && user.getPassword().equals("xyz"))
            return true;

        return false;
    }
}
