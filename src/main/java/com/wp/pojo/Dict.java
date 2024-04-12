package com.wp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

/**
 * @author wp
 * @create 2024-04-12  9:52
 */
@Builder
@Data
@TableName("t_dict")
public class Dict {

    private Integer id;

    private String dict_code;

    private String dict_value;

    private String dict_desc;
}
