/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.pinduoduo.domain;

import lombok.Data;

/**
 * 订单详情
 *
 * @author 张瑀楠 zyndev@gmail.com
 * @version 1.0.0
 */
@Data
public class OrderInformation {
    private String orderSn;  // 订单编号
    private String confirmTime;  // 成团时间
    private String createdTime;  // 订单创建时间
    private String country;  // 国家
    private String province;  // 省份
    private String city;  // 城市
    private String town;  // 区县
    private String address;  // 地址
    private String receiverName;  // 收件人
    private String receiverPhone;  // 收件人电话
    private String payAmount;  // 支付金额（元）
    private String goodsAmount;  // 商品金额
    private String discountAmount;  // 折扣金额
    private String payNo;  // 支付单号
    private String postage;  // 邮费
    private String payType;  // 支付方式
    private String idCardNum;  // id_card_num 身份证号
    private String idCardName;  // 身份证姓名
    private String logisticsId;  // 快递公司编号
    private String trackingNumber;  // 快递编号
    private String shippingTime;  // 发货时间
    private String remark;  // 备注
    private String goodsId;  // 商品编号
    private String skuId;  // Sku 编号
    private String outerId;  // 外部编码
    private String goodsName;  // 商品名称
    private String goodsPrice;  // 商品单价
    private String goodsCount;  // 商品数量
    private String goodsImg;  // 商品图片
    private String isLucky;  // 是否抽奖订单
    private String orderStatus;  // 发货状态
    private String lastShipTime;  // 承诺发货时间
    private String refundStatus;  // 退款状态
    private String sellerDiscount;  // 商家折扣金额
    private String capitalFreeDiscount;  // 团长免单优惠金额
    private String platformDiscount;  // 平台折扣金额
    private Number outerGoodsId;  // 商品goods外部编码
}
