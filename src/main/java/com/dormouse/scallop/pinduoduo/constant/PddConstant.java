/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.pinduoduo.constant;

/**
 * The interface Pdd constant.
 *
 * @author 张瑀楠 zyndev@gmail.com
 * @version 1.0.0
 */
public interface PddConstant {

    /**
     * 阿里api根路径
     */
    String API_DOMAIN = "https://gw.open.1688.com/openapi/";

    /**
     * The constant API_PROTOCOL.
     */
    String API_PROTOCOL = "param2/1/";

    /**
     * The interface Order.
     */
    interface Order {
        /**
         * The constant INFORMATION_GET.
         * （订单详情）
         */
        String INFORMATION_GET = "pdd.order.information.get";
        /**
         * The constant LIST_GET.
         * （订单列表查询接口（根据成团时间)
         */
        String LIST_GET = "pdd.order.list.get";
        /**
         * The constant NUMBER_LIST_GET.
         * （订单全量列表）
         */
        String NUMBER_LIST_GET = "pdd.order.number.list.get";
        /**
         * The constant NUMBER_LIST_INCREMENT_GET.
         * （订单全量列表）
         */
        String NUMBER_LIST_INCREMENT_GET = "pdd.order.number.list.increment.get";
        /**
         * The constant STATUS_GET.
         * （订单全量列表）
         */
        String STATUS_GET = "pdd.order.status.get";
    }

    /**
     * The interface Goods.
     */
    interface Goods {
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
