package com.wp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wp.pojo.QueryUser;
import com.wp.pojo.User;

import java.util.List;

/**
 * @author wp
 * @create 2023-12-29  10:41
 */
public interface UserService extends IService<User> {

    User saveUser(User user);

    QueryUser queryUserInfo(Long id);

}
