/*
 * Copyright (c) 2018. author and authors
 */

package com.dormouse.scallop.alibaba.constant;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/20 下午4:25
 * todo  :
 */
public interface AliConstant {

    /**
     * 阿里api根路径
     */
    String API_DOMAIN = "https://gw.open.1688.com/openapi/";

    String API_PROTOCOL = "param2/1/";

    /**
     * 阿里webSite
     */
    public static String WEBSITE="1688";

    interface Product {
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

    /**
     * 阿里巴巴常量
     */
    interface Alibaba {
        //namespace: com.alibaba.product
        //类目
        String CATEGORY_ATTRIBUTE = "alibaba.category.attribute.get"; //获取类目属性
        String CATEGORY_LIST = "alibaba.category.get"; //查询类目

        //产品（new）


        //产品（old）
        //namespace: cn.alibaba.open
        String PRODUCT_GETLIST_OLD = "offer.getAllOfferList";  //获取当前会员的商品列表（old），不建议使用。
        String PRODUCT_GET_OLD = "offer.get"; //获取单个商品（old），不建议使用。

        String SHOWWINDOW_LIST = "industry.showwindow.doQueryRecommOfferList"; //获取卖家当前的橱窗列表
        String SHOWWINDOW_DORECOMMEND = "industry.showwindow.doRecommendOffer"; //推荐一个产品为橱窗产品
        String SHOWWINDOW_CANCEL = "industry.showwindow.cancelRecommendOffer"; //取消一个橱窗推荐产品


        //物流（new）


    }
}
