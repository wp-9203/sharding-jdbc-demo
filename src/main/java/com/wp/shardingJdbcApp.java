package com.wp;


import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wp
 * @create 2023-12-29  10:50
 */
@Slf4j
@SpringBootApplication
public class shardingJdbcApp {
    public static void main(String[] args) {
        SpringApplication.run(shardingJdbcApp.class,args);

    }
}
