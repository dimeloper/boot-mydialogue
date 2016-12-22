package com.mydialogue.controller;

import com.mydialogue.model.User;
import com.mydialogue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/login/success")
    public String loginSuccess() {
        return "Login Successful!";
    }

    @RequestMapping("/user/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/user/email", method = RequestMethod.POST)
    public User findByEmail(@RequestBody String email) {
        return userService.findByEmail(email);
    }

    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public User updateUser(@RequestBody User user) {
        return userService.save(user);
    }


}
