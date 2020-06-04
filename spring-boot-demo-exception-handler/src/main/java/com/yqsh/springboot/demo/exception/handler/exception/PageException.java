package com.yqsh.springboot.demo.exception.handler.exception;

import com.yqsh.springboot.demo.exception.handler.constant.Status;
import lombok.Getter;

@Getter
public class PageException extends BaseException {

    public PageException(Status status) {
        super(status);
    }

    public PageException(Integer code, String message) {
        super(code, message);
    }
}
