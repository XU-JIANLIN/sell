package com.xjl.sell.service;

import com.xjl.sell.dto.CartDTO;
import com.xjl.sell.pojo.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @描述:
 * @作者: XUJIANLIN
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询在架的商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
