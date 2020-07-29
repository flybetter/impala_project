package com.michael.impalaProject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.michael.impalaProject.dao")
public class ImpalaProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImpalaProjectApplication.class, args);
    }

}
