/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The type Trade terms info.
 */
public class TradeTermsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String payStatus;//	java.lang.String	否	支付状态。国际站：WAIT_PAY(未支付),PAYER_PAID(已完成支付),PART_SUCCESS(部分支付成功),PAY_SUCCESS(支付成功),CLOSED(风控关闭),CANCELLED(支付撤销),SUCCESS(成功),FAIL(失败)。 1688:未付款，1;已付款，2;全额退款，4;卖家有收到钱，回款完成，6 ;未创建外部支付单，7; 付款前取消 ，8 ; 正在支付中 ，9
    private Date payTime;//	java.util.Date	否	完成阶段支付时间
    private String payWay;//	java.lang.String	否	支付方式。国际站：ECL(融资支付),CC(信用卡),TT(线下TT),ACH(echecking支付)。 1688:支付宝1;网商银行金票2;赊购(诚e赊)3;网商银行大额转账4;电子承兑汇票 6;账期支付 7;虚拟支付8;不进行任何支付动作 9;零售通赊购支付 10
    private BigDecimal phasAmount;//	java.math.BigDecimal	否	阶段金额
    private Long phase;//	java.lang.Long	否	阶段
    private String phaseCondition;//	java.lang.String	否	阶段条件，1688无此内容
    private String phaseDate;//	java.lang.String	否	阶段时间，1688无此内容

    /**
     * Instantiates a new Trade terms info.
     */
    public TradeTermsInfo() {
    }

    /**
     * Instantiates a new Trade terms info.
     *
     * @param payStatus      the pay status
     * @param payTime        the pay time
     * @param payWay         the pay way
     * @param phasAmount     the phas amount
     * @param phase          the phase
     * @param phaseCondition the phase condition
     * @param phaseDate      the phase date
     */
    public TradeTermsInfo(String payStatus, Date payTime, String payWay, BigDecimal phasAmount, Long phase, String phaseCondition, String phaseDate) {
        this.payStatus = payStatus;
        this.payTime = payTime;
        this.payWay = payWay;
        this.phasAmount = phasAmount;
        this.phase = phase;
        this.phaseCondition = phaseCondition;
        this.phaseDate = phaseDate;
    }

    @Override
    public String toString() {
        return "TradeTermsInfo{" +
                "payStatus='" + payStatus + '\'' +
                ", payTime=" + payTime +
                ", payWay='" + payWay + '\'' +
                ", phasAmount=" + phasAmount +
                ", phase=" + phase +
                ", phaseCondition='" + phaseCondition + '\'' +
                ", phaseDate='" + phaseDate + '\'' +
                '}';
    }

    /**
     * Gets pay status.
     *
     * @return the pay status
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * Sets pay status.
     *
     * @param payStatus the pay status
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
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
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * Gets pay way.
     *
     * @return the pay way
     */
    public String getPayWay() {
        return payWay;
    }

    /**
     * Sets pay way.
     *
     * @param payWay the pay way
     */
    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    /**
     * Gets phas amount.
     *
     * @return the phas amount
     */
    public BigDecimal getPhasAmount() {
        return phasAmount;
    }

    /**
     * Sets phas amount.
     *
     * @param phasAmount the phas amount
     */
    public void setPhasAmount(BigDecimal phasAmount) {
        this.phasAmount = phasAmount;
    }

    /**
     * Gets phase.
     *
     * @return the phase
     */
    public Long getPhase() {
        return phase;
    }

    /**
     * Sets phase.
     *
     * @param phase the phase
     */
    public void setPhase(Long phase) {
        this.phase = phase;
    }

    /**
     * Gets phase condition.
     *
     * @return the phase condition
     */
    public String getPhaseCondition() {
        return phaseCondition;
    }

    /**
     * Sets phase condition.
     *
     * @param phaseCondition the phase condition
     */
    public void setPhaseCondition(String phaseCondition) {
        this.phaseCondition = phaseCondition;
    }

    /**
     * Gets phase date.
     *
     * @return the phase date
     */
    public String getPhaseDate() {
        return phaseDate;
    }

    /**
     * Sets phase date.
     *
     * @param phaseDate the phase date
     */
    public void setPhaseDate(String phaseDate) {
        this.phaseDate = phaseDate;
    }
}
