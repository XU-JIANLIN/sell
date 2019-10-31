package com.xjl.sell.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @描述: 购物车
 * @作者: XUJIANLIN
 */
@Data
@AllArgsConstructor
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private  Integer productQuantity;
}
