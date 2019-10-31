package com.xjl.sell.dao;

import com.xjl.sell.pojo.ProductInfo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
class ProductInfoDaoTest {

    @Autowired
    private ProductInfoDao productInfoDao;
    @Test
    void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("鸡蛋炒米粉");
        productInfo.setProductPrice(new BigDecimal(8.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("好吃又好玩");
        productInfo.setProductIcon("www.gdpuxjl.top");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(10);
        ProductInfo productInfo1 = productInfoDao.save(productInfo);
        if (productInfo1!=null) {
            System.out.println("新增成功！");
        }else{
            System.out.println("新增失败！");
        }
    }
    @Test
    void findByProductStatus() {
        List<ProductInfo> infoList = productInfoDao.findByProductStatus(0);
        for(ProductInfo productInfo : infoList){
            System.out.println(productInfo);
        }
    }
}