package com.yqsh.springboot.demo.elasticsearch.dao;

import com.yqsh.springboot.demo.elasticsearch.entity.Customer;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import java.util.List;

public interface CustomerEsDao extends ElasticsearchCrudRepository<Customer,Long> {

    Customer findByName(String name);

    @Query("select * from Customer where name like '%1?'")
    List<Customer> findByNameIsLike(String name);

}
