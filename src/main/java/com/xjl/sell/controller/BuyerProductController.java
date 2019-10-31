package com.xjl.sell.controller;

import com.xjl.sell.VO.ProductInfoVO;
import com.xjl.sell.VO.ProductVO;
import com.xjl.sell.VO.ResultVO;
import com.xjl.sell.pojo.ProductCategory;
import com.xjl.sell.pojo.ProductInfo;
import com.xjl.sell.service.CategoryService;
import com.xjl.sell.service.ProductService;
import com.xjl.sell.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @描述:
 * @作者: XUJIANLIN
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list() {

        //查询所有上架的商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //查询类目（一次性查询）
        List<Integer> categoryType = productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryType);

        //数据拼接
        List<ProductVO> productVOList = new ArrayList<>();
        for(ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for(ProductInfo productInfo : productInfoList){
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    //将对象复制到另一个对象中
                    BeanUtils.copyProperties(productInfo, productInfoVO );
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        ResultVO result = new ResultVO();


        return ResultVOUtil.success(productVOList);


    }
}
