package com.xjl.sell.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @描述:
 * @作者: XUJIANLIN
 */
@Getter
@AllArgsConstructor
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;

    private String message;

}
