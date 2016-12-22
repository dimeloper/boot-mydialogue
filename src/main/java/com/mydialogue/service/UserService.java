package com.mydialogue.service;

import com.mydialogue.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    User findByEmail(String email);

    List<User> findAll();
}
