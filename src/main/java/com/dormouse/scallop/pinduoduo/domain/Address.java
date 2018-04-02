/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.pinduoduo.domain;

import lombok.Data;

/**
 * @author 张瑀楠 zyndev@gmail.com
 * @version 0.0.1
 */
@Data
public class Address {

    /**
     * 地区ID
     */
    private Integer id;
    /**
     * 父地区ID，顶点id为0
     */
    private Integer parentIdv;
    /**
     * 地区名称
     */
    private String regionName;
    /**
     * 地区层级，1-省份，2-市级，3-区级
     */
    private Integer regionType;
    /**
     * 地区邮编
     */
    private Integer nationalCode;
    /**
     * 是否有效，0-无效，1-有效
     */
    private Integer isEnabled;

}
