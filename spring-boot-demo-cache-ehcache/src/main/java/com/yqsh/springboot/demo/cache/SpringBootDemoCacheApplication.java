package com.yqsh.springboot.demo.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootDemoCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoCacheApplication.class,args);
    }

}
