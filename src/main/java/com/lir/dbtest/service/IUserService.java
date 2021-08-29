package com.lir.dbtest.service;

import com.lir.dbtest.entity.User;

import java.util.List;

public interface IUserService {

    List<User> queryUser();

    void insertUser(User user);

    void deleteAll();
}
