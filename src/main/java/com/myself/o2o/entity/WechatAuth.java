package com.myself.o2o.entity;

import java.util.Date;

/**
 * @Description: 微信账号实体类
 * @Author: liningbo
 * @CreateDate: 2018/8/29 0:05
 * @UpdateUser: liningbo
 * @UpdateDate: 2018/8/29 0:05
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class WechatAuth {
    private Long wechatAuthId;
    private String openId;
    private Date createTime;
    private PersonInfo personInfo;

    public Long getWechatAuthId() {
        return wechatAuthId;
    }

    public void setWechatAuthId(Long wechatAuthId) {
        this.wechatAuthId = wechatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
