/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.api;


import java.util.HashMap;
import java.util.Map;


/**
 * 客户端/WEB端授权服务类，主要用于用户在使用客户端或者Web端类型的app时进行授权
 * 注意：在应用市场售卖的app请勿使用这种方式，请使用托管式授权
 *
 * @author yunan.zhang
 * @version 0.0.1
 */
public class ClientAuthService {

    /**
     * 返回客户端和Web端授权时获取临时令牌code的url
     * @param host 请求的主机名，包括域名和端口
     * @param params 请求参数map，包括client_id,site,redirect_uri以及可选的state、scope和view
     * @param appSecretKey app签名密钥
     * @return 请求的完整url，用户在浏览器中打开此url然后输入自己的用户名密码进行授权，之后就会得到code
     */
    public static String getClientAuthUrl(String host, Map<String, String> params, String appSecretKey){
        String url = "http://" + host + "/auth/authorize.htm";
        if(params == null){
            return null;
        }
        if(params.get("client_id") == null || params.get("site") == null
                || params.get("redirect_uri") == null){
            System.out.println("params is invalid, lack neccessary key!");
            return null;
        }
        String signature = CommonUtil.signatureWithParamsOnly(params, appSecretKey);
        params.put("_aop_signature", signature);
        return CommonUtil.getWholeUrl(url, params);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String host = "gw.open.1688.com";//国际交易请用"gw.api.alibaba.com"
        String site = "china";//国际交易请用"aliexpress"
        String client_id = "3036311";
        String appSecret = "QYJGODutb6x";
        //若为客户端授权，那么回调地址可以是三种形式，具体可参考文档：
        //(1)urn:ietf:wg:oauth:2.0:oob
        //(2)http://localhost:port
        //(3)http://gw.open.1688.com/auth/authCode.htm（国际交易请用"gw.api.alibaba.com"）
        //若为WEB端授权，那么回调地址应该是app的入口地址
        String redirect_uri = "https://no1jack.4kb.cn/auth/ali?a=1";
        String state = "test";//用户自定义参数，建议填写

        //测试获取客户端授权的临时令牌code
        Map<String, String> params2 = new HashMap<String, String>();
        params2.put("site", site);
        params2.put("client_id", client_id);
        params2.put("redirect_uri", redirect_uri);
        params2.put("state", state);
        String getCodeForClientResult = getClientAuthUrl(host, params2, appSecret);
        System.out.println("请在浏览器中访问如下地址并输入网站用户名密码进行授权: " + getCodeForClientResult);

    }

}
