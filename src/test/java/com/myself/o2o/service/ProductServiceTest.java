package com.myself.o2o.service;

import com.myself.o2o.BaseTest;
import com.myself.o2o.dto.ImageHolder;
import com.myself.o2o.dto.ProductExecution;
import com.myself.o2o.entity.Product;
import com.myself.o2o.entity.ProductCategory;
import com.myself.o2o.entity.Shop;
import com.myself.o2o.enums.ProductStateEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductServiceTest extends BaseTest {
    @Autowired
    private ProductService productService;

    @Test
    public void testaddProduct() throws FileNotFoundException {
        // 创建shopId为1且productCategoryId为1的商品实例并给其成员变量赋值
        Product product = new Product();
        Shop shop = new Shop();
        shop.setShopId(1L);
        ProductCategory pc = new ProductCategory();
        pc.setProductCategoryId(2L);
        product.setShop(shop);
        product.setProductCategory(pc);
        product.setProductName("测试商品5");
        product.setProductDesc("测试描述5");
        product.setPriority(20);
        product.setCreateTime(new Date());
        product.setEnableStatus(ProductStateEnum.SUCCESS.getState());
        //创建缩略图文件流
        File thumbnailFile = new File("E:/photo/RB.jpg");
        InputStream is = new FileInputStream(thumbnailFile);
        ImageHolder thumbnail = new ImageHolder(thumbnailFile.getName(), is);
        //创建两个商品详情图文件流并将它们添加到详情图列表中
        File productImg1 = new File("E:/photo/xiaokeai.jpg");
        InputStream is1 = new FileInputStream(productImg1);
        File productImg2 = new File("E:/photo/Like.jpg");
        InputStream is2 = new FileInputStream(productImg2);
        List<ImageHolder> imageHolderList = new ArrayList<ImageHolder>();
        imageHolderList.add(new ImageHolder(productImg1.getName(), is1));
        imageHolderList.add(new ImageHolder(productImg2.getName(), is2));
        //添加商品,并进行验证
        ProductExecution productExecution = productService.addProduct(product, thumbnail, imageHolderList);
        assertEquals(ProductStateEnum.SUCCESS.getState(), productExecution.getState());

    }

    @Test
    public void testModeifyProduct() throws FileNotFoundException {
        // 创建shopId为1且productCategoryId为2的商品实例并给其成员变量赋值
        Product product = new Product();
        Shop shop = new Shop();
        shop.setShopId(1L);
        ProductCategory pc = new ProductCategory();
        pc.setProductCategoryId(2L);
        product.setProductId(1L);
        product.setShop(shop);
        product.setProductCategory(pc);
        product.setProductName("正式的商品");
        product.setProductDesc("正式的商品");
        // 创建缩略图文件流
        File thumbnailFile = new File("E:/photo/newo2o.jpg");
        InputStream is = new FileInputStream(thumbnailFile);
        ImageHolder thumbnail = new ImageHolder(thumbnailFile.getName(), is);
        // 创建两个商品详情图文件流并将他们添加到详情图列表中
        File productImg1 = new File("E:/photo/RB.jpg");
        InputStream is1 = new FileInputStream(productImg1);
        File productImg2 = new File("E:/photo/newo2o.jpg");
        InputStream is2 = new FileInputStream(productImg2);
        List<ImageHolder> productImgList = new ArrayList<ImageHolder>();
        productImgList.add(new ImageHolder(productImg1.getName(), is1));
        productImgList.add(new ImageHolder(productImg2.getName(), is2));
        // 添加商品并验证
        ProductExecution pe = productService.modifyProduct(product, thumbnail, productImgList);
        assertEquals(ProductStateEnum.SUCCESS.getState(), pe.getState());
    }
}
