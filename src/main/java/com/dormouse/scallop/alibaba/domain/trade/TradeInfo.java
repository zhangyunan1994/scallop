/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;
import java.util.List;


/**
 * The type Trade info.
 */
public class TradeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private OrderBaseInfo baseInfo;//	alibaba.openplatform.trade.model.OrderBaseInfo	否	订单基础信息
    private GuaranteeTermsInfo vguaranteesTerms;//	alibaba.openplatform.trade.model.GuaranteeTermsInfo	否	保障条款
    private InternationalLogisticsInfo internationalLogistics;//	alibaba.openplatform.trade.model.InternationalLogisticsInfo	否	国际物流
    private NativeLogisticsInfo nativeLogistics;//	alibaba.openplatform.trade.model.NativeLogisticsInfo	否	国内物流
    private List<ProductItemInfo> productItems;//	alibaba.openplatform.trade.model.ProductItemInfo[]	否	商品条目信息
    private List<TradeTermsInfo> tradeTerms;//	alibaba.openplatform.trade.model.TradeTermsInfo[]	否	交易条款
    private List<KeyValuePair> extAttributes;//	alibaba.openplatform.trade.KeyValuePair[]	否	订单扩展属性
    private OrderRateInfo orderRateInfo;//	alibaba.trade.OrderRateInfo	否	订单评价信息

    /**
     * Instantiates a new Trade info.
     */
    public TradeInfo() {
    }

    /**
     * Instantiates a new Trade info.
     *
     * @param baseInfo               the base info
     * @param vguaranteesTerms       the vguarantees terms
     * @param internationalLogistics the international logistics
     * @param nativeLogistics        the native logistics
     * @param productItems           the product items
     * @param tradeTerms             the trade terms
     * @param extAttributes          the ext attributes
     * @param orderRateInfo          the order rate info
     */
    public TradeInfo(OrderBaseInfo baseInfo, GuaranteeTermsInfo vguaranteesTerms, InternationalLogisticsInfo internationalLogistics, NativeLogisticsInfo nativeLogistics, List<ProductItemInfo> productItems, List<TradeTermsInfo> tradeTerms, List<KeyValuePair> extAttributes, OrderRateInfo orderRateInfo) {
        this.baseInfo = baseInfo;
        this.vguaranteesTerms = vguaranteesTerms;
        this.internationalLogistics = internationalLogistics;
        this.nativeLogistics = nativeLogistics;
        this.productItems = productItems;
        this.tradeTerms = tradeTerms;
        this.extAttributes = extAttributes;
        this.orderRateInfo = orderRateInfo;
    }

    @Override
    public String toString() {
        return "TradeInfo{" +
                "baseInfo=" + baseInfo +
                ", vguaranteesTerms=" + vguaranteesTerms +
                ", internationalLogistics=" + internationalLogistics +
                ", nativeLogistics=" + nativeLogistics +
                ", productItems=" + productItems +
                ", tradeTerms=" + tradeTerms +
                ", extAttributes=" + extAttributes +
                ", orderRateInfo=" + orderRateInfo +
                '}';
    }

    /**
     * Gets base info.
     *
     * @return the base info
     */
    public OrderBaseInfo getBaseInfo() {
        return baseInfo;
    }

    /**
     * Sets base info.
     *
     * @param baseInfo the base info
     */
    public void setBaseInfo(OrderBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    /**
     * Gets vguarantees terms.
     *
     * @return the vguarantees terms
     */
    public GuaranteeTermsInfo getVguaranteesTerms() {
        return vguaranteesTerms;
    }

    /**
     * Sets vguarantees terms.
     *
     * @param vguaranteesTerms the vguarantees terms
     */
    public void setVguaranteesTerms(GuaranteeTermsInfo vguaranteesTerms) {
        this.vguaranteesTerms = vguaranteesTerms;
    }

    /**
     * Gets international logistics.
     *
     * @return the international logistics
     */
    public InternationalLogisticsInfo getInternationalLogistics() {
        return internationalLogistics;
    }

    /**
     * Sets international logistics.
     *
     * @param internationalLogistics the international logistics
     */
    public void setInternationalLogistics(InternationalLogisticsInfo internationalLogistics) {
        this.internationalLogistics = internationalLogistics;
    }

    /**
     * Gets native logistics.
     *
     * @return the native logistics
     */
    public NativeLogisticsInfo getNativeLogistics() {
        return nativeLogistics;
    }

    /**
     * Sets native logistics.
     *
     * @param nativeLogistics the native logistics
     */
    public void setNativeLogistics(NativeLogisticsInfo nativeLogistics) {
        this.nativeLogistics = nativeLogistics;
    }

    /**
     * Gets product items.
     *
     * @return the product items
     */
    public List<ProductItemInfo> getProductItems() {
        return productItems;
    }

    /**
     * Sets product items.
     *
     * @param productItems the product items
     */
    public void setProductItems(List<ProductItemInfo> productItems) {
        this.productItems = productItems;
    }

    /**
     * Gets trade terms.
     *
     * @return the trade terms
     */
    public List<TradeTermsInfo> getTradeTerms() {
        return tradeTerms;
    }

    /**
     * Sets trade terms.
     *
     * @param tradeTerms the trade terms
     */
    public void setTradeTerms(List<TradeTermsInfo> tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    /**
     * Gets ext attributes.
     *
     * @return the ext attributes
     */
    public List<KeyValuePair> getExtAttributes() {
        return extAttributes;
    }

    /**
     * Sets ext attributes.
     *
     * @param extAttributes the ext attributes
     */
    public void setExtAttributes(List<KeyValuePair> extAttributes) {
        this.extAttributes = extAttributes;
    }

    /**
     * Gets order rate info.
     *
     * @return the order rate info
     */
    public OrderRateInfo getOrderRateInfo() {
        return orderRateInfo;
    }

    /**
     * Sets order rate info.
     *
     * @param orderRateInfo the order rate info
     */
    public void setOrderRateInfo(OrderRateInfo orderRateInfo) {
        this.orderRateInfo = orderRateInfo;
    }
}
