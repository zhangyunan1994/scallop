/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/29 下午10:13
 * todo  :
 */
public class ProductExtendInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String key;//	String	否	扩展结构的key	代销价格,consignPrice
    private String value;//	String	否	扩展结构的value	代销价格,key为skuId，value为用户设置的代销价，示例：31151771910:2088.0;31151771909:2088.0;31151771908:2088.0;31152339121:2088.0;

    public ProductExtendInfo() {
    }

    public ProductExtendInfo(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "ProductExtendInfo{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
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
}
