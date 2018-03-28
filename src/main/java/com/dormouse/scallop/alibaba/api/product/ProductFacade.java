/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.api.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dormouse.scallop.alibaba.client.entity.ApplicationParam;
import com.dormouse.scallop.alibaba.client.entity.AuthorizationToken;
import com.dormouse.scallop.alibaba.constant.AliConstant;
import com.dormouse.scallop.tool.MapUtil;
import com.dormouse.scallop.alibaba.client.ApiCallService;


import java.util.HashMap;
import java.util.Map;


/**
 * The type Product facade.
 * @author yunan.zhang
 * @version 0.0.1
 */
public class ProductFacade {

    /**
     * Get list json object.
     *
     * @param applicationParam   the application param
     * @param authorizationToken the authorization token
     * @param productParam       the product param
     * @return the json object
     */
    public static JSONObject getList(ApplicationParam applicationParam, AuthorizationToken authorizationToken, ProductParam productParam){
        Map<String, String> params = new HashMap<>();
        params.put("access_token",authorizationToken.getAccessToken());
        params.put("_aop_timestamp",String.valueOf(System.currentTimeMillis()));
        params.put("categoryID", productParam.getCategoryID() + "");
        params.put("pageNo",productParam.getPageNo() + "");
        params.put("pageSize", productParam.getPageSize() + "");
        params.put("timeStamp", productParam.getTimeStamp());
        params.put("webSite", productParam.getWebSite());
        params.put("endTimeStamp", productParam.getEndTimeStamp());
        params.put("scene", productParam.getScene());
        params = MapUtil.removeAllNullValue(params);
        String result= ApiCallService.callApi(AliConstant.Product.NAMESPACE + AliConstant.Product.PRODUCT_GETLIST + applicationParam.getAppKey(), applicationParam.getAppSecret(), params);
        JSONObject jsonObject= JSON.parseObject(result);
        return jsonObject;
    }
}
