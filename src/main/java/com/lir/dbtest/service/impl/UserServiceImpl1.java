package com.lir.dbtest.service.impl;

import com.lir.dbtest.entity.User;
import com.lir.dbtest.mapper.db1.UserMapper1;
import com.lir.dbtest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService1")
public class UserServiceImpl1 implements IUserService {

    @Autowired
    UserMapper1 userMapper1;

    @Override
    public List<User> queryUser() {
        return userMapper1.queryUser();
    }

    @Override
    public void insertUser(User user) {
        userMapper1.insertUser(user);
    }

    @Override
    public void deleteAll() {
        userMapper1.deleteAll();

    }
}
