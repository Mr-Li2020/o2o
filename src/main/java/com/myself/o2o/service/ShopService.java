package com.myself.o2o.service;

import com.myself.o2o.dto.ShopExecution;
import com.myself.o2o.entity.Shop;

import java.io.File;

public interface ShopService {
    ShopExecution addShop(Shop shop,File shopImg);
}
