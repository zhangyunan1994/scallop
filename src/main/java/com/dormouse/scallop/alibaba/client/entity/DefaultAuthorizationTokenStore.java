/*
 * Copyright 2012 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.dormouse.scallop.alibaba.client.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * DefaultAuthorizationTokenStore
 * 
 * @author fray.yangb Aug 21, 2012 3:25:30 PM
 */
public class DefaultAuthorizationTokenStore implements AuthorizationTokenStore {
    private Map<Object, Object> cache = new HashMap<Object, Object>();

    public AuthorizationToken getToken(String authorizationCode) {
        return (AuthorizationToken) cache.get(authorizationCode);
    }

    public void storeToken(String authorizationCode, AuthorizationToken token) {
        cache.put(authorizationCode, token);
    }

    public void removeToken(String authorizationCode) {
        cache.remove(authorizationCode);
    }

    public void storeAccessToken(String uid, AuthorizationToken token) {
        cache.put(uid, token);
    }

    public AuthorizationToken getAccessToken(String uid) {
        return (AuthorizationToken) cache.get(uid);
    }
}
