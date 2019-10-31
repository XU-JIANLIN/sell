package com.xjl.sell.service.impl;

import com.xjl.sell.pojo.ProductInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @描述:
 * @作者: XUJIANLIN
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;
    @Test
    void findOne() {
        ProductInfo productInfo = productService.findOne("123456");
        Assert.assertEquals("123456", productInfo.getProductId() );

    }

    @Test
    void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0, productInfoList.size());
    }

    @Test
    void findAll() {
        PageRequest request = PageRequest.of(0,2);
        Page<ProductInfo> productInfos = productService.findAll(request);
        System.out.println(productInfos.getTotalElements());
    }

    @Test
    void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("234567");
        productInfo.setProductName("三丝炒米粉");
        productInfo.setProductPrice(new BigDecimal(8.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("满满");
        productInfo.setProductIcon("www.gdpuxjl.top");
        productInfo.setProductStatus(1);
        productInfo.setCategoryType(10);
        ProductInfo result = productService.save(productInfo);

        Assert.assertNotNull(result);

    }
}