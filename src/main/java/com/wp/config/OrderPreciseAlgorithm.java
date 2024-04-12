package com.wp.config;


import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author wp
 * 自定义order订单表的分片算法---分库使用
 * @create 2024-04-11  9:56
 */
public class OrderPreciseAlgorithm implements PreciseShardingAlgorithm<Long> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        Long value = preciseShardingValue.getValue();
        String dbName = value % 2 ==0 ? "db-2":"db-1";
        if(collection.contains(dbName)){
            System.out.println("datasource name :"+dbName);
            return dbName;
        } else {
            throw new RuntimeException("No datasource route info for :"+dbName);
        }
    }
}
