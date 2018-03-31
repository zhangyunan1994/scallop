/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;

/**
 * The type Product shipping info.
 */
public class ProductShippingInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long freightTemplateID;//	Long	否	运费模板ID，1688使用两类特殊模板来标明使用：运费说明、 卖家承担运费的情况。此参数通过调用运费模板相关API获取
    private Double unitWeight;//	Double	否	单位重量
    private String packageSize;//	String	否	尺寸，单位是厘米，长宽高范围是1-9999999。1688无需关注此字段	10x20x50
    private Integer volume;//	Integer	否	体积，单位是立方厘米，范围是1-9999999，1688无需关注此字段	500
    private Integer handlingTime;//	Integer	否	备货期，单位是天，范围是1-60。1688无需处理此字段
    private Long sendGoodsAddressId;//	Long	否	发货地址ID，国际站无需处理此字段

    /**
     * Instantiates a new Product shipping info.
     */
    public ProductShippingInfo() {
    }

    /**
     * Instantiates a new Product shipping info.
     *
     * @param freightTemplateID  the freight template id
     * @param unitWeight         the unit weight
     * @param packageSize        the package size
     * @param volume             the volume
     * @param handlingTime       the handling time
     * @param sendGoodsAddressId the send goods address id
     */
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

    /**
     * Gets freight template id.
     *
     * @return the freight template id
     */
    public Long getFreightTemplateID() {
        return freightTemplateID;
    }

    /**
     * Sets freight template id.
     *
     * @param freightTemplateID the freight template id
     */
    public void setFreightTemplateID(Long freightTemplateID) {
        this.freightTemplateID = freightTemplateID;
    }

    /**
     * Gets unit weight.
     *
     * @return the unit weight
     */
    public Double getUnitWeight() {
        return unitWeight;
    }

    /**
     * Sets unit weight.
     *
     * @param unitWeight the unit weight
     */
    public void setUnitWeight(Double unitWeight) {
        this.unitWeight = unitWeight;
    }

    /**
     * Gets package size.
     *
     * @return the package size
     */
    public String getPackageSize() {
        return packageSize;
    }

    /**
     * Sets package size.
     *
     * @param packageSize the package size
     */
    public void setPackageSize(String packageSize) {
        this.packageSize = packageSize;
    }

    /**
     * Gets volume.
     *
     * @return the volume
     */
    public Integer getVolume() {
        return volume;
    }

    /**
     * Sets volume.
     *
     * @param volume the volume
     */
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    /**
     * Gets handling time.
     *
     * @return the handling time
     */
    public Integer getHandlingTime() {
        return handlingTime;
    }

    /**
     * Sets handling time.
     *
     * @param handlingTime the handling time
     */
    public void setHandlingTime(Integer handlingTime) {
        this.handlingTime = handlingTime;
    }

    /**
     * Gets send goods address id.
     *
     * @return the send goods address id
     */
    public Long getSendGoodsAddressId() {
        return sendGoodsAddressId;
    }

    /**
     * Sets send goods address id.
     *
     * @param sendGoodsAddressId the send goods address id
     */
    public void setSendGoodsAddressId(Long sendGoodsAddressId) {
        this.sendGoodsAddressId = sendGoodsAddressId;
    }
}
