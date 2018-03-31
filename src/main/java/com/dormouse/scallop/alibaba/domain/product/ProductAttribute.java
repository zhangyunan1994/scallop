/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;


/**
 * The type Product attribute.
 */
public class ProductAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long attributeID;       // 属性ID	123456
    private String attributeName;   // 属性名称	color
    private Long valueID;            // 属性值ID	123456
    private String value;            // 属性值	grey
    private Boolean isCustom;       // 是否为自定义属性，国际站无需关注	true

    /**
     * Instantiates a new Product attribute.
     */
    public ProductAttribute() {
    }

    /**
     * Instantiates a new Product attribute.
     *
     * @param attributeID   the attribute id
     * @param attributeName the attribute name
     * @param valueID       the value id
     * @param value         the value
     * @param isCustom      the is custom
     */
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
     * Gets attribute name.
     *
     * @return the attribute name
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets attribute name.
     *
     * @param attributeName the attribute name
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * Gets value id.
     *
     * @return the value id
     */
    public Long getValueID() {
        return valueID;
    }

    /**
     * Sets value id.
     *
     * @param valueID the value id
     */
    public void setValueID(Long valueID) {
        this.valueID = valueID;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets custom.
     *
     * @return the custom
     */
    public Boolean getCustom() {
        return isCustom;
    }

    /**
     * Sets custom.
     *
     * @param custom the custom
     */
    public void setCustom(Boolean custom) {
        isCustom = custom;
    }
}
