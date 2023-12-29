package com.wp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wp.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wp
 * @create 2023-12-29  17:31
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    UserInfo queryUserInfo(UserInfo userInfo);
}
