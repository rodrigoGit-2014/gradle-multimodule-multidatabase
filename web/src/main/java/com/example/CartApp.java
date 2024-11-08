package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;

@SpringBootApplication
//@ComponentScan(
//        basePackages = "com.example.repository",
//        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Repository.class)
//)
@ComponentScan(basePackages = {"com.example", "com.example.repository.mysql"})
public class CartApp {
    public static void main(String[] args) {
        SpringApplication.run(CartApp.class, args);
    }
}
