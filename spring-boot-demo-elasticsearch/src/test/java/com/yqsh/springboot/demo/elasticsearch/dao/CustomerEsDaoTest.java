package com.yqsh.springboot.demo.elasticsearch.dao;

import com.yqsh.springboot.demo.elasticsearch.SpringBootDemoElasticSearchApplicationTest;
import com.yqsh.springboot.demo.elasticsearch.entity.Customer;
import org.apache.lucene.search.SortField;
import org.elasticsearch.common.util.iterable.Iterables;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CustomerEsDaoTest extends SpringBootDemoElasticSearchApplicationTest {

    @Autowired
    private CustomerEsDao customerEsDao;

    @Test
    public void testCustomerEs() {
        long id = 1L;
        Customer customer = customerEsDao.findById(id).get();
        System.out.println(customer);
        boolean exists = customerEsDao.existsById(id);
        System.out.println(exists);

        long count = customerEsDao.count();
        System.out.println(count);
    }

    @Test
    public void testSave() {
        Customer customer = new Customer();
        customer.setId(5L);
        customer.setName("test5");
        customer.setAge("15");
        customer.setIdcard("555555555555555555");
        Customer save = customerEsDao.save(customer);
        System.out.println(save);
    }

    @Test
    public void testFindAll(){
        Iterable<Customer> all = customerEsDao.findAll();
        all.forEach(System.out::println);
    }

    @Test
    public void testDeleteById(){
        customerEsDao.deleteById(1L);
    }

    @Test
    public void testDeleteAll() {
       /* List<Customer> list = new ArrayList<>();
        list.add(new Customer(2L,"test2","22","222222222222222222"));
        list.add(new Customer(3L,"test3","33","333333333333333333"));
        customerEsDao.deleteAll(list);
        */
        customerEsDao.deleteAll();
    }

    @Test
    public void testBatchSave(){
        List<Customer> list = new ArrayList<>();
        for(int i = 0;i < 50000;i++) {
            int age = new Random().nextInt(60);
            list.add(new Customer(i + 1L,"test"+i,age+"","11111111111111"+i));
        }
        customerEsDao.saveAll(list);
    }

    @Test
    public void testFindAllSort(){
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        Iterable<Customer> all = customerEsDao.findAll(sort);
        all.forEach(System.out::println);
    }

    @Test
    public void testFindByPage(){
        Pageable pageable = PageRequest.of(10,50, Sort.Direction.ASC,"id");
        Page<Customer> page = customerEsDao.findAll(pageable);
        System.out.println(page);
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
        System.out.println(page.getNumber());
        System.out.println(page.getContent());
        System.out.println(page.getSize());

    }

    @Test
    public void testFindByName() {
        Customer customer = customerEsDao.findByName("test49999");
        System.out.println(customer);
    }

    @Test
    public void testFindByNameLike() {
        List<Customer> byNameLike = customerEsDao.findByNameIsLike("49999");
        System.out.println(byNameLike);
    }

}
