package com.wp.service.impl;

import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wp.dao.OrderExtMapper;
import com.wp.pojo.OrderExt;
import com.wp.service.OrderExtService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @author wp
 * @create 2024-04-11  18:10
 */
@Service
public class OrderExtServiceImpl extends ServiceImpl<OrderExtMapper, OrderExt> implements OrderExtService {

    @Resource
    private OrderExtMapper orderExtMapper;

    @Override
    public void saveOrderExt(OrderExt orderExt) {
        orderExtMapper.insert(orderExt);
    }


}
