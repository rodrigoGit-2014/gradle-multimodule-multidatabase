package com.example.repository.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

//@Configuration
//@Profile("postgres")
//@EnableJpaRepositories(basePackages = "com.example.repository.postgres")
//@ComponentScan(
//        basePackages = "com.example.repository.postgres",
//        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Repository.class),
//        useDefaultFilters = false
//)
public class PostgresConfig {
}
