/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/30 下午9:41
 * todo  :
 */
public class SkuItemDesc implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;//	String	否	属性名
    private String value;//	String	否	属性值

    public SkuItemDesc() {
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
