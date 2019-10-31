package com.xjl.sell.exception;

import com.xjl.sell.enums.ResultEnum;
import lombok.AllArgsConstructor;

/**
 * @描述:
 * @作者: XUJIANLIN
 */

public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();

    }

    public SellException(Integer code, String message){
        super(message);
        this.code = code;

    }

}
