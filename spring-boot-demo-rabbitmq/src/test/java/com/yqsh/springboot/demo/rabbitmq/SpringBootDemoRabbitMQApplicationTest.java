package com.yqsh.springboot.demo.rabbitmq;

import com.yqsh.springboot.demo.rabbitmq.utils.RabbitConsts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoRabbitMQApplicationTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSend(){
        rabbitTemplate.convertAndSend(RabbitConsts.DIRECT_MODE_QUEUE_ONE,UUID.randomUUID().toString());

        rabbitTemplate.convertAndSend(RabbitConsts.FANOUT_MODE_QUEUE,"",UUID.randomUUID().toString());
        //rabbitTemplate.convertAndSend("test1","test1Route",UUID.randomUUID().toString());
        //Object o = rabbitTemplate.convertSendAndReceive("test", "testRoute", UUID.randomUUID().toString());
        //System.out.println(o);
    }
}
