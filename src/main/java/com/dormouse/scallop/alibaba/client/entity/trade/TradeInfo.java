package com.dormouse.scallop.alibaba.client.entity.trade;

import java.io.Serializable;
import java.util.List;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/30 下午8:56
 * todo  :
 */
public class TradeInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private OrderBaseInfo baseInfo;//	alibaba.openplatform.trade.model.OrderBaseInfo	否	订单基础信息
    private GuaranteeTermsInfo vguaranteesTerms;//	alibaba.openplatform.trade.model.GuaranteeTermsInfo	否	保障条款
    private InternationalLogisticsInfo internationalLogistics;//	alibaba.openplatform.trade.model.InternationalLogisticsInfo	否	国际物流
    private NativeLogisticsInfo nativeLogistics;//	alibaba.openplatform.trade.model.NativeLogisticsInfo	否	国内物流
    private List<ProductItemInfo> productItems;//	alibaba.openplatform.trade.model.ProductItemInfo[]	否	商品条目信息
    private List<TradeTermsInfo> tradeTerms;//	alibaba.openplatform.trade.model.TradeTermsInfo[]	否	交易条款
    private List<KeyValuePair> extAttributes;//	alibaba.openplatform.trade.KeyValuePair[]	否	订单扩展属性
    private OrderRateInfo orderRateInfo;//	alibaba.trade.OrderRateInfo	否	订单评价信息

    public TradeInfo() {
    }

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

    public OrderBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(OrderBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public GuaranteeTermsInfo getVguaranteesTerms() {
        return vguaranteesTerms;
    }

    public void setVguaranteesTerms(GuaranteeTermsInfo vguaranteesTerms) {
        this.vguaranteesTerms = vguaranteesTerms;
    }

    public InternationalLogisticsInfo getInternationalLogistics() {
        return internationalLogistics;
    }

    public void setInternationalLogistics(InternationalLogisticsInfo internationalLogistics) {
        this.internationalLogistics = internationalLogistics;
    }

    public NativeLogisticsInfo getNativeLogistics() {
        return nativeLogistics;
    }

    public void setNativeLogistics(NativeLogisticsInfo nativeLogistics) {
        this.nativeLogistics = nativeLogistics;
    }

    public List<ProductItemInfo> getProductItems() {
        return productItems;
    }

    public void setProductItems(List<ProductItemInfo> productItems) {
        this.productItems = productItems;
    }

    public List<TradeTermsInfo> getTradeTerms() {
        return tradeTerms;
    }

    public void setTradeTerms(List<TradeTermsInfo> tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    public List<KeyValuePair> getExtAttributes() {
        return extAttributes;
    }

    public void setExtAttributes(List<KeyValuePair> extAttributes) {
        this.extAttributes = extAttributes;
    }

    public OrderRateInfo getOrderRateInfo() {
        return orderRateInfo;
    }

    public void setOrderRateInfo(OrderRateInfo orderRateInfo) {
        this.orderRateInfo = orderRateInfo;
    }
}
