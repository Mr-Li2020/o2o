package com.myself.o2o.service;

import com.myself.o2o.dto.ShopExecution;
import com.myself.o2o.entity.Shop;

import java.io.InputStream;

public interface ShopService {
    ShopExecution addShop(Shop shop,InputStream shopImgInputStream,String fileName);
}
