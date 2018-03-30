/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.api.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dormouse.scallop.alibaba.domain.ApplicationParam;
import com.dormouse.scallop.alibaba.domain.AuthorizationToken;
import com.dormouse.scallop.alibaba.constant.AliConstant;
import com.dormouse.scallop.tool.MapUtil;
import com.dormouse.scallop.alibaba.domain.ApiCallService;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Category facade.
 *
 * @author yunan.zhang
 * @version 1.0.0
 */
public class CategoryFacade {

    /**
     * Gets list.
     *
     * @param applicationParam   the application param
     * @param authorizationToken the authorization token
     * @param categoryParam      the category param
     * @return the list
     */
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
