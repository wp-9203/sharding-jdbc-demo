package com.wp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wp
 * @create 2023-12-29  11:35
 */
@Builder
@Data
@TableName("t_order")
public class Order {

    private Long id;

    private int orderNo;

    private BigDecimal totalPrice ;

    private String mark;

}
