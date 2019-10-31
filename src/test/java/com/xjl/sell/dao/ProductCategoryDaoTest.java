package com.xjl.sell.dao;

import com.xjl.sell.pojo.ProductCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


/**
 * @描述:
 * @作者: XUJIANLIN
 */
@SpringBootTest
class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao procdao;


    @Test
    public void Test(){
        ProductCategory productCategory = procdao.getOne(1);


        ProductCategory article = procdao.findById(1).get();

//        System.out.println(productCategory.getCategoryName());
        System.out.println("---------------------");
        System.out.println(article);
        article.setCategoryType(10);
        procdao.save(article);
    }
    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(10,12,4);
        List<ProductCategory> plist = procdao.findByCategoryTypeIn(list);

    }

}