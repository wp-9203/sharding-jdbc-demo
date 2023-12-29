package com.wp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wp.dao.UserInfoMapper;
import com.wp.pojo.UserInfo;
import com.wp.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wp
 * @create 2023-12-29  17:33
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Resource
    UserInfoMapper userInfoMapper;

    @Override
    public UserInfo saveUser(UserInfo user) {
        int insert = userInfoMapper.insert(user);
        return user;
    }

    @Override
    public UserInfo getUserById(Long id) {
        return userInfoMapper.selectById(id);
    }

    @Override
    public UserInfo getUserInfo(UserInfo userInfo) {
        return userInfoMapper.queryUserInfo(userInfo);
    }
}
