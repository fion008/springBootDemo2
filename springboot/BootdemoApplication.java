package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot.*"})  //指定扫描包路径
@MapperScan(value="com.springboot.mapper")
public class BootdemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(BootdemoApplication.class, args);
    }

}
