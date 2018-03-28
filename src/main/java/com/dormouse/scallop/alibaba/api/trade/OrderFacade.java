package com.dormouse.scallop.alibaba.api.trade;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dormouse.scallop.alibaba.client.entity.ApplicationParam;
import com.dormouse.scallop.alibaba.client.entity.AuthorizationToken;
import com.dormouse.scallop.alibaba.client.entity.trade.TradeInfo;
import com.dormouse.scallop.alibaba.constant.AliConstant;
import com.dormouse.scallop.tool.MapUtil;
import com.dormouse.sdk.ApiCallService;

import java.util.List;
import java.util.Map;

/**
 * The type Order facade.
 *
 * @author yunan.zhang
 * @version 0.0.1
 */
public class OrderFacade {

    /**
     * Gets seller order list.
     *
     * @param applicationParam   the application param
     * @param authorizationToken the authorization token
     * @param orderParam         the order param
     * @return the seller order list
     */
    public static List<TradeInfo> getSellerOrderList(ApplicationParam applicationParam, AuthorizationToken
            authorizationToken, OrderParam orderParam) {
        JSONObject result = getSellerOrderListJson(applicationParam, authorizationToken, orderParam);
        List<TradeInfo> tradeInfoList = result.getJSONArray("result").toJavaList(TradeInfo.class);
        return tradeInfoList;
    }

    /**
     * Gets seller order list json.
     *
     * @param applicationParam   the application param
     * @param authorizationToken the authorization token
     * @param orderParam         the order param
     * @return the seller order list json
     */
    public static JSONObject getSellerOrderListJson(ApplicationParam applicationParam, AuthorizationToken
            authorizationToken, OrderParam orderParam) {
        Map<String, String> params = new HashMap<>();
        params.put("access_token", authorizationToken.getAccessToken());
        params.put("_aop_timestamp", String.valueOf(System.currentTimeMillis()));
        params.put("createEndTime", orderParam.getCreateEndTime());
        params.put("createStartTime", orderParam.getCreateStartTime());
        // params.put("isHis", orderParam.getHis().toString());
        params.put("isHis", "true");
        params.put("modifyEndTime", orderParam.getModifyEndTime());
        params.put("modifyStartTime", orderParam.getModifyStartTime());
        params.put("orderStatus", orderParam.getOrderStatus());
        params.put("page", orderParam.getPage() + "");
        params.put("pageSize", orderParam.getPageSize() + "");
        params.put("refundStatus", orderParam.getRefundStatus() + "");
        params.put("buyerMemberId", orderParam.getBuyerMemberId() + "");
        params.put("buyerRateStatus", orderParam.getBuyerRateStatus() + "");
        params.put("tradeType", orderParam.getTradeType() + "");
        params.put("productName", orderParam.getProductName() + "");
        params.put("needBuyerAddressAndPhone", orderParam.getNeedBuyerAddressAndPhone() + "");
        params.put("needMemoInfo", orderParam.getNeedMemoInfo() + "");
        params.put("sellerRateStatus", orderParam.getSellerRateStatus() + "");
        // bizTypes	String[]	否	业务类型，支持： "cn"(普通订单类型), "ws"(大额批发订单类型), "yp"(普通拿样订单类型), "yf"(一分钱拿样订单类型), "fs"(倒批(限时折扣)订单类型), "cz"(加工定制订单类型), "ag"(协议采购订单类型), "hp"(伙拼订单类型), "gc"(国采订单类型), "supply"(供销订单类型), "nyg"(nyg订单类型), "factory"(淘工厂订单类型), "quick"(快订下单), "xiangpin"(享拼订单), "nest"(采购商城-鸟巢), "f2f"(当面付), "cyfw"(存样服务), "sp"(代销订单标记), "wg"(微供订单), "factorysamp"(淘工厂打样订单), "factorybig"(淘工厂大货订单)	["cn","ws"]
        params = MapUtil.removeAllNullValue(params);
        String result= ApiCallService.callApi(AliConstant.Trade.NAMESPACE + AliConstant.Trade.GET_SELLER_ORDER_LIST + applicationParam.getAppKey(), applicationParam.getAppSecret(), params);
        JSONObject jsonObject = JSON.parseObject(result);
        return jsonObject;
    }
}
