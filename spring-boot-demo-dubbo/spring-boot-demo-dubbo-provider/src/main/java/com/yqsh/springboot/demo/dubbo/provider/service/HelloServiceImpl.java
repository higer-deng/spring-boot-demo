package com.yqsh.springboot.demo.dubbo.provider.service;

import com.yqsh.springboot.demo.dubbo.common.service.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Service(version = "1.0.0.0")
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        String say = "";
        if(StringUtils.isEmpty(name)) {
            say = "World";
        }
        return " Hello " + say;
    }

}
