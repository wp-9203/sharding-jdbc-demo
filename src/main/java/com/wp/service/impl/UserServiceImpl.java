package com.wp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wp.dao.UserMapper;
import com.wp.pojo.QueryUser;
import com.wp.pojo.User;
import com.wp.service.UserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * @author wp
 * @create 2023-12-29  10:43
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User saveUser(User user) {
        userMapper.insert(user);
        return user;

    }

    @Override
    public QueryUser queryUserInfo(Long id) {
        QueryUser queryUser = userMapper.queryUserInfo(id);
        return queryUser;
    }
}
