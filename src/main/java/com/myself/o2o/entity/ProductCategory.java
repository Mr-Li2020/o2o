package com.myself.o2o.entity;

import java.util.Date;

/**
* @Description:    商品类别
* @Author:         liningbo
* @CreateDate:     2018/8/29 15:33
* @UpdateUser:     liningbo
* @UpdateDate:     2018/8/29 15:33
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ProductCategory {
    private Long productCategoryId;
    private Long shopId;
    private String productCategoryName;
    private Integer priority;
    private Date createTime;

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
