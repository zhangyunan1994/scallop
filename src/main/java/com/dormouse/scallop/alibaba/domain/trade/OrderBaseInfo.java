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
 * The type Order base info.
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

    /**
     * Instantiates a new Order base info.
     */
    public OrderBaseInfo() {
    }

    /**
     * Instantiates a new Order base info.
     *
     * @param allDeliveredTime  the all delivered time
     * @param businessType      the business type
     * @param buyerID           the buyer id
     * @param buyerMemo         the buyer memo
     * @param buyerSubID        the buyer sub id
     * @param completeTime      the complete time
     * @param createTime        the create time
     * @param currency          the currency
     * @param id                the id
     * @param modifyTime        the modify time
     * @param payTime           the pay time
     * @param receivingTime     the receiving time
     * @param refund            the refund
     * @param remark            the remark
     * @param sellerID          the seller id
     * @param sellerMemo        the seller memo
     * @param sellerSubID       the seller sub id
     * @param shippingFee       the shipping fee
     * @param status            the status
     * @param totalAmount       the total amount
     * @param buyerRemarkIcon   the buyer remark icon
     * @param sellerRemarkIcon  the seller remark icon
     * @param discount          the discount
     * @param buyerContact      the buyer contact
     * @param sellerContact     the seller contact
     * @param tradeType         the trade type
     * @param refundStatus      the refund status
     * @param refundStatusForAs the refund status for as
     * @param refundPayment     the refund payment
     * @param idOfStr           the id of str
     */
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

    /**
     * Gets all delivered time.
     *
     * @return the all delivered time
     */
    public Date getAllDeliveredTime() {
        return allDeliveredTime;
    }

    /**
     * Sets all delivered time.
     *
     * @param allDeliveredTime the all delivered time
     * @throws ParseException the parse exception
     */
    public void setAllDeliveredTime(String allDeliveredTime) throws ParseException {
        this.allDeliveredTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(allDeliveredTime);
    }

    /**
     * Gets business type.
     *
     * @return the business type
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * Sets business type.
     *
     * @param businessType the business type
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    /**
     * Gets buyer id.
     *
     * @return the buyer id
     */
    public String getBuyerID() {
        return buyerID;
    }

    /**
     * Sets buyer id.
     *
     * @param buyerID the buyer id
     */
    public void setBuyerID(String buyerID) {
        this.buyerID = buyerID;
    }

    /**
     * Gets buyer memo.
     *
     * @return the buyer memo
     */
    public String getBuyerMemo() {
        return buyerMemo;
    }

    /**
     * Sets buyer memo.
     *
     * @param buyerMemo the buyer memo
     */
    public void setBuyerMemo(String buyerMemo) {
        this.buyerMemo = buyerMemo;
    }

    /**
     * Gets buyer sub id.
     *
     * @return the buyer sub id
     */
    public Long getBuyerSubID() {
        return buyerSubID;
    }

    /**
     * Sets buyer sub id.
     *
     * @param buyerSubID the buyer sub id
     */
    public void setBuyerSubID(Long buyerSubID) {
        this.buyerSubID = buyerSubID;
    }

    /**
     * Gets complete time.
     *
     * @return the complete time
     */
    public Date getCompleteTime() {
        return completeTime;
    }

    /**
     * Sets complete time.
     *
     * @param completeTime the complete time
     * @throws ParseException the parse exception
     */
    public void setCompleteTime(String completeTime) throws ParseException {
        this.completeTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(completeTime);
    }

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Sets create time.
     *
     * @param createTime the create time
     * @throws ParseException the parse exception
     */
    public void setCreateTime(String createTime) throws ParseException {
        this.createTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(createTime);
    }

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets modify time.
     *
     * @return the modify time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * Sets modify time.
     *
     * @param modifyTime the modify time
     * @throws ParseException the parse exception
     */
    public void setModifyTime(String modifyTime) throws ParseException {
        this.modifyTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(modifyTime);
    }

    /**
     * Gets pay time.
     *
     * @return the pay time
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * Sets pay time.
     *
     * @param payTime the pay time
     * @throws ParseException the parse exception
     */
    public void setPayTime(String payTime) throws ParseException {
        this.payTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(payTime);
    }

    /**
     * Gets receiving time.
     *
     * @return the receiving time
     */
    public Date getReceivingTime() {
        return receivingTime;
    }

    /**
     * Sets receiving time.
     *
     * @param receivingTime the receiving time
     * @throws ParseException the parse exception
     */
    public void setReceivingTime(String receivingTime) throws ParseException {
        this.receivingTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(receivingTime);
    }

    /**
     * Gets refund.
     *
     * @return the refund
     */
    public BigDecimal getRefund() {
        return refund;
    }

    /**
     * Sets refund.
     *
     * @param refund the refund
     */
    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Gets seller id.
     *
     * @return the seller id
     */
    public String getSellerID() {
        return sellerID;
    }

    /**
     * Sets seller id.
     *
     * @param sellerID the seller id
     */
    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    /**
     * Gets seller memo.
     *
     * @return the seller memo
     */
    public String getSellerMemo() {
        return sellerMemo;
    }

    /**
     * Sets seller memo.
     *
     * @param sellerMemo the seller memo
     */
    public void setSellerMemo(String sellerMemo) {
        this.sellerMemo = sellerMemo;
    }

    /**
     * Gets seller sub id.
     *
     * @return the seller sub id
     */
    public Long getSellerSubID() {
        return sellerSubID;
    }

    /**
     * Sets seller sub id.
     *
     * @param sellerSubID the seller sub id
     */
    public void setSellerSubID(Long sellerSubID) {
        this.sellerSubID = sellerSubID;
    }

    /**
     * Gets shipping fee.
     *
     * @return the shipping fee
     */
    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    /**
     * Sets shipping fee.
     *
     * @param shippingFee the shipping fee
     */
    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Gets buyer remark icon.
     *
     * @return the buyer remark icon
     */
    public String getBuyerRemarkIcon() {
        return buyerRemarkIcon;
    }

    /**
     * Sets buyer remark icon.
     *
     * @param buyerRemarkIcon the buyer remark icon
     */
    public void setBuyerRemarkIcon(String buyerRemarkIcon) {
        this.buyerRemarkIcon = buyerRemarkIcon;
    }

    /**
     * Gets seller remark icon.
     *
     * @return the seller remark icon
     */
    public String getSellerRemarkIcon() {
        return sellerRemarkIcon;
    }

    /**
     * Sets seller remark icon.
     *
     * @param sellerRemarkIcon the seller remark icon
     */
    public void setSellerRemarkIcon(String sellerRemarkIcon) {
        this.sellerRemarkIcon = sellerRemarkIcon;
    }

    /**
     * Gets discount.
     *
     * @return the discount
     */
    public Long getDiscount() {
        return discount;
    }

    /**
     * Sets discount.
     *
     * @param discount the discount
     */
    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    /**
     * Gets buyer contact.
     *
     * @return the buyer contact
     */
    public TradeContact getBuyerContact() {
        return buyerContact;
    }

    /**
     * Sets buyer contact.
     *
     * @param buyerContact the buyer contact
     */
    public void setBuyerContact(TradeContact buyerContact) {
        this.buyerContact = buyerContact;
    }

    /**
     * Gets seller contact.
     *
     * @return the seller contact
     */
    public TradeContact getSellerContact() {
        return sellerContact;
    }

    /**
     * Sets seller contact.
     *
     * @param sellerContact the seller contact
     */
    public void setSellerContact(TradeContact sellerContact) {
        this.sellerContact = sellerContact;
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
     * Gets refund status for as.
     *
     * @return the refund status for as
     */
    public String getRefundStatusForAs() {
        return refundStatusForAs;
    }

    /**
     * Sets refund status for as.
     *
     * @param refundStatusForAs the refund status for as
     */
    public void setRefundStatusForAs(String refundStatusForAs) {
        this.refundStatusForAs = refundStatusForAs;
    }

    /**
     * Gets refund payment.
     *
     * @return the refund payment
     */
    public Long getRefundPayment() {
        return refundPayment;
    }

    /**
     * Sets refund payment.
     *
     * @param refundPayment the refund payment
     */
    public void setRefundPayment(Long refundPayment) {
        this.refundPayment = refundPayment;
    }

    /**
     * Gets id of str.
     *
     * @return the id of str
     */
    public String getIdOfStr() {
        return idOfStr;
    }

    /**
     * Sets id of str.
     *
     * @param idOfStr the id of str
     */
    public void setIdOfStr(String idOfStr) {
        this.idOfStr = idOfStr;
    }
}
