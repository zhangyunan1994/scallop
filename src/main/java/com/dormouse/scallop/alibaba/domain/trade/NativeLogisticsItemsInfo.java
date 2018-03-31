/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Native logistics items info.
 */
public class NativeLogisticsItemsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date deliveredTime;//	java.util.Date	否	发货时间
    private String logisticsCode;//	java.lang.String	否

    /**
     * Instantiates a new Native logistics items info.
     */
    public NativeLogisticsItemsInfo() {
    }

    /**
     * Instantiates a new Native logistics items info.
     *
     * @param deliveredTime the delivered time
     * @param logisticsCode the logistics code
     */
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

    /**
     * Gets delivered time.
     *
     * @return the delivered time
     */
    public Date getDeliveredTime() {
        return deliveredTime;
    }

    /**
     * Sets delivered time.
     *
     * @param deliveredTime the delivered time
     */
    public void setDeliveredTime(Date deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    /**
     * Gets logistics code.
     *
     * @return the logistics code
     */
    public String getLogisticsCode() {
        return logisticsCode;
    }

    /**
     * Sets logistics code.
     *
     * @param logisticsCode the logistics code
     */
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }
}
