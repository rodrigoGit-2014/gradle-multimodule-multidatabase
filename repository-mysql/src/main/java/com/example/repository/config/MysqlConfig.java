package com.example.repository.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@Configuration
//@Profile("mysql")
//@EnableJpaRepositories(basePackages = "com.example.repository.mysql")
////@ComponentScan(
//        basePackages = "com.example.repository.mysql",
//        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Repository.class),
//        useDefaultFilters = false
//)
public class MysqlConfig {
}
