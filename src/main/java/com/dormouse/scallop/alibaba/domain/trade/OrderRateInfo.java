/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;


/**
 * The type Order rate info.
 */
public class OrderRateInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer buyerRateStatus;//	Integer	否	买家评价状态(4:已评论,5:未评论,6;不需要评论)
    private Integer sellerRateStatus;//	Integer	否	卖家评价状态(4:已评论,5:未评论,6;不需要评论)

    /**
     * Instantiates a new Order rate info.
     */
    public OrderRateInfo() {
    }

    /**
     * Instantiates a new Order rate info.
     *
     * @param buyerRateStatus  the buyer rate status
     * @param sellerRateStatus the seller rate status
     */
    public OrderRateInfo(Integer buyerRateStatus, Integer sellerRateStatus) {
        this.buyerRateStatus = buyerRateStatus;
        this.sellerRateStatus = sellerRateStatus;
    }

    @Override
    public String toString() {
        return "OrderRateInfo{" +
                "buyerRateStatus=" + buyerRateStatus +
                ", sellerRateStatus=" + sellerRateStatus +
                '}';
    }

    /**
     * Gets buyer rate status.
     *
     * @return the buyer rate status
     */
    public Integer getBuyerRateStatus() {
        return buyerRateStatus;
    }

    /**
     * Sets buyer rate status.
     *
     * @param buyerRateStatus the buyer rate status
     */
    public void setBuyerRateStatus(Integer buyerRateStatus) {
        this.buyerRateStatus = buyerRateStatus;
    }

    /**
     * Gets seller rate status.
     *
     * @return the seller rate status
     */
    public Integer getSellerRateStatus() {
        return sellerRateStatus;
    }

    /**
     * Sets seller rate status.
     *
     * @param sellerRateStatus the seller rate status
     */
    public void setSellerRateStatus(Integer sellerRateStatus) {
        this.sellerRateStatus = sellerRateStatus;
    }
}
