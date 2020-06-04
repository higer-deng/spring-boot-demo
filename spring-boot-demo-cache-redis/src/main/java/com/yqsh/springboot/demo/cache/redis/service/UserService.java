package com.yqsh.springboot.demo.cache.redis.service;

import com.yqsh.springboot.demo.cache.redis.entity.User;

public interface UserService {

    User saveOrUpdate(User user);

    User get(Long id);

    void delete(Long id);

}
