package com.wp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wp.pojo.LoginInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wp
 * @create 2024-04-11  14:59
 */
@Mapper
public interface LoginMapper extends BaseMapper<LoginInfo> {

}
