/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;


/**
 * The type Trade contact.
 */
public class TradeContact implements Serializable {

    private static final long serialVersionUID = 1L;

    private String phone;//	String	否	联系电话
    private String fax;//	String	否	传真
    private String email;//	String	否	邮箱
    private String imInPlatform;//	String	否	联系人在平台的IM账号
    private String name;//	String	否	联系人名称
    private String mobile;//	String	否	联系人手机号

    /**
     * Instantiates a new Trade contact.
     */
    public TradeContact() {
    }

    /**
     * Instantiates a new Trade contact.
     *
     * @param phone        the phone
     * @param fax          the fax
     * @param email        the email
     * @param imInPlatform the im in platform
     * @param name         the name
     * @param mobile       the mobile
     */
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

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets fax.
     *
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets fax.
     *
     * @param fax the fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets im in platform.
     *
     * @return the im in platform
     */
    public String getImInPlatform() {
        return imInPlatform;
    }

    /**
     * Sets im in platform.
     *
     * @param imInPlatform the im in platform
     */
    public void setImInPlatform(String imInPlatform) {
        this.imInPlatform = imInPlatform;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
