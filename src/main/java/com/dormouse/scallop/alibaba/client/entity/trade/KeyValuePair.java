package com.dormouse.scallop.alibaba.client.entity.trade;

import java.io.Serializable;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/30 下午9:31
 * todo  :
 */
public class KeyValuePair implements Serializable{

    private static final long serialVersionUID = 1L;

    private String key;//	String	否	键
    private String value;//	String	否	值
    private String description;//	String	否	描述

    public KeyValuePair() {
    }

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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
