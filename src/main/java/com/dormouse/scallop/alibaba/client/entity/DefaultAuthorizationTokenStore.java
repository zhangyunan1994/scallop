/*
 * Copyright (c) 2018. author and authors.
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
    private Map<Object, Object> cache = new HashMap<>();

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
