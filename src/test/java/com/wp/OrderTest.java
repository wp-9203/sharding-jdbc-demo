package com.wp;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wp.pojo.*;
import com.wp.service.LoginInfoService;
import com.wp.service.OrderExtService;
import com.wp.service.OrderService;
import com.wp.service.UserService;
import com.wp.util.SnowflakeIdWorker;
import lombok.extern.slf4j.Slf4j;

import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;


/**
 * @author wp
 * @create 2023-12-29  11:45
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {shardingJdbcApp.class})
@Slf4j
public class OrderTest {


    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderExtService orderExtService;

    @Autowired
    private UserService userService;

    @Test
    public void testQueryOrderDetail(){
        Long userId = 20231312812113239l;
        List<QueryOrder> orders = orderService.queryOrder(userId);
        System.out.println(JSONObject.toJSONString(orders));
    }

    @Test
    public void testSaveOrder(){
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0,0);
        Long userId = 20231312812113239l;
        QueryUser user = userService.queryUserInfo(userId);

        Random random = new Random();


        Long orderId = idWorker.nextId();
            Order order = Order.builder()
                    .id(orderId)
                    .order_no(System.currentTimeMillis())
                    .consumer_id(user.getId())
                    .consumer_name(user.getUserName())
                    .cell_phone(user.getCellPhone())
                    .consumer_address(user.getAddress())
                    .total_amount(new BigDecimal(635))
                    .payment_amount(new BigDecimal(530))
                    .discount_amount(new BigDecimal(105))
                    .product_quantity(2)
                    .build();
            OrderExt orderExt = OrderExt.builder()
                    .id(idWorker.nextId())
                    .order_id(orderId)
                    .product_id(210110010001L)
                    .product_name("耐克-男鞋")
                    .product_price(new BigDecimal(450))
                    .product_quantity(1)
                    .order_no(System.currentTimeMillis()+random.nextInt(1000))
                    .build();
        OrderExt orderExt1 = OrderExt.builder()
                .id(idWorker.nextId())
                .order_id(orderId)
                .product_id(210110010005L)
                .product_name("耐克-男袜")
                .product_price(new BigDecimal(80))
                .product_quantity(1)
                .order_no(System.currentTimeMillis()+random.nextInt(1000))
                .build();

       orderService.saveOrder(order);
       orderExtService.saveOrderExt(orderExt);
        orderExtService.saveOrderExt(orderExt1);
    }




}
