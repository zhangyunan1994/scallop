/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.api.trade;


import lombok.Data;

/**
 * The type Order param.
 *
 * @author yunan.zhang
 * @version 0.0.1
 */
@Data
public class OrderParam {
    private String createEndTime;   // 否 下单结束时间
    private String createStartTime;	// 否 下单开始时间

    private Boolean isHis = false;	// 否 是否查询历史订单表,默认查询当前表	默认false
    private String modifyEndTime;	// 否 查询修改时间结束
    private String modifyStartTime;	// 否 查询修改时间开始
    private String orderStatus;     // 否 订单状态，值有 success,
                                    // cancel(交易取消，违约金等交割完毕),
                                    // waitbuyerpay(等待卖家付款)，
                                    // waitsellersend(等待卖家发货),
                                    // waitbuyerreceive(等待买家收货 )
    private Integer page;	        // 否 查询分页页码，从1开始		1
    private Integer pageSize;       // 否 查询的每页的数量(最高20)		20
    private String refundStatus;	// 否 退款状态，支持：
                                    // "waitselleragree"(等待卖家同意),
                                    // "refundsuccess"(退款成功),
                                    // "refundclose"(退款关闭),
                                    // "waitbuyermodify"(待买家修改),
                                    // "waitbuyersend"(等待买家退货),
                                    // "waitsellerreceive"(等待卖家确认收货)
    private String buyerMemberId;	// 否 买家memberId
    private Integer buyerRateStatus;// 否 买家评价状态 (4:已评价,5:未评价,6;不需要评价)	4
    private String tradeType;       // 否 交易类型: 担保交易(1), 预存款交易(2), ETC境外收单交易(3), 即时到帐交易(4), 保障金安全交易(5), 统一交易流程(6), 分阶段交易(7), 货到付款交易(8), 信用凭证支付交易(9), 账期支付交易(10), 1688交易4.0，新分阶段交易(50060), 当面付的交易流程(50070), 服务类的交易流程(50080)
    private String[] bizTypes;	    // 否 业务类型，支持： "cn"(普通订单类型), "ws"(大额批发订单类型), "yp"(普通拿样订单类型), "yf"(一分钱拿样订单类型), "fs"(倒批(限时折扣)订单类型), "cz"(加工定制订单类型), "ag"(协议采购订单类型), "hp"(伙拼订单类型), "gc"(国采订单类型), "supply"(供销订单类型), "nyg"(nyg订单类型), "factory"(淘工厂订单类型), "quick"(快订下单), "xiangpin"(享拼订单), "nest"(采购商城-鸟巢), "f2f"(当面付), "cyfw"(存样服务), "sp"(代销订单标记), "wg"(微供订单), "factorysamp"(淘工厂打样订单), "factorybig"(淘工厂大货订单)	["cn","ws"]
    private String productName;     // 否 商品名称
    private Boolean needBuyerAddressAndPhone; // 否	是否需要查询买家的详细地址信息和电话
    private Boolean needMemoInfo;   // 否 是否需要查询备注信息
    private Integer sellerRateStatus;//	否

    /**
     * Instantiates a new Order param.
     */
    public OrderParam() {
    }

    /**
     * Instantiates a new Order param.
     *
     * @param createEndTime   the create end time
     * @param createStartTime the create start time
     * @param orderStatus     the order status
     * @param page            the page
     * @param pageSize        the page size
     * @param refundStatus    the refund status
     * @param buyerMemberId   the buyer member id
     * @param tradeType       the trade type
     * @param needMemoInfo    the need memo info
     */
    public OrderParam(String createEndTime, String createStartTime, String orderStatus, Integer page, Integer pageSize,
                      String refundStatus, String buyerMemberId, String tradeType, Boolean needMemoInfo) {
        this.createEndTime = createEndTime;
        this.createStartTime = createStartTime;
        this.orderStatus = orderStatus;
        this.page = page;
        this.pageSize = pageSize;
        this.refundStatus = refundStatus;
        this.buyerMemberId = buyerMemberId;
        this.tradeType = tradeType;
        this.needMemoInfo = needMemoInfo;
    }

    /**
     * Gets create end time.
     *
     * @return the create end time
     */
    public String getCreateEndTime() {
        return createEndTime;
    }

    /**
     * Sets create end time.
     *
     * @param createEndTime the create end time
     */
    public void setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
    }

    /**
     * Gets create start time.
     *
     * @return the create start time
     */
    public String getCreateStartTime() {
        return createStartTime;
    }

    /**
     * Sets create start time.
     *
     * @param createStartTime the create start time
     */
    public void setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
    }

    /**
     * Gets his.
     *
     * @return the his
     */
    public Boolean getHis() {
        return isHis;
    }

    /**
     * Sets his.
     *
     * @param his the his
     */
    public void setHis(Boolean his) {
        isHis = his;
    }

    /**
     * Gets modify end time.
     *
     * @return the modify end time
     */
    public String getModifyEndTime() {
        return modifyEndTime;
    }

    /**
     * Sets modify end time.
     *
     * @param modifyEndTime the modify end time
     */
    public void setModifyEndTime(String modifyEndTime) {
        this.modifyEndTime = modifyEndTime;
    }

    /**
     * Gets modify start time.
     *
     * @return the modify start time
     */
    public String getModifyStartTime() {
        return modifyStartTime;
    }

    /**
     * Sets modify start time.
     *
     * @param modifyStartTime the modify start time
     */
    public void setModifyStartTime(String modifyStartTime) {
        this.modifyStartTime = modifyStartTime;
    }

    /**
     * Gets order status.
     *
     * @return the order status
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets order status.
     *
     * @param orderStatus the order status
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * Gets page.
     *
     * @return the page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Sets page.
     *
     * @param page the page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Gets refund status.
     *
     * @return the refund status
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * Sets refund status.
     *
     * @param refundStatus the refund status
     */
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * Gets buyer member id.
     *
     * @return the buyer member id
     */
    public String getBuyerMemberId() {
        return buyerMemberId;
    }

    /**
     * Sets buyer member id.
     *
     * @param buyerMemberId the buyer member id
     */
    public void setBuyerMemberId(String buyerMemberId) {
        this.buyerMemberId = buyerMemberId;
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
     * Gets trade type.
     *
     * @return the trade type
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * Sets trade type.
     *
     * @param tradeType the trade type
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * Get biz types string [ ].
     *
     * @return the string [ ]
     */
    public String[] getBizTypes() {
        return bizTypes;
    }

    /**
     * Sets biz types.
     *
     * @param bizTypes the biz types
     */
    public void setBizTypes(String[] bizTypes) {
        this.bizTypes = bizTypes;
    }

    /**
     * Gets product name.
     *
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets product name.
     *
     * @param productName the product name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Gets need buyer address and phone.
     *
     * @return the need buyer address and phone
     */
    public Boolean getNeedBuyerAddressAndPhone() {
        return needBuyerAddressAndPhone;
    }

    /**
     * Sets need buyer address and phone.
     *
     * @param needBuyerAddressAndPhone the need buyer address and phone
     */
    public void setNeedBuyerAddressAndPhone(Boolean needBuyerAddressAndPhone) {
        this.needBuyerAddressAndPhone = needBuyerAddressAndPhone;
    }

    /**
     * Gets need memo info.
     *
     * @return the need memo info
     */
    public Boolean getNeedMemoInfo() {
        return needMemoInfo;
    }

    /**
     * Sets need memo info.
     *
     * @param needMemoInfo the need memo info
     */
    public void setNeedMemoInfo(Boolean needMemoInfo) {
        this.needMemoInfo = needMemoInfo;
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
