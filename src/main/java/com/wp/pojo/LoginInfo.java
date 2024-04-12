package com.wp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author wp
 * @create 2024-04-11  14:55
 */
@Builder
@Data
@TableName("t_login_info")
public class LoginInfo {

    private Long id;

    private Long user_id;

    private String ip;

    private Date login_time;
}
