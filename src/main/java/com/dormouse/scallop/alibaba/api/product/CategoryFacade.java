/*
 * Copyright (c) 2018. author and authors
 */

package com.dormouse.scallop.alibaba.api.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sparrow.sdk.ApiCallService;
import com.sparrow.sdk.alibaba.client.entity.ApplicationParam;
import com.sparrow.sdk.alibaba.client.entity.AuthorizationToken;
import com.sparrow.sdk.alibaba.constant.AliConstant;
import com.sparrow.sdk.alibaba.util.MapUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张瑀楠 zyndev@gmail.com
 * @version 1.0.0
 * 2018/2/20 下午1:08
 */
public class CategoryFacade {

    public static JSONObject getList(ApplicationParam applicationParam, AuthorizationToken authorizationToken, CategoryParam categoryParam) {
        Map<String, String> params = new HashMap<>();
        params.put("access_token", authorizationToken.getAccessToken());
        params.put("_aop_timestamp", String.valueOf(System.currentTimeMillis()));
        params.put("categoryID", categoryParam.getCategoryID() + "");
        params.put("webSite", categoryParam.getWebSite());
        params = MapUtil.removeAllNullValue(params);
        String result = ApiCallService.callApi(AliConstant.Product.NAMESPACE + AliConstant.Product.CATEGORY_GET + applicationParam.getAppKey(), applicationParam.getAppSecret(), params);
        JSONObject jsonObject = JSON.parseObject(result);
        return jsonObject;
    }


}
