package com.yqsh.springboot.demo.dubbo.consumer.controller;

import com.yqsh.springboot.demo.dubbo.common.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(version = "1.0.0.0")
    private HelloService helloService;

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name){
        return helloService.sayHello(name);
    }

}
