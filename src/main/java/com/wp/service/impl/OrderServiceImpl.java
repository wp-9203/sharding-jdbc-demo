package com.wp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wp.dao.OrderMapper;
import com.wp.pojo.Order;
import com.wp.pojo.QueryOrder;
import com.wp.service.OrderService;
import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wp
 * @create 2023-12-29  11:41
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public void saveOrder(Order order) {
        orderMapper.insert(order);
    }

    @Override
    public List<QueryOrder> queryOrder(Long userId) {
        return orderMapper.queryOrder(userId);
    }
}
