package com.lir.dbtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lir.dbtest.mapper")
public class LiruiDbtestApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(LiruiDbtestApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
