package com.yqsh.springboot.demo.elasticsearch.service;

import com.yqsh.springboot.demo.elasticsearch.SpringBootDemoElasticSearchApplicationTest;
import com.yqsh.springboot.demo.elasticsearch.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerEsServiceTest extends SpringBootDemoElasticSearchApplicationTest {

    @Autowired
    private CustomerEsService customerEsService;

    @Test
    public void testSave() {
        Customer customer = new Customer();
        customer.setId(1L);
        customer.setName("test");
        customer.setAge("20");
        customer.setIdcard("111111111111111111");
        customerEsService.save(customer);
    }

    @Test
    public void testFindById() {
        Customer customer = customerEsService.findById(1L);
        System.out.println(customer);
    }

}
