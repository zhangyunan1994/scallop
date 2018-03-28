package com.dormouse.scallop.alibaba.client.entity.trade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/30 下午9:31
 * todo  :
 */
public class TradeTermsInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private String payStatus;//	java.lang.String	否	支付状态。国际站：WAIT_PAY(未支付),PAYER_PAID(已完成支付),PART_SUCCESS(部分支付成功),PAY_SUCCESS(支付成功),CLOSED(风控关闭),CANCELLED(支付撤销),SUCCESS(成功),FAIL(失败)。 1688:未付款，1;已付款，2;全额退款，4;卖家有收到钱，回款完成，6 ;未创建外部支付单，7; 付款前取消 ，8 ; 正在支付中 ，9
    private Date payTime;//	java.util.Date	否	完成阶段支付时间
    private String payWay;//	java.lang.String	否	支付方式。国际站：ECL(融资支付),CC(信用卡),TT(线下TT),ACH(echecking支付)。 1688:支付宝1;网商银行金票2;赊购(诚e赊)3;网商银行大额转账4;电子承兑汇票 6;账期支付 7;虚拟支付8;不进行任何支付动作 9;零售通赊购支付 10
    private BigDecimal phasAmount;//	java.math.BigDecimal	否	阶段金额
    private Long phase;//	java.lang.Long	否	阶段
    private String phaseCondition;//	java.lang.String	否	阶段条件，1688无此内容
    private String phaseDate;//	java.lang.String	否	阶段时间，1688无此内容

    public TradeTermsInfo() {
    }

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

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public BigDecimal getPhasAmount() {
        return phasAmount;
    }

    public void setPhasAmount(BigDecimal phasAmount) {
        this.phasAmount = phasAmount;
    }

    public Long getPhase() {
        return phase;
    }

    public void setPhase(Long phase) {
        this.phase = phase;
    }

    public String getPhaseCondition() {
        return phaseCondition;
    }

    public void setPhaseCondition(String phaseCondition) {
        this.phaseCondition = phaseCondition;
    }

    public String getPhaseDate() {
        return phaseDate;
    }

    public void setPhaseDate(String phaseDate) {
        this.phaseDate = phaseDate;
    }
}
