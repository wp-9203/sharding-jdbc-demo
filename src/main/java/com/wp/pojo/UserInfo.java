package com.wp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author wp
 * @create 2023-12-29  17:30
 */
@Data
@Builder
@TableName("t_user_info")
public class UserInfo {

    private Long id;

    private String id_number;

    private int sex;

    private String expir_time;

    private Integer age;

    private String birth_time;

    private String address;

    private String cell_phone;
}
