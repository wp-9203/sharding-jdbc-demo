package com.wp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wp.pojo.Order;
import com.wp.pojo.QueryOrder;

import java.util.List;

/**
 * @author wp
 * @create 2023-12-29  11:40
 */
public interface OrderService extends IService<Order> {
    void saveOrder(Order order);

    List<QueryOrder> queryOrder(Long userId);
}
