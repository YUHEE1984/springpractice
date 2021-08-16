package me.yuhee.practice.controllers;

import me.yuhee.practice.models.User;
import me.yuhee.practice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public User getCustomerById(@PathVariable long userId) {
        return userService.getUserDetail(userId);
    }
}

