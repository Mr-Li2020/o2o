package com.myself.o2o.service;

import com.myself.o2o.dto.ShopExecution;
import com.myself.o2o.entity.Shop;
import com.myself.o2o.exceptions.ShopOperationException;

import java.io.InputStream;

public interface ShopService {
    /**
     * 通过店铺Id获取店铺信息
     * @param shopId
     * @return
     */
    Shop getByShopId(long shopId);

    /**
     * 修改店铺信息,包括图片处理
     * @param shop
     * @param ShopImgInputStream
     * @param fileName
     * @return
     * @throws ShopOperationException
     */
    ShopExecution modifyShop(Shop shop,InputStream ShopImgInputStream,String fileName) throws ShopOperationException;
    /**
     * 注册店铺信息,包括图片处理
     * @param shop
     * @param shopImgInputStream
     * @param fileName
     * @return
     */
    ShopExecution addShop(Shop shop,InputStream shopImgInputStream,String fileName) throws ShopOperationException;

    /**
     * 根据shopCondition分页返回相应店铺列表
     * @param shopCondition
     * @param pageIndex
     * @param pageSize
     * @return
     */
    ShopExecution getShopList(Shop shopCondition,int pageIndex,int pageSize);
}
