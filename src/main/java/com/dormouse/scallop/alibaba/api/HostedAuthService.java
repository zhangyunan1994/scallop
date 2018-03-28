/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.api;

/**
 * 托管式授权服务类，只适用于在应用市场售卖的app
 * 注意：在应用市场售卖的app请使用托管式授权
 */


import java.util.HashMap;
import java.util.Map;

/**
 * 托管式授权服务类，只适用于在应用市场售卖的app
 * 注意：在应用市场售卖的app请使用托管式授权
 */
public class HostedAuthService {
    /**
     * 返回托管式授权流程中获取code这一步的url
     *
     * @param host         请求的主机名，包括域名和端口
     * @param params       请求参数map，包括client_id,redirect_uri以及可选的state、scope和view
     * @param appSecretKey app签名密钥
     * @return 请求的完整url，用户在浏览器中打开此url然后输入自己的用户名密码进行授权，之后就会得到code
     */
    public static String getHostedAuthUrl(String host, Map<String, String> params, String appSecretKey) {
        if (params == null) {
            return null;
        }
        String url = "https://" + host + "/openapi/";
        String namespace = "system.oauth2";
        String name = "startAuth";
        int version = 1;
        String protocol = "param";
        if (params.get("client_id") == null || params.get("redirect_uri") == null) {
            System.out.println("params is invalid, lack neccessary key!");
            return null;
        }
        params.put("client_user_id", "testApiTools");
        params.put("response_type", "code");
        params.put("need_refresh_token", "true");
        String appKey = params.get("client_id");
        String urlPath = CommonUtil.buildInvokeUrlPath(namespace, name, version, protocol, appKey);
        String signature = CommonUtil.signatureWithParamsAndUrlPath(urlPath, params, appSecretKey);
        params.put("_aop_signature", signature);
        url += urlPath;
        return CommonUtil.getWholeUrl(url, params);
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        String host = "gw.open.1688.com";//国际交易请用"gw.api.alibaba.com"
        String client_id = "3036311";
        String appSecret = "QYJGODutb6x";
        String redirect_uri = "https://no1jack.4kb.cn/auth/ali?a=1";//填写app入口url
        String state = "test";//用户自定义参数，建议填写

        //测试获取托管式授权的临时令牌code
        Map<String, String> params = new HashMap<String, String>();
        params.put("client_id", client_id);
        params.put("redirect_uri", redirect_uri);
        params.put("state", state);
        String startAuthResult = getHostedAuthUrl(host, params, appSecret);
        System.out.println("请在浏览器中访问如下地址并输入网站用户名密码进行授权: " + startAuthResult);
    }
}
