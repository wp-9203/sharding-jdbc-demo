package com.wp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wp.pojo.Dict;

/**
 * @author wp
 * @create 2024-04-12  9:54
 */
public interface DictService extends IService<Dict> {

    void saveDict(Dict dict);

    String queryDictValue(String dictCode);


}
