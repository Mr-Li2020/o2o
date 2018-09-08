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
        Product product = new Product();
        product.setProductName("测试商品3");
        product.setProductDesc("测试描述3");
        product.setEnableStatus(0);
        product.setPriority(30);
        product.setCreateTime(new Date());
        product.setLastEditTime(new Date());
        product.setProductCategory(productCategory);
        product.setShop(shop);
        int effectedNum = productDao.insertProduct(product);
        assertEquals(1, effectedNum);

    }

    @Test
    public void testQueryProductByProductId() {
        long productId = 17;
        Product product = productDao.queryProductById(productId);
        assertEquals(2, product.getProductImgList().size());
    }

    @Test
    public void testUpdateProduct() {
        Shop shop = new Shop();
        shop.setShopId(1L);
        ProductCategory productCategory = new ProductCategory();
        productCategory.setProductCategoryId(2L);
        Product product = new Product();
        product.setProductId(17L);
        product.setShop(shop);
        product.setProductName("第二个商品");
        product.setProductCategory(productCategory);
        int effectedNum = productDao.updateProduct(product);
        assertEquals(1, effectedNum);
    }
}
