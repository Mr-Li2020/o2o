package com.myself.o2o.dao;

import com.myself.o2o.BaseTest;
import com.myself.o2o.entity.ProductCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductCategoryDaoTest extends BaseTest {
    @Autowired
    private ProductCategoryDao productCategoryDao;
    @Test
    public void testQueryProductCategoryByShopId(){
        long shopId=1;
        List<ProductCategory> productCategoryList = productCategoryDao.queryProductCategoryList(shopId);
        System.out.println("该店铺自定义类别数为:"+productCategoryList.size());
    }
    @Test
    public void testBatchInsertProductCategory(){
        ProductCategory productCategory1 = new ProductCategory();
        productCategory1.setProductCategoryName("商品类别4");
        productCategory1.setPriority(30);
        productCategory1.setShopId(1L);
        productCategory1.setCreateTime(new Date());
        ProductCategory productCategory2 = new ProductCategory();
        productCategory2.setProductCategoryName("商品类别5");
        productCategory2.setPriority(40);
        productCategory2.setShopId(1L);
        productCategory2.setCreateTime(new Date());
        ArrayList<ProductCategory> productCategoryArrayList = new ArrayList<>();
        productCategoryArrayList.add(productCategory1);
        productCategoryArrayList.add(productCategory2);
        int effectedNum = productCategoryDao.batchInsertProductCategory(productCategoryArrayList);
        assertEquals(2,effectedNum);
    }
    @Test
    public void testDeleteProductCategory(){
        long shopId = 1;
        List<ProductCategory> productCategoryList = productCategoryDao.queryProductCategoryList(shopId);

        for(ProductCategory pc:productCategoryList){
            if("店铺类别11".equals(pc.getProductCategoryName())||"店铺类别10".equals(pc.getProductCategoryName())){
                int effectedNum = productCategoryDao.deleteProductCategory(pc.getProductCategoryId(), shopId);
                assertEquals(1,effectedNum);
            }
        }
    }
}
