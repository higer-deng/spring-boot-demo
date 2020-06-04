package com.yqsh.springboot.demo.elasticsearch.service.impl;

import com.yqsh.springboot.demo.elasticsearch.dao.CustomerEsDao;
import com.yqsh.springboot.demo.elasticsearch.entity.Customer;
import com.yqsh.springboot.demo.elasticsearch.service.CustomerEsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerEsServiceImpl implements CustomerEsService {

    @Autowired
    private CustomerEsDao customerEsDao;

    @Override
    public void save(Customer customer) {
        customerEsDao.save(customer);
    }


    @Override
    public Customer findById(Long id) {
        return customerEsDao.findById(id).get();
    }
}
