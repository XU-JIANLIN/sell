package com.xjl.sell.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @描述: 商品
 * @作者: XUJIANLIN
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    /**商品名称。*/
    private String productName;

    /**单价.*/
    private BigDecimal productPrice;

    /**库存.*/
    private Integer productStock;

    /**描述.*/
    private String productDescription;

    /**小图.*/
    private String productIcon;

    /**状态，0正常，1下架 */
    private Integer productStatus;

    /**类图编号.*/
    private Integer categoryType;
}
