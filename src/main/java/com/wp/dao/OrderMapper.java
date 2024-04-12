package com.wp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wp.pojo.Order;
import com.wp.pojo.QueryOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wp
 * @create 2023-12-29  11:37
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    List<QueryOrder> queryOrder(@Param("userId")Long userId);


}
