package com.myself.o2o.dao;

import com.myself.o2o.dto.ImageHolder;
import com.myself.o2o.dto.ProductExecution;
import com.myself.o2o.entity.Product;
import com.myself.o2o.exceptions.ProductOperationException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    /**
     * 插入商品
     *
     * @param product
     * @return
     */
    int insertProduct(Product product);

    /**
     * 通过商品Id查询唯一的商品信息
     *
     * @param productId
     * @return
     */
    Product queryProductById(long productId);

    /**
     * 更新商品信息
     *
     * @param product
     * @return
     */
    int updateProduct(Product product);

    /**
     * 查询商品列表并分页,可输入的条件有:商品名(模糊) 商品状态  店铺Id 店铺类别
     *
     * @param productCondition
     * @param rowIndex
     * @param pageSize
     * @return
     */
    List<Product> queryProductList(@Param("productCondition") Product productCondition, @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

    /**
     * 查询对应的商品总数
     *
     * @param productCondition
     * @return
     */
    int queryProductCount(@Param("productCondition") Product productCondition);

    /**
     * 删除商品类别之前,将商品类别ID置为空
     *
     * @param productCategoryId
     * @return
     */
    int updateProductCategoryToNull(long productCategoryId);

}
