package com.wp.config;

import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author wp
 *
 * @create 2024-04-11  14:29
 */
public class ComplexShardingAlgorithm implements ComplexKeysShardingAlgorithm<Long> {
    @Override
    public Collection<String> doSharding(Collection<String> collection, ComplexKeysShardingValue<Long> complexKeysShardingValue) {
        Long user_id = complexKeysShardingValue.getColumnNameAndShardingValuesMap().get("user_id").iterator().next();

        Long order_no = complexKeysShardingValue.getColumnNameAndShardingValuesMap().get("order_no").iterator().next();

        String logicTableName = complexKeysShardingValue.getLogicTableName();

        Collection<String> result = new HashSet<>();
        if(String.valueOf(user_id).substring(4,6).equals("01")){
            result.add("t_order_ext_"+(order_no%4+1));
        } else {
            result.add("t_order_ext_"+(order_no%4+1));
        }
        return result;
    }
}
