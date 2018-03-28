/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.client.entity;


/**
 * The type Application param.
 *
 * @author yunan.zhang
 * @version 0.0.1
 */
public class ApplicationParam {

    private String appKey;
    private String appSecret;

    /**
     * Instantiates a new Application param.
     *
     * @param appKey    the app key
     * @param appSecret the app secret
     */
    public ApplicationParam(String appKey, String appSecret) {
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    /**
     * Gets app key.
     *
     * @return the app key
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * Sets app key.
     *
     * @param appKey the app key
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    /**
     * Gets app secret.
     *
     * @return the app secret
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * Sets app secret.
     *
     * @param appSecret the app secret
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
