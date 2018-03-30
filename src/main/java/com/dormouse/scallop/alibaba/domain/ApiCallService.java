/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain;


import com.dormouse.scallop.alibaba.api.CommonUtil;
import com.dormouse.scallop.alibaba.constant.AliConstant;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * The type Api call service.
 *
 * @author yunan.zhang
 * @version 0.0.1
 */
public class ApiCallService {
    /**
     * 调用api测试
     *
     * @param urlHead      请求的url到openapi的部分，如http://gw.open.1688.com/openapi/
     * @param urlPath      protocol/version/namespace/name
     * @param appSecretKey 测试的app密钥，如果为空表示不需要签名
     * @param params       api请求参数map。如果api需要用户授权访问，那么必须完成授权流程，params中必须包含access_token参数
     * @return json格式的调用结果 string
     */
    public static String callApi(String urlHead, String urlPath, String appSecretKey, Map<String, String> params) {

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();

        FormBody.Builder builder = new FormBody.Builder();

        if (params != null) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                builder.add(entry.getKey(), entry.getValue());
            }
        }

        if (appSecretKey != null) {
            builder.add("_aop_signature", CommonUtil.signatureWithParamsAndUrlPath(urlPath, params, appSecretKey));
        }

        FormBody formBody = builder.build();

        Request request = new Request.Builder()
                .addHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-8")
                .url(urlHead + urlPath)
                .post(formBody)
                .build();


        try (Response response = okHttpClient.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Call api string.
     *
     * @param urlPath      the url path
     * @param appSecretKey the app secret key
     * @param params       the params
     * @return the string
     */
    public static String callApi(String urlPath, String appSecretKey, Map<String, String> params) {
        urlPath = AliConstant.API_PROTOCOL + urlPath;
        return callApi(AliConstant.API_DOMAIN, urlPath, appSecretKey, params);
    }
}
