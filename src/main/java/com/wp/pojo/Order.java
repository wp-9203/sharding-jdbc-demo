package com.wp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author wp
 * @create 2023-12-29  11:35
 */
@Builder
@Data
@TableName("t_order")
public class Order implements Serializable {

    private Long id;

    private Long order_no;

    private BigDecimal total_amount ;

    private BigDecimal discount_amount ;

    private Long consumer_id;

    private Integer product_quantity;

    private String consumer_address;

    private String cell_phone;

    private String consumer_name;

    private BigDecimal payment_amount;

}
