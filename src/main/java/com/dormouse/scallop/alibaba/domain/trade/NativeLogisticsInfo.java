/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;
import java.util.List;


/**
 * The type Native logistics info.
 *
 * @author yunan.zhang
 * @version 0.0.1
 */
public class NativeLogisticsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String address;//	java.lang.String	否	详细地址
    private String area;//	java.lang.String	否	县，区
    private String areaCode;//	java.lang.String	否	省市区编码
    private String city;//	java.lang.String	否	城市
    private String contactPerson;//	java.lang.String	否	联系人姓名
    private String fax;//	java.lang.String	否	传真
    private String mobile;//	java.lang.String	否	手机
    private String province;//	java.lang.String	否	省份
    private String telephone;//	java.lang.String	否	电话
    private String zip;//	java.lang.String	否	邮编
    private List<NativeLogisticsItemsInfo> logisticsItems;//	alibaba.openplatform.trade.model.NativeLogisticsItemsInfo[]	否	运单明细
    private String townCode;//	java.lang.String	否	镇，街道地址码
    private String town;//	java.lang.String	否	镇，街道

    /**
     * Instantiates a new Native logistics info.
     */
    public NativeLogisticsInfo() {
    }

    /**
     * Instantiates a new Native logistics info.
     *
     * @param address        the address
     * @param area           the area
     * @param areaCode       the area code
     * @param city           the city
     * @param contactPerson  the contact person
     * @param fax            the fax
     * @param mobile         the mobile
     * @param province       the province
     * @param telephone      the telephone
     * @param zip            the zip
     * @param logisticsItems the logistics items
     * @param townCode       the town code
     * @param town           the town
     */
    public NativeLogisticsInfo(String address, String area, String areaCode, String city, String contactPerson, String fax, String mobile, String province, String telephone, String zip, List<NativeLogisticsItemsInfo> logisticsItems, String townCode, String town) {
        this.address = address;
        this.area = area;
        this.areaCode = areaCode;
        this.city = city;
        this.contactPerson = contactPerson;
        this.fax = fax;
        this.mobile = mobile;
        this.province = province;
        this.telephone = telephone;
        this.zip = zip;
        this.logisticsItems = logisticsItems;
        this.townCode = townCode;
        this.town = town;
    }

    @Override
    public String toString() {
        return "NativeLogisticsInfo{" +
                "address='" + address + '\'' +
                ", area='" + area + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", city='" + city + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", fax='" + fax + '\'' +
                ", mobile='" + mobile + '\'' +
                ", province='" + province + '\'' +
                ", telephone='" + telephone + '\'' +
                ", zip='" + zip + '\'' +
                ", logisticsItems=" + logisticsItems +
                ", townCode='" + townCode + '\'' +
                ", town='" + town + '\'' +
                '}';
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets area.
     *
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets area.
     *
     * @param area the area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Gets area code.
     *
     * @return the area code
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets area code.
     *
     * @param areaCode the area code
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets contact person.
     *
     * @return the contact person
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets contact person.
     *
     * @param contactPerson the contact person
     */
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    /**
     * Gets fax.
     *
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets fax.
     *
     * @param fax the fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Gets province.
     *
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets province.
     *
     * @param province the province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Gets telephone.
     *
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets telephone.
     *
     * @param telephone the telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Gets zip.
     *
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets zip.
     *
     * @param zip the zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Gets logistics items.
     *
     * @return the logistics items
     */
    public List<NativeLogisticsItemsInfo> getLogisticsItems() {
        return logisticsItems;
    }

    /**
     * Sets logistics items.
     *
     * @param logisticsItems the logistics items
     */
    public void setLogisticsItems(List<NativeLogisticsItemsInfo> logisticsItems) {
        this.logisticsItems = logisticsItems;
    }

    /**
     * Gets town code.
     *
     * @return the town code
     */
    public String getTownCode() {
        return townCode;
    }

    /**
     * Sets town code.
     *
     * @param townCode the town code
     */
    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    /**
     * Gets town.
     *
     * @return the town
     */
    public String getTown() {
        return town;
    }

    /**
     * Sets town.
     *
     * @param town the town
     */
    public void setTown(String town) {
        this.town = town;
    }
}
