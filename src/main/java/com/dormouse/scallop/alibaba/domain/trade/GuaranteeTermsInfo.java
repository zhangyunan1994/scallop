/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;


/**
 * The type Guarantee terms info.
 *
 * @author yunan.zhang
 * @version 0.0.1
 */
public class GuaranteeTermsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String assuranceInfo;//	java.lang.String	否	保障条款
    private String assuranceType;//	java.lang.String	否	保障方式。国际站：TA(信保)
    private String qualityAssuranceType;//	java.lang.String	否	质量保证类型。国际站：pre_shipment(发货前),post_delivery(发货后)

    /**
     * Instantiates a new Guarantee terms info.
     */
    public GuaranteeTermsInfo() {
    }

    /**
     * Instantiates a new Guarantee terms info.
     *
     * @param assuranceInfo        the assurance info
     * @param assuranceType        the assurance type
     * @param qualityAssuranceType the quality assurance type
     */
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

    /**
     * Gets assurance info.
     *
     * @return the assurance info
     */
    public String getAssuranceInfo() {
        return assuranceInfo;
    }

    /**
     * Sets assurance info.
     *
     * @param assuranceInfo the assurance info
     */
    public void setAssuranceInfo(String assuranceInfo) {
        this.assuranceInfo = assuranceInfo;
    }

    /**
     * Gets assurance type.
     *
     * @return the assurance type
     */
    public String getAssuranceType() {
        return assuranceType;
    }

    /**
     * Sets assurance type.
     *
     * @param assuranceType the assurance type
     */
    public void setAssuranceType(String assuranceType) {
        this.assuranceType = assuranceType;
    }

    /**
     * Gets quality assurance type.
     *
     * @return the quality assurance type
     */
    public String getQualityAssuranceType() {
        return qualityAssuranceType;
    }

    /**
     * Sets quality assurance type.
     *
     * @param qualityAssuranceType the quality assurance type
     */
    public void setQualityAssuranceType(String qualityAssuranceType) {
        this.qualityAssuranceType = qualityAssuranceType;
    }
}
