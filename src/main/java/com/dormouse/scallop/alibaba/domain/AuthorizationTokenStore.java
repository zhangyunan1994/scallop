/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain;


public interface AuthorizationTokenStore {
    /**
     * 根据授权Code获取授权信息，主要是RefreshToken
     *
     * @param authorizationCode
     * @return {@link AuthorizationToken}
     */
    public AuthorizationToken getToken(String authorizationCode);

    /**
     * 保存授权信息
     *
     * @param authorizationCode
     * @param token
     */
    public void storeToken(String authorizationCode, AuthorizationToken token);

    /**
     * 从store中移除该code所对应的token
     *
     * @param authorizationCode
     */
    public void removeToken(String authorizationCode);

    /**
     * 保存用户的token
     *
     * @param uid
     * @param token
     */
    public void storeAccessToken(String uid, AuthorizationToken token);

    /**
     * 获取用户的access token
     *
     * @param uid
     * @return
     */
    public AuthorizationToken getAccessToken(String uid);
}
