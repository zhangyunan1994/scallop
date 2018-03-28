/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dormouse.scallop.alibaba.client.ApiCallService;

import java.util.HashMap;
import java.util.Map;


/**
 * The type Auth service.
 *
 * @author yunan.zhang
 * @version 0.0.1
 */
public class AuthService {

    /**
     * 通过临时令牌换取授权令牌
     *
     * @param host             请求的主机名，包括域名和端口
     * @param params           请求参数，必填client_id、client_secret、redirect_uri和code，scope和view可选
     * @param needRefreshToken 是否需要返回refreshToken
     * @return getToken请求的json串 string
     */
    public static String getToken(String host, Map<String, String> params, boolean needRefreshToken){
        String urlHead = "https://" + host + "/openapi/";
        String namespace = "system.oauth2";
        String name = "getToken";
        int version = 1;
        String protocol = "http";
        if(params != null){
            if(params.get("client_id") == null || params.get("client_secret") == null
                    || params.get("redirect_uri") == null || params.get("code") == null){
                System.out.println("params is invalid, lack neccessary key!");
                return null;
            }
            params.put("grant_type", "authorization_code");
            params.put("need_refresh_token", Boolean.toString(needRefreshToken));
            String appKey = params.get("client_id");
            String urlPath = CommonUtil.buildInvokeUrlPath(namespace, name, version, protocol, appKey);
            String result = ApiCallService.callApi(urlHead, urlPath, null, params);
            return result;
        }
        return null;
    }

    /**
     * 通过长时令牌换取授权令牌
     *
     * @param host   请求的主机名，包括域名和端口
     * @param params 请求参数，必填client_id、client_secret、redirect_uri和refresh_token，scope和view可选
     * @return string
     */
    public static String refreshToken(String host, Map<String, String> params){
        String urlHead = "https://" + host + "/openapi/";
        String namespace = "system.oauth2";
        String name = "getToken";
        int version = 1;
        String protocol = "param2";
        if(params != null){
            if(params.get("client_id") == null || params.get("client_secret") == null
                    || params.get("redirect_uri") == null || params.get("refresh_token") == null){
                System.out.println("params is invalid, lack neccessary key!");
                return null;
            }
            params.put("grant_type", "refresh_token");
            String appKey = params.get("client_id");
            String urlPath = CommonUtil.buildInvokeUrlPath(namespace, name, version, protocol, appKey);
            String result = ApiCallService.callApi(urlHead, urlPath, null, params);
            return result;
        }
        return null;
    }

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        String host = "gw.open.1688.com";//国际交易请用"gw.api.alibaba.com"
        String client_id = "3036311";
        String appSecret = "QYJGODutb6x";
        String redirect_uri = "https://no1jack.4kb.cn/";
        /*
        //Test getting token from code
        String code = "yourCode";
        Map<String, String> params1 = new HashMap<String, String>();
        params1.put("client_id", client_id);
        params1.put("redirect_uri", redirect_uri);
        params1.put("client_secret", appSecret);
        params1.put("code", code);
        String getTokenResult = getToken(host, params1, true);
        System.out.println("用临时令牌换取授权令牌的返回结果：" + getTokenResult);
        JSONObject jsonObject = JSONObject.parseObject(getTokenResult);
        System.out.println("refreshToken:" + jsonObject.get("refresh_token"));
        System.out.println("accessToken:" + jsonObject.get("access_token"));
        */

        //Test getting token from refreshToken
        String refreshToken = "4306d4e0-2b13-4316-9cf2-f437d7a40094";
        //refreshToken=jsonObject.get("refresh_token").toString();
        Map<String, String> params = new HashMap<String, String>();
        params.put("client_id", client_id);
        params.put("redirect_uri", redirect_uri);
        params.put("client_secret", appSecret);
        params.put("refresh_token", refreshToken);
        String refreshTokenResult = refreshToken(host, params);
        System.out.println("用长时令牌换取授权令牌的返回结果：" + refreshTokenResult);
        JSONObject jsonObject1 = JSON.parseObject(refreshTokenResult);
        System.out.println("accessToken:" + jsonObject1.get("access_token"));
        //test call api
        String urlPath = "param2/2/system/currentTime/" + client_id;
        String urlHead = "http://" + host + "/openapi/";
        Map<String, String> param = new HashMap<String, String>();
        param.put("access_token", (String)jsonObject1.get("access_token"));
        String result = ApiCallService.callApi(urlHead, urlPath, appSecret, param);
        System.out.println(result);
    }
}
