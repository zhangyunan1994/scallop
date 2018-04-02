/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.pinduoduo.api;

import com.dormouse.scallop.pinduoduo.domain.ApplicationParam;
import com.dormouse.scallop.pinduoduo.domain.OrderInformation;
import com.dormouse.scallop.pinduoduo.domain.OrderStatus;

import java.util.List;

/**
 * The type Order api.
 *
 * @author 张瑀楠 zyndev@gmail.com
 * @version 0.0.1
 */
public class OrderApi {


    /**
     * Gets information.
     *
     * @param applicationParam the application param
     * @param accessToken      the access token
     * @param orderSn          the order sn
     * @return the information
     */
    public OrderInformation getInformation(ApplicationParam applicationParam, String accessToken, String orderSn) {
        return null;
    }

    /**
     * Gets order list.
     *
     * @return the order list
     */
    public List<OrderInformation> getOrderList() {
        return null;
    }

    /**
     * Gets all order list.
     * pdd.order.number.list.get（订单全量列表）
     *
     * @return the all order list
     */
    public List<OrderInformation> getAllOrderList() {
        return null;
    }

    /**
     * Gets increment order list.
     * pdd.order.number.list.increment.get（订单增量接口）
     *
     * @return the increment order list
     */
    public List<OrderInformation> getIncrementOrderList() {
        return null;
    }


    /**
     * Gets order status.
     * pdd.order.status.get（订单状态）
     *
     * @return the order status
     */
    public List<OrderStatus> getOrderStatus(ApplicationParam applicationParam, String accessToken, String... orderSn) {
        return null;
    }
}
