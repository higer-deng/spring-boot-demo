package com.yqsh.springboot.demo.rabbitmq.core;

import com.rabbitmq.client.Channel;
import com.yqsh.springboot.demo.rabbitmq.utils.RabbitConsts;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RabbitListener(queues = RabbitConsts.QUEUE_TWO)
public class ConsumerTwo {

    @RabbitHandler
    public void consume(String connect,Message message, Channel channel) {
        long deliveryTag = message.getMessageProperties().getDeliveryTag();
        try {
            System.out.println("Consumer-Two : "+connect);
            System.out.println("Consumer-Two : "+message);
            channel.basicAck(deliveryTag,false);
        } catch (IOException e) {
            try {
                channel.basicRecover();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
