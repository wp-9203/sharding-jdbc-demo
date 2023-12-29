package com.wp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

/**
 * @author wp
 * @create 2023-12-29  17:30
 */
@Data
@Builder
@TableName("t_user_info")
public class UserInfo {

    private Long id;

    private String name;

    private int sex;
}
