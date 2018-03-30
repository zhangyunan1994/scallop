/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/29 下午10:23
 * todo  :
 */
public class SKUAttrInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long attributeID;   //	Long	否	sku属性ID
    private Long attValueID;    //  Long	否	sku值ID，1688不用关注
    private String attributeValue;  //  String	否	sku值内容，国际站不用关注
    private String customValueName; //	String	否	自定义属性值名称，1688无需关注
    private String skuImageUrl;     //	String	否	sku图片

    public SKUAttrInfo() {
    }

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

    public Long getAttributeID() {
        return attributeID;
    }

    public void setAttributeID(Long attributeID) {
        this.attributeID = attributeID;
    }

    public Long getAttValueID() {
        return attValueID;
    }

    public void setAttValueID(Long attValueID) {
        this.attValueID = attValueID;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String getCustomValueName() {
        return customValueName;
    }

    public void setCustomValueName(String customValueName) {
        this.customValueName = customValueName;
    }

    public String getSkuImageUrl() {
        return skuImageUrl;
    }

    public void setSkuImageUrl(String skuImageUrl) {
        this.skuImageUrl = skuImageUrl;
    }
}
