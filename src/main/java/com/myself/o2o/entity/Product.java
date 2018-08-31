package com.myself.o2o.entity;

import java.util.Date;
import java.util.List;

/**
* @Description:    商品实体类
* @Author:         liningbo
* @CreateDate:     2018/8/29 15:51
* @UpdateUser:     liningbo
* @UpdateDate:     2018/8/29 15:51
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Product {
    private Long productId;
    private String productName;
    private String productDesc;
    //简略图地址
    private String imgAddr;
    private String normalPrice;
    private String promotionPrice;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    // 0:下架 1:在前台系统展示
    private Integer enableStatus;
    //商品图片
    private List<ProductImg> productImgList;
    //商品类别
    private ProductCategory productCategory;
    //该商品属于哪个店铺
    private Shop shop;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }

    public String getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
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

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public List<ProductImg> getProductImgList() {
        return productImgList;
    }

    public void setProductImgList(List<ProductImg> productImgList) {
        this.productImgList = productImgList;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
