/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/29 下午10:12
 * todo  :
 */
public class ProductShippingInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long freightTemplateID;//	Long	否	运费模板ID，1688使用两类特殊模板来标明使用：运费说明、 卖家承担运费的情况。此参数通过调用运费模板相关API获取
    private Double unitWeight;//	Double	否	单位重量
    private String packageSize;//	String	否	尺寸，单位是厘米，长宽高范围是1-9999999。1688无需关注此字段	10x20x50
    private Integer volume;//	Integer	否	体积，单位是立方厘米，范围是1-9999999，1688无需关注此字段	500
    private Integer handlingTime;//	Integer	否	备货期，单位是天，范围是1-60。1688无需处理此字段
    private Long sendGoodsAddressId;//	Long	否	发货地址ID，国际站无需处理此字段

    public ProductShippingInfo() {
    }

    public ProductShippingInfo(Long freightTemplateID, Double unitWeight, String packageSize, Integer volume, Integer handlingTime, Long sendGoodsAddressId) {
        this.freightTemplateID = freightTemplateID;
        this.unitWeight = unitWeight;
        this.packageSize = packageSize;
        this.volume = volume;
        this.handlingTime = handlingTime;
        this.sendGoodsAddressId = sendGoodsAddressId;
    }

    @Override
    public String toString() {
        return "ProductShippingInfo{" +
                "freightTemplateID=" + freightTemplateID +
                ", unitWeight=" + unitWeight +
                ", packageSize='" + packageSize + '\'' +
                ", volume=" + volume +
                ", handlingTime=" + handlingTime +
                ", sendGoodsAddressId=" + sendGoodsAddressId +
                '}';
    }

    public Long getFreightTemplateID() {
        return freightTemplateID;
    }

    public void setFreightTemplateID(Long freightTemplateID) {
        this.freightTemplateID = freightTemplateID;
    }

    public Double getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(Double unitWeight) {
        this.unitWeight = unitWeight;
    }

    public String getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(String packageSize) {
        this.packageSize = packageSize;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getHandlingTime() {
        return handlingTime;
    }

    public void setHandlingTime(Integer handlingTime) {
        this.handlingTime = handlingTime;
    }

    public Long getSendGoodsAddressId() {
        return sendGoodsAddressId;
    }

    public void setSendGoodsAddressId(Long sendGoodsAddressId) {
        this.sendGoodsAddressId = sendGoodsAddressId;
    }
}
