package com.wp.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wp
 * @create 2024-04-11  17:58
 */
@Builder
@Data
@TableName("t_order_ext")
public class OrderExt {

    private Long id;

    private Long order_id;

    private Long order_no;

    private String product_name;

    private Long product_id;

    private BigDecimal product_price;

    private Integer product_quantity;
}
