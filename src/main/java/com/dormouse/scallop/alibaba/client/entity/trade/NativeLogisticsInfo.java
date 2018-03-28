package com.dormouse.scallop.alibaba.client.entity.trade;

import java.io.Serializable;
import java.util.List;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/30 下午9:24
 * todo  :
 */
public class NativeLogisticsInfo implements Serializable{

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

    public NativeLogisticsInfo() {
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public List<NativeLogisticsItemsInfo> getLogisticsItems() {
        return logisticsItems;
    }

    public void setLogisticsItems(List<NativeLogisticsItemsInfo> logisticsItems) {
        this.logisticsItems = logisticsItems;
    }

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
