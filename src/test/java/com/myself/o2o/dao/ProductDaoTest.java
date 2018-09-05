package com.myself.o2o.dao;

import com.myself.o2o.BaseTest;
import com.myself.o2o.entity.Product;
import com.myself.o2o.entity.ProductCategory;
import com.myself.o2o.entity.Shop;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ProductDaoTest extends BaseTest {
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInsertProduct() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setShopId(1L);
        Shop shop = new Shop();
        shop.setShopId(1L);
        Product product1 = new Product();
        product1.setProductName("测试商品1");
        product1.setProductDesc("测试描述1");
        product1.setEnableStatus(0);
        product1.setPriority(10);
        product1.setCreateTime(new Date());
        product1.setLastEditTime(new Date());
        product1.setProductCategory(productCategory);
        product1.setShop(shop);

        Product product2 = new Product();
        product2.setProductName("测试商品2");
        product2.setProductDesc("测试描述2");
        product2.setEnableStatus(0);
        product2.setPriority(20);
        product2.setCreateTime(new Date());
        product2.setLastEditTime(new Date());
        product2.setProductCategory(productCategory);
        product2.setShop(shop);

        int effectedNum1 = productDao.insertProduct(product1);
        assertEquals(1, effectedNum1);
        int effectedNum2 = productDao.insertProduct(product2);
        assertEquals(1, effectedNum2);

    }
}
