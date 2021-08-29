package com.lir.dbtest.controller;

import com.lir.dbtest.entity.Man;
import com.lir.dbtest.entity.User;
import com.lir.dbtest.service.IManService;
import com.lir.dbtest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cglib.core.Local;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/ctrl")
public class TestController {
    @Autowired
    @Qualifier("userService1")
    IUserService userService1;

    @Autowired
    @Qualifier("userService2")
    IUserService userService2;

    @Autowired
    @Qualifier("manService1")
    IManService manService1;

    @Autowired
    @Qualifier("manService2")
    IManService manService2;

    @RequestMapping("/testQuery1")
    public List<User> testQuery1() {

       return  userService1.queryUser();

    }

    @RequestMapping("/testQuery2")
    public List<User> testQuery2() {

        return  userService2.queryUser();

    }


    @RequestMapping("/testInsert")
    @Transactional
    public void testInsert() {
        User user = new User();
        user.setName("11111");
        user.setSex((byte)1);
        user.setAge(1);
        user.setAddr("11111");
        userService1.insertUser(user);
        userService2.insertUser(user);
        int a = 1/0;
    }

    @RequestMapping("/testInsert2")
    @Transactional
    public void testInsert2() {
        User user = new User();
        user.setName("11111");
        user.setSex((byte)1);
        user.setAge(1);
        user.setAddr(LocalDateTime.now().toString());

        Man man = new Man();
        man.setName("11111");
        man.setSex((byte)1);
        man.setAge(1);
        man.setAddr(LocalDateTime.now().toString());
        manService1.insertMan(man);
        manService2.insertMan(man);
        userService1.insertUser(user);
        userService2.insertUser(user);
    }

    @RequestMapping("/testInsert3")
    @Transactional
    public void testInsert3() {
        User user = new User();
        user.setName("11111");
        user.setSex((byte)1);
        user.setAge(1);
        user.setAddr(LocalDateTime.now().toString());

        Man man = new Man();
        man.setName("11111");
        man.setSex((byte)1);
        man.setAge(1);
        man.setAddr(LocalDateTime.now().toString());
        manService1.insertMan(man);
        userService2.insertUser(user);
        userService1.insertUser(user);
        manService2.insertMan(man);

        int a = 1/0;
    }

    @RequestMapping("/testInsert4")
    public void testInsert4() {
        User user = new User();
        user.setName("11111");
        user.setSex((byte)1);
        user.setAge(1);
        user.setAddr(LocalDateTime.now().toString());

        Man man = new Man();
        man.setName("11111");
        man.setSex((byte)1);
        man.setAge(1);
        man.setAddr(LocalDateTime.now().toString());
        manService1.insertMan(man);
        userService2.insertUser(user);
        userService1.insertUser(user);
        manService2.insertMan(man);

        int a = 1/0;
    }

    @RequestMapping("/testDeleteAll")
    public void deleteAll() {
        manService1.deleteAll();
        manService2.deleteAll();
        userService1.deleteAll();
        userService2.deleteAll();
    }

}
