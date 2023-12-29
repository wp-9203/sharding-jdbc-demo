package com.wp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wp.dao.OrderMapper;
import com.wp.pojo.Order;
import com.wp.service.OrderService;
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
    public List<Order> getOrderByIds(List<Long> ids) {
        if(CollectionUtils.isEmpty(ids)){
            return null;
        }
        return this.listByIds(ids);
    }

    @Override
    public IPage<Order> getOrderPage(Integer page, Integer size) {
        LambdaQueryWrapper<Order> lqw = new LambdaQueryWrapper();
        lqw.orderByDesc(Order::getTotalPrice);


        return page(new Page<>(page,size),lqw);


    }

    @Override
    public List<Order> getOrderList(Integer page, Integer size) {
        return this.baseMapper.selectOrderList((page-1)*size,size);
    }

    @Override
    public void saveOrder(Order order) {
        orderMapper.saveOrder(order);
    }
}
