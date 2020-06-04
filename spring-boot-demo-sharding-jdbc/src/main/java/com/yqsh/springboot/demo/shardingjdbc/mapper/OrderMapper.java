package com.yqsh.springboot.demo.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yqsh.springboot.demo.shardingjdbc.model.Order;
import org.springframework.stereotype.Component;

@Component
public interface OrderMapper extends BaseMapper<Order> {
}
