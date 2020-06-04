package com.yqsh.springboot.demo.rabbitmq.utils;

import com.rabbitmq.client.ConfirmCallback;
import com.rabbitmq.client.Return;
import com.rabbitmq.client.ReturnCallback;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Res implements ConfirmCallback, ReturnCallback {

    @Override
    public void handle(long l, boolean b) throws IOException {
        System.out.println(l + "-------------" + b);
    }

    @Override
    public void handle(Return aReturn) {
        System.out.println(aReturn);
    }
}
