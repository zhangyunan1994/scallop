/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.constant;

/**
 * The interface Ali constant.
 *
 * @author 张瑀楠
 * @version 0.0.1
 */
public interface AliConstant {

    /**
     * 阿里api根路径
     */
    String API_DOMAIN = "https://gw.open.1688.com/openapi/";

    /**
     * The constant API_PROTOCOL.
     */
    String API_PROTOCOL = "param2/1/";

    /**
     * 阿里webSite
     */
    public static String WEBSITE="1688";

    /**
     * The interface Product.
     */
    interface Product {
        /**
         * The constant NAMESPACE.
         */
        String NAMESPACE = "com.alibaba.product/";
        /**
         * The constant PRODUCT_GETLIST.
         * 获取商品列表（new）
         */
        String PRODUCT_GETLIST = "alibaba.product.getList/";
        /**
         * The constant PRODUCT_GET.
         * 由商品ID获取商品详细信息（new）
         */
        String PRODUCT_GET = "alibaba.product.get/";
        /**
         * The constant PRODUCT_REPOST.
         * 商品重发（new）
         */
        String PRODUCT_REPOST = "alibaba.product.repost/";
        /**
         * The constant CATEGORY_GET.
         * 商品重发（new）
         */
        String CATEGORY_GET = "alibaba.category.get/";
    }

    /**
     * The interface Trade.
     */
    interface Trade {
        /**
         * The constant NAMESPACE.
         */
        String NAMESPACE = "com.alibaba.trade/";
        /**
         * The constant GET_SELLER_ORDER_LIST.
         * 获取卖家订单列表（new），不会返回订单的物流信息和发票信息；如果需要获取物流信息，请调用获取订单详情接口；
         */
        String GET_SELLER_ORDER_LIST = "alibaba.trade.getSellerOrderList/";
    }

    /**
     * The interface Logistics.
     */
    interface Logistics {
        /**
         * The constant SELLER_LOGISTICS_INFOS.
         * 获取卖家的订单的物流详情
         */
        String SELLER_LOGISTICS_INFOS = "alibaba.trade.getLogisticsInfos.sellerView";
        /**
         * The constant SELLER_LOGISTICS_TRACEINFO.
         * 获取卖家的订单的物流跟踪信息
         */
        String SELLER_LOGISTICS_TRACEINFO = "alibaba.trade.getLogisticsTraceInfo.sellerView";
        /**
         * The constant SEND_ADDRESS_LIST.
         * 我的发货地址列表
         */
        String SEND_ADDRESS_LIST = "alibaba.logistics.mySendGoodsAddress.list.get";
    }
}
