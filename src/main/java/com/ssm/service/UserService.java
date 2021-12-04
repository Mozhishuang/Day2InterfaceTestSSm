package com.ssm.service;

import com.ssm.bean.User;


public interface UserService {
    User findAllById(Integer id);
    int login(String name, String password);
}
