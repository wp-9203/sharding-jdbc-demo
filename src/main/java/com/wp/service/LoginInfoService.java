package com.wp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wp.pojo.LoginInfo;

import java.util.*;

/**
 * @author wp
 * @create 2024-04-11  14:55
 */
public interface LoginInfoService extends IService<LoginInfo> {

    void saveLoginInfo(LoginInfo loginInfo);

    List<Map<String,Object>> queryLoginInfo(Long user_id);
}
