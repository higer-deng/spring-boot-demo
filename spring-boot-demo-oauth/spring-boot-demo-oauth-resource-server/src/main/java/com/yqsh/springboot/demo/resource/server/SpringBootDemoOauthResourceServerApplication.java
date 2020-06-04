package com.yqsh.springboot.demo.resource.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class SpringBootDemoOauthResourceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoOauthResourceServerApplication.class,args);
    }

}
