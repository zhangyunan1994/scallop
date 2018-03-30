/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/30 下午9:08
 * todo  :
 */
public class TradeContact implements Serializable {

    private static final long serialVersionUID = 1L;

    private String phone;//	String	否	联系电话
    private String fax;//	String	否	传真
    private String email;//	String	否	邮箱
    private String imInPlatform;//	String	否	联系人在平台的IM账号
    private String name;//	String	否	联系人名称
    private String mobile;//	String	否	联系人手机号

    public TradeContact() {
    }

    public TradeContact(String phone, String fax, String email, String imInPlatform, String name, String mobile) {
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.imInPlatform = imInPlatform;
        this.name = name;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "TradeContact{" +
                "phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", imInPlatform='" + imInPlatform + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImInPlatform() {
        return imInPlatform;
    }

    public void setImInPlatform(String imInPlatform) {
        this.imInPlatform = imInPlatform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
