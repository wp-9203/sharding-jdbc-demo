package com.wp;

import com.wp.pojo.Dict;
import com.wp.service.DictService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wp
 * @create 2024-04-12  9:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {shardingJdbcApp.class})
@Slf4j
public class DictTest {
    @Autowired
    private DictService dictService;

    @Test
    public void testSaveDict(){
        Dict dict = Dict.builder()
                .dict_code("app_url")
                .dict_value("http://192.168.103.100:8081/app/api/")
                .dict_desc("app")
                .build();

        dictService.saveDict(dict);
    }

    @Test
    public void testQueryDict(){
        String test_url = dictService.queryDictValue("test_url");
        System.out.println("test_url:"+test_url);
    }
}
