package com.wp;

import com.wp.pojo.Order;
import com.wp.pojo.UserInfo;
import com.wp.service.UserInfoService;
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
 * @create 2023-12-29  17:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {shardingJdbcApp.class})
@Slf4j
public class UserInfoTest {
    @Autowired
    UserInfoService userInfoService;

    @Test
    public void testOrderInsert(){

        List<UserInfo> orderList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {

            UserInfo userInfo = UserInfo.builder()
                    .name("张飞"+new BigDecimal(new Random().nextInt(100)))
                    .sex(i % 2)
                    .build();
            orderList.add(userInfo);
        }

        userInfoService.saveBatch(orderList);
    }

    @Test
    public void testFindByIds(){

        UserInfo userInfo = userInfoService.getUserById(1740670586886750210L);
        log.info(""+userInfo.getName());
    }
    @Test
    public void testQueryUserInfo(){
        UserInfo userInfo1 = UserInfo.builder()
                .name("张飞"+new BigDecimal(new Random().nextInt(100)))
                .sex(1)
                .build();
        UserInfo userInfo = userInfoService.getUserInfo(userInfo1);
    }
}
