/*
 * Copyright (c) 2018. author and authors
 */
package com.dormouse.scallop.alibaba.client.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;


/**
 * 授权返回结果
 * 
 * @author fray.yangb Aug 21, 2012 2:47:07 PM
 */
@Data
public class AuthorizationToken implements Serializable {

    private static final long serialVersionUID = 1L;

    private String accessToken;
    private String refreshToken;
    private long expiresIn;
    private Date expiresTime;
    private Date refreshTokenTimeout;
    private String resourceOwner;
    private String            uid;
    private long              aliId;
    private String            memberId;

    public void setExpiresIn(long accessTokenTimeout) {
        this.expiresIn = accessTokenTimeout;
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.SECOND, (int) expiresIn);
        this.expiresTime = cal.getTime();
    }

    public void setResourceOwner(String resourceOwnerId) {
        this.resourceOwner = resourceOwnerId;
    }
}
