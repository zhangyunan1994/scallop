/**
 * Project: ocean.client.java.basic
 *
 * File Created at 2011-10-26
 * $Id: Protocol.java 324325 2014-02-11 07:39:28Z yichun.wangyc $
 *
 * Copyright 2008 Alibaba.com Croporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.dormouse.scallop.alibaba.client.policy;

/**
 * 参数传递的格式协议
 * @author jade
 *
 */
public enum Protocol {
    /**
     * 默认推荐的协议格式，同http请求的get/post请求格式
     */
    param2,
    /**
     * 请求参数通过json串的方式传递,默认格式_data_={"key":"value"}
     */
    json2,
    /**
     * 
     * 请求参数通过xml的方式传递,默认格式_data_=&lt;test>data&lt;/test>
     */
    xml2,
    param,
    json,
    xml,
    http
}
