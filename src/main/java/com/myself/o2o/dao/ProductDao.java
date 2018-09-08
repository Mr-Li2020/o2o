package com.myself.o2o.dao;

import com.myself.o2o.dto.ImageHolder;
import com.myself.o2o.dto.ProductExecution;
import com.myself.o2o.entity.Product;
import com.myself.o2o.exceptions.ProductOperationException;

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


}
