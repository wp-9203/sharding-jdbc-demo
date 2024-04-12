package com.wp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author wp
 * @create 2024-04-12  15:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryOrderExt {
    private Long id;

    private Long orderId;

    private Long orderNo;

    private String productName;

    private Long productId;

    private BigDecimal productPrice;

    private Integer productQuantity;
}
