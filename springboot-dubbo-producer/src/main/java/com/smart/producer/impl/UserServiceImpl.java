package com.smart.producer.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.smart.mapper.UserMapper;
import com.smart.model.User;
import com.smart.service.IUserService;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Author: gaowenming
 * Description:
 * Date: Created in 21:09 2017/7/15.
 */
@Component
@Service(interfaceClass = IUserService.class)//dubbo的service注解
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) throws Exception {
        return userMapper.get(id);
    }
}
