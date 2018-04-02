/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.pinduoduo.constant;

/**
 * The interface Pdd constant.
 *
 * @author 张瑀楠 zyndev@gmail.com
 * @version 0.0.1
 */
public interface PddConstant {

    /**
     * 拼多多api根路径
     */
    String API_DOMAIN = "http://gw-api.pinduoduo.com/api/router/";

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

    interface Refund {
        String STATUS_CHECK = "pdd.refund.status.check";
    }

    interface Logistics {
        /**
         * （获取拼多多标准国家地址库）
         */
        String ADDRESS_GET = "pdd.logistics.address.get";
        /**
         * （快递公司查看接口）
         */
        String COMPANIES_GET = "pdd.logistics.companies.get";
        /**
         * （订单发货通知接口）
         */
        String ONLINE_SEND = "pdd.logistics.online.send";
    }

}
