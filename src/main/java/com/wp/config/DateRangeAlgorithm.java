package com.wp.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;


import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;


/**
 * @author wp
 * 根据日期范围分片 -- 分表
 * @create 2024-04-11  14:37
 */
public class DateRangeAlgorithm implements PreciseShardingAlgorithm<Date> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Date> preciseShardingValue) {
        Date value = preciseShardingValue.getValue();
        String tableName = preciseShardingValue.getLogicTableName()+"_"+getYearMonth(value);
        if(collection.contains(tableName)){
            return tableName;
        } else {

        }
        throw new RuntimeException("No table route info for:"+tableName);
    }

    public String getYearMonth(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
        return format.format(date);
    }

    public static void main(String[] args) {
        Date date = new Date();
        DateRangeAlgorithm rangeAlgorithm = new DateRangeAlgorithm();
        System.out.println(rangeAlgorithm.getYearMonth(date));
    }
}
