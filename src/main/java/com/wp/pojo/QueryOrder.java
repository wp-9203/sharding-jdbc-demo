package com.wp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author wp
 * @create 2024-04-12  15:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryOrder {

    private Long id;

    private Long orderNo;

    private BigDecimal totalAmount ;

    private BigDecimal discountAmount ;

    private Long consumerId;

    private Integer productQuantity;

    private String consumerAddress;

    private String cellPhone;

    private String consumerName;

    private BigDecimal paymentAmount;

    private List<QueryOrderExt> orderExts;
}
