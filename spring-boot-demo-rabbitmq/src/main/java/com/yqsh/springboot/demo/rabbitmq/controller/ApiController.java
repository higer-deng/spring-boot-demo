package com.yqsh.springboot.demo.rabbitmq.controller;

import com.yqsh.springboot.demo.rabbitmq.utils.RabbitConsts;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ApiController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("/queue")
    public String sendDirectQueue() {
        String s = UUID.randomUUID().toString();
        rabbitTemplate.convertAndSend(RabbitConsts.DIRECT_MODE_QUEUE_ONE, s);
        return s;
    }

    @RequestMapping("/fanout")
    public String fanoutExchange(){
        String s = UUID.randomUUID().toString();
        rabbitTemplate.convertAndSend(RabbitConsts.FANOUT_MODE_QUEUE,"",s);
        return s;
    }

}
