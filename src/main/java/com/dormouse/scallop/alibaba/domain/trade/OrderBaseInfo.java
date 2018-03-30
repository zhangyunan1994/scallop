/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/30 下午9:03
 * todo  :
 */
public class OrderBaseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date allDeliveredTime;//	java.util.Date	否	完全发货时间
    private String businessType;//	java.lang.String	否	业务类型。国际站：ta(信保),wholesale(在线批发)。 中文站：普通订单类型 = "cn"; 大额批发订单类型 = "ws"; 普通拿样订单类型 = "yp"; 一分钱拿样订单类型 = "yf"; 倒批(限时折扣)订单类型 = "fs"; 加工定制订单类型 = "cz"; 协议采购订单类型 = "ag"; 伙拼订单类型 = "hp"; 供销订单类型 = "supply"; 淘工厂订单 = "factory"; 快订下单 = "quick"; 享拼订单 = "xiangpin"; 当面付 = "f2f"; 存样服务 = "cyfw"; 代销订单 = "sp"; 微供订单 = "wg";
    private String buyerID;//	java.lang.String	否	买家主账号id
    private String buyerMemo;//	java.lang.String	否	买家备忘信息
    private Long buyerSubID;//	java.lang.Long	否	买家子账号id，1688无此内容
    private Date completeTime;//	java.util.Date	否	完成时间
    private Date createTime;//	java.util.Date	否	创建时间
    private String currency;//	java.lang.String	否	币种，币种，整个交易单使用同一个币种。值范围：USD,RMB,HKD,GBP,CAD,AUD,JPY,KRW,EUR
    private Long id;//	java.lang.Long	否	交易id
    private Date modifyTime;//	java.util.Date	否	修改时间
    private Date payTime;//	java.util.Date	否	付款时间，如果有多次付款，这里返回的是首次付款时间
    private Date receivingTime;//	java.util.Date	否	收货时间，这里返回的是完全收货时间
    private BigDecimal refund;//	java.math.BigDecimal	否	退款金额，单位为元
    private String remark;//	java.lang.String	否	备注，1688指下单时的备注
    private String sellerID;//	java.lang.String	否	卖家主账号id
    private String sellerMemo;//	java.lang.String	否	卖家备忘信息
    private Long sellerSubID;//	java.lang.Long	否	卖家子账号id，1688无此内容
    private BigDecimal shippingFee;//	java.math.BigDecimal	否	运费，单位为元
    private String status;//	java.lang.String	否	交易状态
    private BigDecimal totalAmount;//	java.math.BigDecimal	否	应付款总金额，totalAmount = ∑itemAmount + shippingFee，单位为元
    private String buyerRemarkIcon;//	String	否	买家备忘标志
    private String sellerRemarkIcon;//	String	否	卖家备忘标志
    private Long discount;//	Long	否	折扣信息
    private TradeContact buyerContact;//	alibaba.trade.tradeContact	否	买家联系人
    private TradeContact sellerContact;//	alibaba.trade.tradeContact	否	卖家联系人
    private String tradeType;//	String	否	1:担保交易 2:预存款交易 3:ETC境外收单交易 4:即时到帐交易 5:保障金安全交易 6:统一交易流程 7:分阶段付款 8.货到付款交易 9.信用凭证支付交易 10.账期支付交易
    private String refundStatus;//	String	否	订单的售中退款状态
    private String refundStatusForAs;//	String	否	订单的售后退款状态
    private Long refundPayment;//	Long	否	退款金额
    private String idOfStr;//	String	否	交易id(字符串格式)

    public OrderBaseInfo() {
    }

    public OrderBaseInfo(Date allDeliveredTime, String businessType, String buyerID, String buyerMemo, Long buyerSubID, Date completeTime, Date createTime, String currency, Long id, Date modifyTime, Date payTime, Date receivingTime, BigDecimal refund, String remark, String sellerID, String sellerMemo, Long sellerSubID, BigDecimal shippingFee, String status, BigDecimal totalAmount, String buyerRemarkIcon, String sellerRemarkIcon, Long discount, TradeContact buyerContact, TradeContact sellerContact, String tradeType, String refundStatus, String refundStatusForAs, Long refundPayment, String idOfStr) {
        this.allDeliveredTime = allDeliveredTime;
        this.businessType = businessType;
        this.buyerID = buyerID;
        this.buyerMemo = buyerMemo;
        this.buyerSubID = buyerSubID;
        this.completeTime = completeTime;
        this.createTime = createTime;
        this.currency = currency;
        this.id = id;
        this.modifyTime = modifyTime;
        this.payTime = payTime;
        this.receivingTime = receivingTime;
        this.refund = refund;
        this.remark = remark;
        this.sellerID = sellerID;
        this.sellerMemo = sellerMemo;
        this.sellerSubID = sellerSubID;
        this.shippingFee = shippingFee;
        this.status = status;
        this.totalAmount = totalAmount;
        this.buyerRemarkIcon = buyerRemarkIcon;
        this.sellerRemarkIcon = sellerRemarkIcon;
        this.discount = discount;
        this.buyerContact = buyerContact;
        this.sellerContact = sellerContact;
        this.tradeType = tradeType;
        this.refundStatus = refundStatus;
        this.refundStatusForAs = refundStatusForAs;
        this.refundPayment = refundPayment;
        this.idOfStr = idOfStr;
    }

    @Override
    public String toString() {
        return "OrderBaseInfo{" +
                "allDeliveredTime=" + allDeliveredTime +
                ", businessType='" + businessType + '\'' +
                ", buyerID='" + buyerID + '\'' +
                ", buyerMemo='" + buyerMemo + '\'' +
                ", buyerSubID=" + buyerSubID +
                ", completeTime=" + completeTime +
                ", createTime=" + createTime +
                ", currency='" + currency + '\'' +
                ", id=" + id +
                ", modifyTime=" + modifyTime +
                ", payTime=" + payTime +
                ", receivingTime=" + receivingTime +
                ", refund=" + refund +
                ", remark='" + remark + '\'' +
                ", sellerID='" + sellerID + '\'' +
                ", sellerMemo='" + sellerMemo + '\'' +
                ", sellerSubID=" + sellerSubID +
                ", shippingFee=" + shippingFee +
                ", status='" + status + '\'' +
                ", totalAmount=" + totalAmount +
                ", buyerRemarkIcon='" + buyerRemarkIcon + '\'' +
                ", sellerRemarkIcon='" + sellerRemarkIcon + '\'' +
                ", discount=" + discount +
                ", buyerContact=" + buyerContact +
                ", sellerContact=" + sellerContact +
                ", tradeType='" + tradeType + '\'' +
                ", refundStatus='" + refundStatus + '\'' +
                ", refundStatusForAs='" + refundStatusForAs + '\'' +
                ", refundPayment=" + refundPayment +
                ", idOfStr='" + idOfStr + '\'' +
                '}';
    }

    public Date getAllDeliveredTime() {
        return allDeliveredTime;
    }

    public void setAllDeliveredTime(String allDeliveredTime) throws ParseException {
        this.allDeliveredTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(allDeliveredTime);
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(String buyerID) {
        this.buyerID = buyerID;
    }

    public String getBuyerMemo() {
        return buyerMemo;
    }

    public void setBuyerMemo(String buyerMemo) {
        this.buyerMemo = buyerMemo;
    }

    public Long getBuyerSubID() {
        return buyerSubID;
    }

    public void setBuyerSubID(Long buyerSubID) {
        this.buyerSubID = buyerSubID;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) throws ParseException {
        this.completeTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(completeTime);
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) throws ParseException {
        this.createTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(createTime);
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) throws ParseException {
        this.modifyTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(modifyTime);
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) throws ParseException {
        this.payTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(payTime);
    }

    public Date getReceivingTime() {
        return receivingTime;
    }

    public void setReceivingTime(String receivingTime) throws ParseException {
        this.receivingTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(receivingTime);
    }

    public BigDecimal getRefund() {
        return refund;
    }

    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSellerID() {
        return sellerID;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    public String getSellerMemo() {
        return sellerMemo;
    }

    public void setSellerMemo(String sellerMemo) {
        this.sellerMemo = sellerMemo;
    }

    public Long getSellerSubID() {
        return sellerSubID;
    }

    public void setSellerSubID(Long sellerSubID) {
        this.sellerSubID = sellerSubID;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getBuyerRemarkIcon() {
        return buyerRemarkIcon;
    }

    public void setBuyerRemarkIcon(String buyerRemarkIcon) {
        this.buyerRemarkIcon = buyerRemarkIcon;
    }

    public String getSellerRemarkIcon() {
        return sellerRemarkIcon;
    }

    public void setSellerRemarkIcon(String sellerRemarkIcon) {
        this.sellerRemarkIcon = sellerRemarkIcon;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public TradeContact getBuyerContact() {
        return buyerContact;
    }

    public void setBuyerContact(TradeContact buyerContact) {
        this.buyerContact = buyerContact;
    }

    public TradeContact getSellerContact() {
        return sellerContact;
    }

    public void setSellerContact(TradeContact sellerContact) {
        this.sellerContact = sellerContact;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundStatusForAs() {
        return refundStatusForAs;
    }

    public void setRefundStatusForAs(String refundStatusForAs) {
        this.refundStatusForAs = refundStatusForAs;
    }

    public Long getRefundPayment() {
        return refundPayment;
    }

    public void setRefundPayment(Long refundPayment) {
        this.refundPayment = refundPayment;
    }

    public String getIdOfStr() {
        return idOfStr;
    }

    public void setIdOfStr(String idOfStr) {
        this.idOfStr = idOfStr;
    }
}
