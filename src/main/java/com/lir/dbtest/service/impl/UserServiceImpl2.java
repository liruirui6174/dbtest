package com.lir.dbtest.service.impl;

import com.lir.dbtest.entity.User;
import com.lir.dbtest.mapper.db2.UserMapper2;
import com.lir.dbtest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService2")
public class UserServiceImpl2 implements IUserService {

    @Autowired
    UserMapper2 userMapper2;

    @Override
    public List<User> queryUser() {
        return userMapper2.queryUser();
    }

    @Override
    public void insertUser(User user) {
        userMapper2.insertUser(user);
    }

    @Override
    public void deleteAll() {
        userMapper2.deleteAll();
    }
}
