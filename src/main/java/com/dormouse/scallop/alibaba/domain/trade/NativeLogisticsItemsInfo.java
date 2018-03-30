/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;
import java.util.Date;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/30 下午9:26
 * todo  :
 */
public class NativeLogisticsItemsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date deliveredTime;//	java.util.Date	否	发货时间
    private String logisticsCode;//	java.lang.String	否

    public NativeLogisticsItemsInfo() {
    }

    public NativeLogisticsItemsInfo(Date deliveredTime, String logisticsCode) {
        this.deliveredTime = deliveredTime;
        this.logisticsCode = logisticsCode;
    }

    @Override
    public String toString() {
        return "NativeLogisticsItemsInfo{" +
                "deliveredTime=" + deliveredTime +
                ", logisticsCode='" + logisticsCode + '\'' +
                '}';
    }

    public Date getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(Date deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }
}
