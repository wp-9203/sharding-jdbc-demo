package com.wp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wp.dao.DictMapper;
import com.wp.pojo.Dict;
import com.wp.service.DictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wp
 * @create 2024-04-12  9:55
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper,Dict> implements DictService {

    @Resource
    private DictMapper dictMapper;
    @Override
    public void saveDict(Dict dict) {
        dictMapper.insert(dict);
    }

    @Override
    public String queryDictValue(String dictCode) {
        String dictValue = dictMapper.queryDictValue(dictCode);
        return dictValue;
    }
}
