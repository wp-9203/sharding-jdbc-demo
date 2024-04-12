package com.wp.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author wp
 * 分表使用
 * @create 2024-04-11  10:27
 */
public class OrderTablePreciseAlgorithm implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        Long value = preciseShardingValue.getValue();
        String logicTableName = preciseShardingValue.getLogicTableName();
        String tableName = logicTableName+"_"+(value % 3 +1);
        if(collection.contains(tableName)){
            return tableName;
        } else {
            throw new RuntimeException("No table route info for :"+tableName);
        }

    }
}
