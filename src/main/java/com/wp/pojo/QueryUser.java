package com.wp.pojo;

import com.sun.tracing.dtrace.ArgsAttributes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wp
 * @create 2024-04-12  14:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryUser {
    private Long id;

    private String userName;

    private String account;

    private String password;

    private Integer role_id;

    private String id_number;

    private int sex;

    private String expir_time;

    private Integer age;

    private String birth_time;

    private String address;

    private String cellPhone;
}
