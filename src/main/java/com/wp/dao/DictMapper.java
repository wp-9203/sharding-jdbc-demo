package com.wp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wp.pojo.Dict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wp
 * @create 2024-04-12  9:55
 */
@Mapper
public interface DictMapper extends BaseMapper<Dict> {
    String queryDictValue(@Param("dictCode")String dictCode);
}
