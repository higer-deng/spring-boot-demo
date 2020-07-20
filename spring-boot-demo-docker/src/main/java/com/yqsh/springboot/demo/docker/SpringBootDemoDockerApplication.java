package com.yqsh.springboot.demo.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDemoDockerApplication {


    @RequestMapping("/")
    public String home(){
        return "Hello Dorker World !";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoDockerApplication.class, args);
    }

}
