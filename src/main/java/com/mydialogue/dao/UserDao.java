package com.mydialogue.dao;

import com.mydialogue.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User save(User user);

    User findByUserName(String userName);
}
