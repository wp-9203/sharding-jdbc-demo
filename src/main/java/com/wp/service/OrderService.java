package com.wp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wp.pojo.Order;

import java.util.List;

/**
 * @author wp
 * @create 2023-12-29  11:40
 */
public interface OrderService extends IService<Order> {
    /**
     * 通过ids查询Order
     * @param ids
     * @return
     */
    List<Order> getOrderByIds(List<Long> ids);

    IPage<Order> getOrderPage(Integer page, Integer size);

    List<Order> getOrderList(Integer page,Integer size);

    void saveOrder(Order order);

}
