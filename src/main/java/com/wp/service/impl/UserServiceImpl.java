package com.wp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wp.dao.UserMapper;
import com.wp.pojo.User;
import com.wp.service.UserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;

/**
 * @author wp
 * @create 2023-12-29  10:43
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private DataSource dataSource;

    @Resource
    private UserMapper userMapper;

    @Override
    public User saveUser(User user) {
        userMapper.insert(user);
        return user;

    }

    @Override
    public String deleteUser(Long id) {
        int deleteUser = userMapper.deleteById(id);
        return deleteUser > 0 ? "删除用户成功！！！" : "删除用户失败！！！";

    }

    @Override
    public String updateUser(User user) {
        int updateUser = userMapper.updateById(user);
        return updateUser > 0 ? "修改用户成功！！！" : "修改用户失败！！！";

    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectById(id);

    }

    @Override
    public List<User> listUsers(User user) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(user.getId()!=null,User::getId,user.getId());
        queryWrapper.eq(user.getName()!=null,User::getName,user.getName());
        return userMapper.selectList(queryWrapper);


    }
}
