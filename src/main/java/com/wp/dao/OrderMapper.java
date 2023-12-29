package com.wp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wp.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wp
 * @create 2023-12-29  11:37
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    List<Order> selectOrderList(@Param("position") Integer startPosition, @Param("size")Integer size);

    void saveOrder(Order order);
}
