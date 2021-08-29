package com.lir.dbtest.service.impl;

import com.lir.dbtest.entity.Man;
import com.lir.dbtest.mapper.db1.ManMapper1;
import com.lir.dbtest.mapper.db2.ManMapper2;
import com.lir.dbtest.service.IManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("manService2")
public class ManServiceImpl2 implements IManService {

    @Autowired
    ManMapper2 manMapper2;



    @Override
    public void insertMan(Man man) {
        manMapper2.insertMan(man);
    }

    @Override
    public void deleteAll() {
        manMapper2.deleteAll();
    }
}
