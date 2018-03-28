/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.api.product;

import lombok.Data;


/**
 * The type Product param.
 * @author yunan.zhang
 * @version 0.0.1
 */
@Data
public class ProductParam {

    private Long categoryID;    // 否	类目ID，国际站传入-1，返回所有商品列表
    private Integer pageNo; 	// 否	页码。取值范围:大于零的整数;默认值为1，即返回第一页数据
    private Integer pageSize;	// 否	返回列表结果集每页条数。取值范围:大于零的整数;最大值：30;	20	20
    private String timeStamp;	// 否	格式:yyyy-MM-dd HH:mm:ss；1、如果传了时间戳参数，则按增量返回，即返回按指定获取条件且对应商品信息的最近更新时间(GMTModified)晚于该时间戳的商品列表信息。2、如果没有传时间戳参数，则取所有的满足条件的商品信息。1688的时间目前只能支持精确到天。	2015-04-02 00:00:00
    private String webSite = "1688";// 是	站点信息，指定调用的API是属于国际站（alibaba）还是1688网站（1688）
    private String endTimeStamp;// 否	格式:yyyy-MM-dd HH:mm:ss；1、如果传了时间戳参数，则按增量返回，即返回按指定获取条件且对应商品信息的最近更新时间(GMTModified)早于该时间戳的商品列表信息。2、如果没有传时间戳参数，则取所有的满足条件的商品信息。	2015-04-02 01:00:00
    private String scene;       // 	业务场景 零售通(lst) 1688市场(1688)

}
