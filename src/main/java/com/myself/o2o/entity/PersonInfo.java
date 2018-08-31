package com.myself.o2o.entity;

import java.util.Date;

/**
* @Description:    用户实体类
* @Author:         liningbo
* @CreateDate:     2018/8/28 23:52
* @UpdateUser:     liningbo
* @UpdateDate:     2018/8/28 23:52
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class PersonInfo {
    private Long userId;
    private String name;
    private String profileImg;
    private String email;
    //性别
    private String gender;
    //用户状态  如果账号被禁用就不能登录我们的商城
    private Integer enableStatus;
    //1.顾客 2.店家 3.超级管理员
    private Integer userType;
    private Date createTime;
    //最后一次操作的时间
    private Date lastEditTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
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
}
