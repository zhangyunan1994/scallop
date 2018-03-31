/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;

/**
 * The type Sku attr info.
 */
public class SKUAttrInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long attributeID;   //	Long	否	sku属性ID
    private Long attValueID;    //  Long	否	sku值ID，1688不用关注
    private String attributeValue;  //  String	否	sku值内容，国际站不用关注
    private String customValueName; //	String	否	自定义属性值名称，1688无需关注
    private String skuImageUrl;     //	String	否	sku图片

    /**
     * Instantiates a new Sku attr info.
     */
    public SKUAttrInfo() {
    }

    /**
     * Instantiates a new Sku attr info.
     *
     * @param attributeID     the attribute id
     * @param attValueID      the att value id
     * @param attributeValue  the attribute value
     * @param customValueName the custom value name
     * @param skuImageUrl     the sku image url
     */
    public SKUAttrInfo(Long attributeID, Long attValueID, String attributeValue, String customValueName, String skuImageUrl) {
        this.attributeID = attributeID;
        this.attValueID = attValueID;
        this.attributeValue = attributeValue;
        this.customValueName = customValueName;
        this.skuImageUrl = skuImageUrl;
    }

    @Override
    public String toString() {
        return "SKUAttrInfo{" +
                "attributeID=" + attributeID +
                ", attValueID=" + attValueID +
                ", attributeValue='" + attributeValue + '\'' +
                ", customValueName='" + customValueName + '\'' +
                ", skuImageUrl='" + skuImageUrl + '\'' +
                '}';
    }

    /**
     * Gets attribute id.
     *
     * @return the attribute id
     */
    public Long getAttributeID() {
        return attributeID;
    }

    /**
     * Sets attribute id.
     *
     * @param attributeID the attribute id
     */
    public void setAttributeID(Long attributeID) {
        this.attributeID = attributeID;
    }

    /**
     * Gets att value id.
     *
     * @return the att value id
     */
    public Long getAttValueID() {
        return attValueID;
    }

    /**
     * Sets att value id.
     *
     * @param attValueID the att value id
     */
    public void setAttValueID(Long attValueID) {
        this.attValueID = attValueID;
    }

    /**
     * Gets attribute value.
     *
     * @return the attribute value
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * Sets attribute value.
     *
     * @param attributeValue the attribute value
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * Gets custom value name.
     *
     * @return the custom value name
     */
    public String getCustomValueName() {
        return customValueName;
    }

    /**
     * Sets custom value name.
     *
     * @param customValueName the custom value name
     */
    public void setCustomValueName(String customValueName) {
        this.customValueName = customValueName;
    }

    /**
     * Gets sku image url.
     *
     * @return the sku image url
     */
    public String getSkuImageUrl() {
        return skuImageUrl;
    }

    /**
     * Sets sku image url.
     *
     * @param skuImageUrl the sku image url
     */
    public void setSkuImageUrl(String skuImageUrl) {
        this.skuImageUrl = skuImageUrl;
    }
}
