package com.yqsh.springboot.demo.elasticsearch.service;

import com.yqsh.springboot.demo.elasticsearch.entity.Customer;

public interface CustomerEsService {

    void save(Customer customer);

    Customer findById(Long id);

}
