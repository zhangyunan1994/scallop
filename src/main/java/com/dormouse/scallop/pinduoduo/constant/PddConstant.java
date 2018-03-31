/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.pinduoduo.constant;

/**
 * @author 张瑀楠 zyndev@gmail.com
 * @version 1.0.0
 * 2018/3/31 上午11:05
 */
public interface PddConstant {

    /**
     * 阿里api根路径
     */
    String API_DOMAIN = "https://gw.open.1688.com/openapi/";

    String API_PROTOCOL = "param2/1/";

    interface Order {
        String INFORMATION_GET = "pdd.order.information.get"; //（订单详情）
        String LIST_GET = "pdd.order.list.get"; // （订单列表查询接口（根据成团时间)
        String NUMBER_LIST_GET = "pdd.order.number.list.get"; //（订单全量列表）
        String NUMBER_LIST_INCREMENT_GET = "pdd.order.number.list.increment.get"; //（订单全量列表）
        String STATUS_GET = "pdd.order.status.get"; //（订单全量列表）
    }

    interface Goods {
        String NAMESPACE = "com.alibaba.product/";
        String PRODUCT_GETLIST = "alibaba.product.getList/"; // 获取商品列表（new）
        String PRODUCT_GET = "alibaba.product.get/"; //由商品ID获取商品详细信息（new）
        String PRODUCT_REPOST = "alibaba.product.repost/"; //商品重发（new）
        String CATEGORY_GET = "alibaba.category.get/"; //商品重发（new）
    }

    interface Trade {
        String NAMESPACE = "com.alibaba.trade/";
        String GET_SELLER_ORDER_LIST = "alibaba.trade.getSellerOrderList/"; //获取卖家订单列表（new），不会返回订单的物流信息和发票信息；如果需要获取物流信息，请调用获取订单详情接口；
    }

    interface Logistics {
        String SELLER_LOGISTICS_INFOS = "alibaba.trade.getLogisticsInfos.sellerView"; // 获取卖家的订单的物流详情
        String SELLER_LOGISTICS_TRACEINFO = "alibaba.trade.getLogisticsTraceInfo.sellerView"; //获取卖家的订单的物流跟踪信息。
        String SEND_ADDRESS_LIST = "alibaba.logistics.mySendGoodsAddress.list.get"; //我的发货地址列表
    }
}
