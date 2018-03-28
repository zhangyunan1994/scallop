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
 * desc :
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * date  : 2017/11/26 下午4:49
 * todo  :
 */
public class ProductFacade {

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
