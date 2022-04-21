package com.xjt.service.impl;

import com.xjt.mapper.UserMapper;
import com.xjt.model.User;
import com.xjt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User findByid(int id) {
        return userMapper.findByid(id);
    }


    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    }
}
