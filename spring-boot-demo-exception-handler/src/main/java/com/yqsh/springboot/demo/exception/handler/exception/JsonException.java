package com.yqsh.springboot.demo.exception.handler.exception;

import com.yqsh.springboot.demo.exception.handler.constant.Status;
import lombok.Getter;

@Getter
public class JsonException extends BaseException {

    public JsonException(Status status) {
        super(status);
    }

    public JsonException(Integer code, String message) {
        super(code, message);
    }
}
