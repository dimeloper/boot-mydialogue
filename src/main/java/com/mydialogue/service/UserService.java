package com.mydialogue.service;

import com.mydialogue.model.User;

public interface UserService {

    User save(User user);

    User findByUserName(String userName);
}
