package com.xjl.sell.service.impl;

import com.xjl.sell.pojo.ProductCategory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLOutput;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @描述:
 * @作者: XUJIANLIN
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;
    @Test
    void findOne() {
        System.out.println( categoryService.findOne(1));
    }

    @Test
    void findAll() {
        System.out.println(categoryService.findAll());
    }

    @Test
    void findByCategoryTypeIn() {
        System.out.println(categoryService.findByCategoryTypeIn(Arrays.asList(10,12)));
    }

    @Test
    void save() {

        ProductCategory pro = new ProductCategory();
        pro.setCategoryType(14);
        pro.setCategoryId(3);
        pro.setCategoryName("大家都爱");
        System.out.println(categoryService.save(pro));
    }
}