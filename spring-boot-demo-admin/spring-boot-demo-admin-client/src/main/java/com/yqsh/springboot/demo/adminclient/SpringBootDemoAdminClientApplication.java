package com.yqsh.springboot.demo.adminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBootDemoAdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoAdminClientApplication.class, args);
    }

}
