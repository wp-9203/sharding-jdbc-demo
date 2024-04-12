package com.wp.controller;

import com.wp.pojo.User;
import com.wp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author wp
 * @create 2023-12-29  10:47
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

}
