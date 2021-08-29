package com.lir.dbtest.service.impl;

import com.lir.dbtest.entity.Man;
import com.lir.dbtest.mapper.db1.ManMapper1;
import com.lir.dbtest.service.IManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Target;

@Service("manService1")
public class ManServiceImpl1 implements IManService {

    @Autowired
    ManMapper1 manMapper1;



    @Override
    public void insertMan(Man man) {
        manMapper1.insertMan(man);
    }

    @Override
    public void deleteAll() {
        manMapper1.deleteAll();
    }
}
