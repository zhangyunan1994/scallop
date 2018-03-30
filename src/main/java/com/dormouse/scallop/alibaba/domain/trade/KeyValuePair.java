/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;


/**
 * The type Key value pair.
 *
 * @author yunan.zhang
 * @version 0.0.1
 */
public class KeyValuePair implements Serializable {

    private static final long serialVersionUID = 1L;

    private String key;//	String	否	键
    private String value;//	String	否	值
    private String description;//	String	否	描述

    /**
     * Instantiates a new Key value pair.
     */
    public KeyValuePair() {
    }

    /**
     * Instantiates a new Key value pair.
     *
     * @param key         the key
     * @param value       the value
     * @param description the description
     */
    public KeyValuePair(String key, String value, String description) {
        this.key = key;
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return "KeyValuePair{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    /**
     * Gets key.
     *
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets key.
     *
     * @param key the key
     */
    public void setKey(String key) {
        this.key = key;
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
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
