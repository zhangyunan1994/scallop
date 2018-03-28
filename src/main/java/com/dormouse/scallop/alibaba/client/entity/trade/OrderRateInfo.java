package com.dormouse.scallop.alibaba.client.entity.trade;

import java.io.Serializable;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/30 下午9:31
 * todo  :
 */
public class OrderRateInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer buyerRateStatus;//	Integer	否	买家评价状态(4:已评论,5:未评论,6;不需要评论)
    private Integer sellerRateStatus;//	Integer	否	卖家评价状态(4:已评论,5:未评论,6;不需要评论)

    public OrderRateInfo() {
    }

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

    public Integer getBuyerRateStatus() {
        return buyerRateStatus;
    }

    public void setBuyerRateStatus(Integer buyerRateStatus) {
        this.buyerRateStatus = buyerRateStatus;
    }

    public Integer getSellerRateStatus() {
        return sellerRateStatus;
    }

    public void setSellerRateStatus(Integer sellerRateStatus) {
        this.sellerRateStatus = sellerRateStatus;
    }
}
