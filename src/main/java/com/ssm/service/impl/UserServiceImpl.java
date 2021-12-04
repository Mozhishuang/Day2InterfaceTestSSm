package com.ssm.service.impl;

import com.ssm.bean.User;
import com.ssm.dao.UserDao;
import com.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 2.service
 * 先在service接口添加方法，给service加上impl包存放service接口类的实现方法
 * 例如userservice在impl里面存放userserviceImpl.在业务层实现类里面书写业务
 * 逻辑调用dao（mapper）层代码
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User findAllById(Integer id) {
        return userDao.findAllById(id);
    }

    @Override
    public int login(String name, String password) {
        return userDao.login(name,password);
    }
}
