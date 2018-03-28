package com.dormouse.scallop.alibaba.client.entity.trade;

import java.io.Serializable;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/30 下午9:13
 * todo  :
 */
public class GuaranteeTermsInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private String assuranceInfo;//	java.lang.String	否	保障条款
    private String assuranceType;//	java.lang.String	否	保障方式。国际站：TA(信保)
    private String qualityAssuranceType;//	java.lang.String	否	质量保证类型。国际站：pre_shipment(发货前),post_delivery(发货后)

    public GuaranteeTermsInfo() {
    }

    public GuaranteeTermsInfo(String assuranceInfo, String assuranceType, String qualityAssuranceType) {
        this.assuranceInfo = assuranceInfo;
        this.assuranceType = assuranceType;
        this.qualityAssuranceType = qualityAssuranceType;
    }

    @Override
    public String toString() {
        return "GuaranteeTermsInfo{" +
                "assuranceInfo='" + assuranceInfo + '\'' +
                ", assuranceType='" + assuranceType + '\'' +
                ", qualityAssuranceType='" + qualityAssuranceType + '\'' +
                '}';
    }

    public String getAssuranceInfo() {
        return assuranceInfo;
    }

    public void setAssuranceInfo(String assuranceInfo) {
        this.assuranceInfo = assuranceInfo;
    }

    public String getAssuranceType() {
        return assuranceType;
    }

    public void setAssuranceType(String assuranceType) {
        this.assuranceType = assuranceType;
    }

    public String getQualityAssuranceType() {
        return qualityAssuranceType;
    }

    public void setQualityAssuranceType(String qualityAssuranceType) {
        this.qualityAssuranceType = qualityAssuranceType;
    }
}
