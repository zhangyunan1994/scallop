/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;


/**
 * The type Sku item desc.
 */
public class SkuItemDesc implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;//	String	否	属性名
    private String value;//	String	否	属性值

    /**
     * Instantiates a new Sku item desc.
     */
    public SkuItemDesc() {
    }

    /**
     * Instantiates a new Sku item desc.
     *
     * @param name  the name
     * @param value the value
     */
    public SkuItemDesc(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "SkuItemDesc{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
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
}
