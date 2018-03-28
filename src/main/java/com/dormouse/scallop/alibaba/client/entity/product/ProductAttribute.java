package com.dormouse.scallop.alibaba.client.entity.product;

import java.io.Serializable;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/29 下午9:59
 * todo  :
 */
public class ProductAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long attributeID;       // 属性ID	123456
    private String attributeName;   // 属性名称	color
    private Long valueID;	        // 属性值ID	123456
    private String value;	        // 属性值	grey
    private Boolean isCustom;       // 是否为自定义属性，国际站无需关注	true

    public ProductAttribute() {
    }

    public ProductAttribute(Long attributeID, String attributeName, Long valueID, String value, Boolean isCustom) {
        this.attributeID = attributeID;
        this.attributeName = attributeName;
        this.valueID = valueID;
        this.value = value;
        this.isCustom = isCustom;
    }

    @Override
    public String toString() {
        return "ProductAttribute{" +
                "attributeID=" + attributeID +
                ", attributeName='" + attributeName + '\'' +
                ", valueID=" + valueID +
                ", value='" + value + '\'' +
                ", isCustom=" + isCustom +
                '}';
    }

    public Long getAttributeID() {
        return attributeID;
    }

    public void setAttributeID(Long attributeID) {
        this.attributeID = attributeID;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public Long getValueID() {
        return valueID;
    }

    public void setValueID(Long valueID) {
        this.valueID = valueID;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getCustom() {
        return isCustom;
    }

    public void setCustom(Boolean custom) {
        isCustom = custom;
    }
}
