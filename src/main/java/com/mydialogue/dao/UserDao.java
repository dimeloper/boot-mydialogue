package com.mydialogue.dao;

import com.mydialogue.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User save(User user);

    User findByEmail(String email);

    List<User> findAll();
}
