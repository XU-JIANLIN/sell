package com.xjl.sell.service;

import com.xjl.sell.pojo.ProductCategory;

import java.util.List;

/**
 * @描述: 类目
 * @作者: XUJIANLIN
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> CategoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
