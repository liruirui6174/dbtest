package com.lir.dbtest.mapper.db2;

import com.lir.dbtest.entity.User;

import java.util.List;

public interface UserMapper2 {

    List<User> queryUser();

    void insertUser(User user);

    void deleteAll();
}
