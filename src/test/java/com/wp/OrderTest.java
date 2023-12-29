package com.wp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wp.pojo.Order;
import com.wp.service.OrderService;
import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


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


    @Test
    public void testOrderInsert(){

        List<Order> orderList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {

            Order order = Order.builder()
                    .totalPrice(new BigDecimal(new Random().nextInt(100)))
                    .mark("SUCCESS")
                    .orderNo(2023122900+i)
                    .build();
            orderList.add(order);
        }

        orderService.saveBatch(orderList);
        /*Order order = Order.builder()
                .price(new BigDecimal(10))
                .status("SUCCESS")
                .userId(1L)
                .build();
        orderService.save(order);*/
    }


    @Test
    public void testFindByIds(){
        Long[] ids = {1599673041937334275L,1599673040175726594L};
        List<Order> orderByIds = orderService.getOrderByIds(Arrays.asList(ids));
        for (Order order : orderByIds) {
            log.info(order.toString());
        }
    }

    @Test
    public void testOrderPage(){
        IPage<Order> orderPage = orderService.getOrderPage(1, 10);
        for (Order order : orderPage.getRecords()) {
            log.info(order.toString());
        }
    }

    @Test
    public void testOrderList(){
        List<Order> orderList = orderService.getOrderList(1, 10);
        for (Order order : orderList) {
            log.info(order.toString());
        }
    }



}
