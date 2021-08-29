package com.lir.dbtest.mapper.db1;

import com.lir.dbtest.entity.User;

import java.util.List;

public interface UserMapper1 {

    List<User> queryUser();

    void insertUser(User user);

    void deleteAll();
}
