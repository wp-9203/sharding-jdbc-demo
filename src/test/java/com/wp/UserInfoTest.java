package com.wp;

import com.wp.pojo.Order;
import com.wp.pojo.User;
import com.wp.pojo.UserInfo;
import com.wp.service.UserInfoService;
import com.wp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

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

    @Autowired
    UserService userService;

   @Test
    public void testSaveUserInfo(){
       Random random = new Random();

       Date date = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
       String format = sdf.format(date).substring(6);

       Long userId = Long.parseLong("2023"+ (random.nextInt(10000)+10000)+format);

       User user = User.builder()
               .id(userId)
               .user_name("武彤彤")
               .account("marly")
               .password("123456")
               .role_id(1)
               .build();
       UserInfo userInfo = UserInfo.builder()
               .id(userId)
               .sex(0)
               .id_number("420100200101071203")
               .age(25)
               .birth_time("20010107")
               .address("武汉市武昌区武珞路189号")
               .expir_time("20100909")
               .cell_phone("18609098765")
               .build();

       userService.saveUser(user);
       userInfoService.saveUser(userInfo);

   }
}
