/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;
import java.util.Arrays;

/**
 * The type Product international trade info.
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

    /**
     * Instantiates a new Product international trade info.
     */
    public ProductInternationalTradeInfo() {
    }

    /**
     * Instantiates a new Product international trade info.
     *
     * @param fobCurrency      the fob currency
     * @param fobMinPrice      the fob min price
     * @param fobMaxPrice      the fob max price
     * @param fobUnitType      the fob unit type
     * @param paymentMethods   the payment methods
     * @param minOrderQuantity the min order quantity
     * @param minOrderUnitType the min order unit type
     * @param supplyQuantity   the supply quantity
     * @param supplyUnitType   the supply unit type
     * @param supplyPeriodType the supply period type
     * @param deliveryPort     the delivery port
     * @param deliveryTime     the delivery time
     * @param consignmentDate  the consignment date
     * @param packagingDesc    the packaging desc
     */
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

    /**
     * Gets fob currency.
     *
     * @return the fob currency
     */
    public String getFobCurrency() {
        return fobCurrency;
    }

    /**
     * Sets fob currency.
     *
     * @param fobCurrency the fob currency
     */
    public void setFobCurrency(String fobCurrency) {
        this.fobCurrency = fobCurrency;
    }

    /**
     * Gets fob min price.
     *
     * @return the fob min price
     */
    public String getFobMinPrice() {
        return fobMinPrice;
    }

    /**
     * Sets fob min price.
     *
     * @param fobMinPrice the fob min price
     */
    public void setFobMinPrice(String fobMinPrice) {
        this.fobMinPrice = fobMinPrice;
    }

    /**
     * Gets fob max price.
     *
     * @return the fob max price
     */
    public String getFobMaxPrice() {
        return fobMaxPrice;
    }

    /**
     * Sets fob max price.
     *
     * @param fobMaxPrice the fob max price
     */
    public void setFobMaxPrice(String fobMaxPrice) {
        this.fobMaxPrice = fobMaxPrice;
    }

    /**
     * Gets fob unit type.
     *
     * @return the fob unit type
     */
    public String getFobUnitType() {
        return fobUnitType;
    }

    /**
     * Sets fob unit type.
     *
     * @param fobUnitType the fob unit type
     */
    public void setFobUnitType(String fobUnitType) {
        this.fobUnitType = fobUnitType;
    }

    /**
     * Get payment methods string [ ].
     *
     * @return the string [ ]
     */
    public String[] getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * Sets payment methods.
     *
     * @param paymentMethods the payment methods
     */
    public void setPaymentMethods(String[] paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    /**
     * Gets min order quantity.
     *
     * @return the min order quantity
     */
    public Integer getMinOrderQuantity() {
        return minOrderQuantity;
    }

    /**
     * Sets min order quantity.
     *
     * @param minOrderQuantity the min order quantity
     */
    public void setMinOrderQuantity(Integer minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    /**
     * Gets min order unit type.
     *
     * @return the min order unit type
     */
    public String getMinOrderUnitType() {
        return minOrderUnitType;
    }

    /**
     * Sets min order unit type.
     *
     * @param minOrderUnitType the min order unit type
     */
    public void setMinOrderUnitType(String minOrderUnitType) {
        this.minOrderUnitType = minOrderUnitType;
    }

    /**
     * Gets supply quantity.
     *
     * @return the supply quantity
     */
    public Integer getSupplyQuantity() {
        return supplyQuantity;
    }

    /**
     * Sets supply quantity.
     *
     * @param supplyQuantity the supply quantity
     */
    public void setSupplyQuantity(Integer supplyQuantity) {
        this.supplyQuantity = supplyQuantity;
    }

    /**
     * Gets supply unit type.
     *
     * @return the supply unit type
     */
    public String getSupplyUnitType() {
        return supplyUnitType;
    }

    /**
     * Sets supply unit type.
     *
     * @param supplyUnitType the supply unit type
     */
    public void setSupplyUnitType(String supplyUnitType) {
        this.supplyUnitType = supplyUnitType;
    }

    /**
     * Gets supply period type.
     *
     * @return the supply period type
     */
    public String getSupplyPeriodType() {
        return supplyPeriodType;
    }

    /**
     * Sets supply period type.
     *
     * @param supplyPeriodType the supply period type
     */
    public void setSupplyPeriodType(String supplyPeriodType) {
        this.supplyPeriodType = supplyPeriodType;
    }

    /**
     * Gets delivery port.
     *
     * @return the delivery port
     */
    public String getDeliveryPort() {
        return deliveryPort;
    }

    /**
     * Sets delivery port.
     *
     * @param deliveryPort the delivery port
     */
    public void setDeliveryPort(String deliveryPort) {
        this.deliveryPort = deliveryPort;
    }

    /**
     * Gets delivery time.
     *
     * @return the delivery time
     */
    public String getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Sets delivery time.
     *
     * @param deliveryTime the delivery time
     */
    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * Gets consignment date.
     *
     * @return the consignment date
     */
    public Integer getConsignmentDate() {
        return consignmentDate;
    }

    /**
     * Sets consignment date.
     *
     * @param consignmentDate the consignment date
     */
    public void setConsignmentDate(Integer consignmentDate) {
        this.consignmentDate = consignmentDate;
    }

    /**
     * Gets packaging desc.
     *
     * @return the packaging desc
     */
    public String getPackagingDesc() {
        return packagingDesc;
    }

    /**
     * Sets packaging desc.
     *
     * @param packagingDesc the packaging desc
     */
    public void setPackagingDesc(String packagingDesc) {
        this.packagingDesc = packagingDesc;
    }
}
