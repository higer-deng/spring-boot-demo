package com.yqsh.springboot.demo.rabbitmq.config;

import com.yqsh.springboot.demo.rabbitmq.utils.RabbitConsts;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue directQueue(){
        return new Queue(RabbitConsts.DIRECT_MODE_QUEUE_ONE);
    }

    @Bean
    public Queue queueTwo(){
        return new Queue(RabbitConsts.QUEUE_TWO);
    }

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(RabbitConsts.FANOUT_MODE_QUEUE);
    }

    @Bean
    public Binding bindingFanoutExchange(Queue directQueue,FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(directQueue).to(fanoutExchange);
    }

    @Bean
    public Binding bindingQueue2(Queue queueTwo,FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queueTwo).to(fanoutExchange);
    }
}
