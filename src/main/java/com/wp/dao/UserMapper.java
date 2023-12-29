package com.wp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wp.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wp
 * @create 2023-12-29  10:40
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
