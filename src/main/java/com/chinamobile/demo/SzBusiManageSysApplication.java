package com.chinamobile.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chinamobile.demo.dao")
public class SzBusiManageSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(SzBusiManageSysApplication.class, args);
    }

}
