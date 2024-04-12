package com.wp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wp
 * @create 2023-12-29  10:40
 */
@Data
@Builder
@TableName("t_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String user_name;
    private String account;
    private String password;
    private Integer role_id;
}
