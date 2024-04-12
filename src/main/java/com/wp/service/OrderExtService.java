package com.wp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wp.pojo.OrderExt;

/**
 * @author wp
 * @create 2024-04-11  18:09
 */
public interface OrderExtService extends IService<OrderExt> {
    void saveOrderExt(OrderExt orderExt);
}
