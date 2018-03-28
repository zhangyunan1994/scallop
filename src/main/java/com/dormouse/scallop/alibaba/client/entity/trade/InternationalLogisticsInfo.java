package com.dormouse.scallop.alibaba.client.entity.trade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/30 下午9:16
 * todo  :
 */
public class InternationalLogisticsInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private String address;//	java.lang.String	否	详细地址
    private Date allDeliveredTime;;//		java.util.Date	否	完全发货时间
    private String alternateAddress;//		java.lang.String	否	备用地址
    private String carrier;//		java.lang.String	否	承运商
    private String city;//		java.lang.String	否	城市
    private String cityCode;//		java.lang.String	否	城市编号
    private String contactPerson;//		java.lang.String	否	联系人姓名
    private String country;//		java.lang.String	否	国家
    private String countryCode;//		java.lang.String	否	国家编号
    private String fax;//		java.lang.String	否	传真
    private String faxArea;//		java.lang.String	否	传真地区区号
    private String faxCountry;//		java.lang.String	否	传真国家编号
    private BigDecimal insuranceFee;//		java.math.BigDecimal	否	物流保险费
    private String logisticsCode;//	java.lang.String	否	委托单号
    private BigDecimal logisticsFee;//		java.math.BigDecimal	否	物流费用
    private String mobile;//		java.lang.String	否	手机
    private String mobileArea;//		java.lang.String	否	移动电话地区区号
    private String mobileCountry;//		java.lang.String	否	移动电话国家编号
    private String port;//		java.lang.String	否	港口
    private String portCode;//		java.lang.String	否	港口编号
    private String province;//		java.lang.String	否	省份
    private String provinceCode;//		java.lang.String	否	省份编号
    private Date shipmentAbsoluteDate;//		java.util.Date	否	绝对时间
    private String shipmentAbsoluteZone;//		java.lang.String	否	买家时区
    private String shipmentDateType;//		java.lang.String	否	倒计时类型。absolute(绝对),relative(相对)
    private String shipmentMethod;//		java.lang.String	否	发货方式。AIR(空运),SEA(海运),EXPRESS(快递),LAND(陆运),UNKNOWN(未知)
    private String shipmentRelativeDuration;//		java.lang.String	否	相对时间长度
    private String shipmentRelativeField;//		java.lang.String	否	相对时间单位。day(天),hour(时),second(秒)
    private String shipmentRelativeStart;//		java.lang.String	否	相对时间的开始点。pre_amount(预付款到帐),final_amount(尾款到帐)
    private String telephone;//		java.lang.String	否	电话
    private String telephoneArea;//		java.lang.String	否	电话地区区号
    private String telephoneCountryv;//	java.lang.String	否	电话国家编号
    private String tradeTerm;//	java.lang.String	否	贸易条款说明

    public InternationalLogisticsInfo() {
    }

    public InternationalLogisticsInfo(String address, Date allDeliveredTime, String alternateAddress, String carrier, String city, String cityCode, String contactPerson, String country, String countryCode, String fax, String faxArea, String faxCountry, BigDecimal insuranceFee, String logisticsCode, BigDecimal logisticsFee, String mobile, String mobileArea, String mobileCountry, String port, String portCode, String province, String provinceCode, Date shipmentAbsoluteDate, String shipmentAbsoluteZone, String shipmentDateType, String shipmentMethod, String shipmentRelativeDuration, String shipmentRelativeField, String shipmentRelativeStart, String telephone, String telephoneArea, String telephoneCountryv, String tradeTerm) {
        this.address = address;
        this.allDeliveredTime = allDeliveredTime;
        this.alternateAddress = alternateAddress;
        this.carrier = carrier;
        this.city = city;
        this.cityCode = cityCode;
        this.contactPerson = contactPerson;
        this.country = country;
        this.countryCode = countryCode;
        this.fax = fax;
        this.faxArea = faxArea;
        this.faxCountry = faxCountry;
        this.insuranceFee = insuranceFee;
        this.logisticsCode = logisticsCode;
        this.logisticsFee = logisticsFee;
        this.mobile = mobile;
        this.mobileArea = mobileArea;
        this.mobileCountry = mobileCountry;
        this.port = port;
        this.portCode = portCode;
        this.province = province;
        this.provinceCode = provinceCode;
        this.shipmentAbsoluteDate = shipmentAbsoluteDate;
        this.shipmentAbsoluteZone = shipmentAbsoluteZone;
        this.shipmentDateType = shipmentDateType;
        this.shipmentMethod = shipmentMethod;
        this.shipmentRelativeDuration = shipmentRelativeDuration;
        this.shipmentRelativeField = shipmentRelativeField;
        this.shipmentRelativeStart = shipmentRelativeStart;
        this.telephone = telephone;
        this.telephoneArea = telephoneArea;
        this.telephoneCountryv = telephoneCountryv;
        this.tradeTerm = tradeTerm;
    }

    @Override
    public String toString() {
        return "InternationalLogisticsInfo{" +
                "address='" + address + '\'' +
                ", allDeliveredTime=" + allDeliveredTime +
                ", alternateAddress='" + alternateAddress + '\'' +
                ", carrier='" + carrier + '\'' +
                ", city='" + city + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", country='" + country + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", fax='" + fax + '\'' +
                ", faxArea='" + faxArea + '\'' +
                ", faxCountry='" + faxCountry + '\'' +
                ", insuranceFee=" + insuranceFee +
                ", logisticsCode='" + logisticsCode + '\'' +
                ", logisticsFee=" + logisticsFee +
                ", mobile='" + mobile + '\'' +
                ", mobileArea='" + mobileArea + '\'' +
                ", mobileCountry='" + mobileCountry + '\'' +
                ", port='" + port + '\'' +
                ", portCode='" + portCode + '\'' +
                ", province='" + province + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", shipmentAbsoluteDate=" + shipmentAbsoluteDate +
                ", shipmentAbsoluteZone='" + shipmentAbsoluteZone + '\'' +
                ", shipmentDateType='" + shipmentDateType + '\'' +
                ", shipmentMethod='" + shipmentMethod + '\'' +
                ", shipmentRelativeDuration='" + shipmentRelativeDuration + '\'' +
                ", shipmentRelativeField='" + shipmentRelativeField + '\'' +
                ", shipmentRelativeStart='" + shipmentRelativeStart + '\'' +
                ", telephone='" + telephone + '\'' +
                ", telephoneArea='" + telephoneArea + '\'' +
                ", telephoneCountryv='" + telephoneCountryv + '\'' +
                ", tradeTerm='" + tradeTerm + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAllDeliveredTime() {
        return allDeliveredTime;
    }

    public void setAllDeliveredTime(String allDeliveredTime) throws ParseException {
        this.allDeliveredTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(allDeliveredTime);
    }

    public String getAlternateAddress() {
        return alternateAddress;
    }

    public void setAlternateAddress(String alternateAddress) {
        this.alternateAddress = alternateAddress;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFaxArea() {
        return faxArea;
    }

    public void setFaxArea(String faxArea) {
        this.faxArea = faxArea;
    }

    public String getFaxCountry() {
        return faxCountry;
    }

    public void setFaxCountry(String faxCountry) {
        this.faxCountry = faxCountry;
    }

    public BigDecimal getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(BigDecimal insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public BigDecimal getLogisticsFee() {
        return logisticsFee;
    }

    public void setLogisticsFee(BigDecimal logisticsFee) {
        this.logisticsFee = logisticsFee;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileArea() {
        return mobileArea;
    }

    public void setMobileArea(String mobileArea) {
        this.mobileArea = mobileArea;
    }

    public String getMobileCountry() {
        return mobileCountry;
    }

    public void setMobileCountry(String mobileCountry) {
        this.mobileCountry = mobileCountry;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPortCode() {
        return portCode;
    }

    public void setPortCode(String portCode) {
        this.portCode = portCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Date getShipmentAbsoluteDate() {
        return shipmentAbsoluteDate;
    }

    public void setShipmentAbsoluteDate(String shipmentAbsoluteDate) throws ParseException {
        this.shipmentAbsoluteDate = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(shipmentAbsoluteDate);
    }

    public String getShipmentAbsoluteZone() {
        return shipmentAbsoluteZone;
    }

    public void setShipmentAbsoluteZone(String shipmentAbsoluteZone) {
        this.shipmentAbsoluteZone = shipmentAbsoluteZone;
    }

    public String getShipmentDateType() {
        return shipmentDateType;
    }

    public void setShipmentDateType(String shipmentDateType) {
        this.shipmentDateType = shipmentDateType;
    }

    public String getShipmentMethod() {
        return shipmentMethod;
    }

    public void setShipmentMethod(String shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    public String getShipmentRelativeDuration() {
        return shipmentRelativeDuration;
    }

    public void setShipmentRelativeDuration(String shipmentRelativeDuration) {
        this.shipmentRelativeDuration = shipmentRelativeDuration;
    }

    public String getShipmentRelativeField() {
        return shipmentRelativeField;
    }

    public void setShipmentRelativeField(String shipmentRelativeField) {
        this.shipmentRelativeField = shipmentRelativeField;
    }

    public String getShipmentRelativeStart() {
        return shipmentRelativeStart;
    }

    public void setShipmentRelativeStart(String shipmentRelativeStart) {
        this.shipmentRelativeStart = shipmentRelativeStart;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephoneArea() {
        return telephoneArea;
    }

    public void setTelephoneArea(String telephoneArea) {
        this.telephoneArea = telephoneArea;
    }

    public String getTelephoneCountryv() {
        return telephoneCountryv;
    }

    public void setTelephoneCountryv(String telephoneCountryv) {
        this.telephoneCountryv = telephoneCountryv;
    }

    public String getTradeTerm() {
        return tradeTerm;
    }

    public void setTradeTerm(String tradeTerm) {
        this.tradeTerm = tradeTerm;
    }
}
