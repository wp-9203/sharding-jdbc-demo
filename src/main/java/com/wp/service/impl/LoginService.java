package com.wp.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wp.dao.LoginMapper;
import com.wp.pojo.LoginInfo;
import com.wp.service.LoginInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author wp
 * @create 2024-04-11  14:57
 */
@Service
public class LoginService extends ServiceImpl<LoginMapper,LoginInfo> implements LoginInfoService {
    @Resource
    private LoginMapper loginMapper;

    @Override
    public void saveLoginInfo(LoginInfo loginInfo) {
        loginMapper.insert(loginInfo);
    }

    @Override
    public List<Map<String, Object>> queryLoginInfo(Long user_id) {
        QueryWrapper query = new QueryWrapper();
        query.eq("user_id",120242);
        List<Map<String,Object>> list = loginMapper.selectList(query);
        return list;
    }
}