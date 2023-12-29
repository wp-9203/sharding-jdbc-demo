package com.wp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wp.pojo.UserInfo;

/**
 * @author wp
 * @create 2023-12-29  17:32
 */
public interface UserInfoService extends IService<UserInfo> {

    UserInfo saveUser(UserInfo user);


    UserInfo getUserById(Long id);

    UserInfo getUserInfo(UserInfo userInfo);
}
