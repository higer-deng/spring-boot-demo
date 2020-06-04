package com.yqsh.springboot.demo.cache.service;

import com.yqsh.springboot.demo.cache.entity.User;

public interface UserService {

    User saveOrUpdate(User user);

    User get(Long id);

    void delete(Long id);

}
