/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.pinduoduo.domain;

import lombok.Data;

/**
 * The type Order status.
 *
 * @author 张瑀楠 zyndev@gmail.com
 * @version 0.0.1
 */
@Data
public class OrderStatus {

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 发货状态 1：待发货，2：已发货待签收，3：已签收 0：异常
     */
    private Integer orderStatus;

    /**
     * 售后状态 1：无售后或售后关闭，2：售后处理中，3：退款中，4：退款成功 0：异常
     */
    private Integer refundStatus;
}
