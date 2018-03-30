/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;
import java.util.Arrays;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/29 下午10:12
 * todo  :
 */
public class ProductInternationalTradeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fobCurrency;//	String	否	FOB价格货币，参见FAQ 货币枚举值
    private String fobMinPrice;//	String	否	FOB最小价格
    private String fobMaxPrice;//	String	否	FOB最大价格
    private String fobUnitType;//	String	否	FOB计量单位，参见FAQ 计量单位枚举值
    private String[] paymentMethods;//	String[]	否	付款方式，参见FAQ 付款方式枚举值
    private Integer minOrderQuantity;//	Integer	否	最小起订量
    private String minOrderUnitType;//	String	否	最小起订量计量单位，参见FAQ 计量单位枚举值
    private Integer supplyQuantity;//	Integer	否	supplyQuantity
    private String supplyUnitType;//	String	否	供货能力计量单位，参见FAQ 计量单位枚举值
    private String supplyPeriodType;//	String	否	供货能力周期，参见FAQ 时间周期枚举值
    private String deliveryPort;//	String	否	发货港口
    private String deliveryTime;//	String	否	发货期限
    private Integer consignmentDate;//	Integer	否	新发货期限
    private String packagingDesc;//	String	否	常规包装

    public ProductInternationalTradeInfo() {
    }

    public ProductInternationalTradeInfo(String fobCurrency, String fobMinPrice, String fobMaxPrice, String fobUnitType, String[] paymentMethods, Integer minOrderQuantity, String minOrderUnitType, Integer supplyQuantity, String supplyUnitType, String supplyPeriodType, String deliveryPort, String deliveryTime, Integer consignmentDate, String packagingDesc) {
        this.fobCurrency = fobCurrency;
        this.fobMinPrice = fobMinPrice;
        this.fobMaxPrice = fobMaxPrice;
        this.fobUnitType = fobUnitType;
        this.paymentMethods = paymentMethods;
        this.minOrderQuantity = minOrderQuantity;
        this.minOrderUnitType = minOrderUnitType;
        this.supplyQuantity = supplyQuantity;
        this.supplyUnitType = supplyUnitType;
        this.supplyPeriodType = supplyPeriodType;
        this.deliveryPort = deliveryPort;
        this.deliveryTime = deliveryTime;
        this.consignmentDate = consignmentDate;
        this.packagingDesc = packagingDesc;
    }

    @Override
    public String toString() {
        return "ProductInternationalTradeInfo{" +
                "fobCurrency='" + fobCurrency + '\'' +
                ", fobMinPrice='" + fobMinPrice + '\'' +
                ", fobMaxPrice='" + fobMaxPrice + '\'' +
                ", fobUnitType='" + fobUnitType + '\'' +
                ", paymentMethods=" + Arrays.toString(paymentMethods) +
                ", minOrderQuantity=" + minOrderQuantity +
                ", minOrderUnitType='" + minOrderUnitType + '\'' +
                ", supplyQuantity=" + supplyQuantity +
                ", supplyUnitType='" + supplyUnitType + '\'' +
                ", supplyPeriodType='" + supplyPeriodType + '\'' +
                ", deliveryPort='" + deliveryPort + '\'' +
                ", deliveryTime='" + deliveryTime + '\'' +
                ", consignmentDate=" + consignmentDate +
                ", packagingDesc='" + packagingDesc + '\'' +
                '}';
    }

    public String getFobCurrency() {
        return fobCurrency;
    }

    public void setFobCurrency(String fobCurrency) {
        this.fobCurrency = fobCurrency;
    }

    public String getFobMinPrice() {
        return fobMinPrice;
    }

    public void setFobMinPrice(String fobMinPrice) {
        this.fobMinPrice = fobMinPrice;
    }

    public String getFobMaxPrice() {
        return fobMaxPrice;
    }

    public void setFobMaxPrice(String fobMaxPrice) {
        this.fobMaxPrice = fobMaxPrice;
    }

    public String getFobUnitType() {
        return fobUnitType;
    }

    public void setFobUnitType(String fobUnitType) {
        this.fobUnitType = fobUnitType;
    }

    public String[] getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(String[] paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public Integer getMinOrderQuantity() {
        return minOrderQuantity;
    }

    public void setMinOrderQuantity(Integer minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    public String getMinOrderUnitType() {
        return minOrderUnitType;
    }

    public void setMinOrderUnitType(String minOrderUnitType) {
        this.minOrderUnitType = minOrderUnitType;
    }

    public Integer getSupplyQuantity() {
        return supplyQuantity;
    }

    public void setSupplyQuantity(Integer supplyQuantity) {
        this.supplyQuantity = supplyQuantity;
    }

    public String getSupplyUnitType() {
        return supplyUnitType;
    }

    public void setSupplyUnitType(String supplyUnitType) {
        this.supplyUnitType = supplyUnitType;
    }

    public String getSupplyPeriodType() {
        return supplyPeriodType;
    }

    public void setSupplyPeriodType(String supplyPeriodType) {
        this.supplyPeriodType = supplyPeriodType;
    }

    public String getDeliveryPort() {
        return deliveryPort;
    }

    public void setDeliveryPort(String deliveryPort) {
        this.deliveryPort = deliveryPort;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Integer getConsignmentDate() {
        return consignmentDate;
    }

    public void setConsignmentDate(Integer consignmentDate) {
        this.consignmentDate = consignmentDate;
    }

    public String getPackagingDesc() {
        return packagingDesc;
    }

    public void setPackagingDesc(String packagingDesc) {
        this.packagingDesc = packagingDesc;
    }
}
