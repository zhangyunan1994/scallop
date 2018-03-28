/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.client.entity.trade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * The type International logistics info.
 *
 * @author yunan.zhang
 * @version 0.0.1
 */
public class InternationalLogisticsInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private String address;//	java.lang.String	否	详细地址
    private Date allDeliveredTime;//		java.util.Date	否	完全发货时间
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

    /**
     * Instantiates a new International logistics info.
     */
    public InternationalLogisticsInfo() {
    }

    /**
     * Instantiates a new International logistics info.
     *
     * @param address                  the address
     * @param allDeliveredTime         the all delivered time
     * @param alternateAddress         the alternate address
     * @param carrier                  the carrier
     * @param city                     the city
     * @param cityCode                 the city code
     * @param contactPerson            the contact person
     * @param country                  the country
     * @param countryCode              the country code
     * @param fax                      the fax
     * @param faxArea                  the fax area
     * @param faxCountry               the fax country
     * @param insuranceFee             the insurance fee
     * @param logisticsCode            the logistics code
     * @param logisticsFee             the logistics fee
     * @param mobile                   the mobile
     * @param mobileArea               the mobile area
     * @param mobileCountry            the mobile country
     * @param port                     the port
     * @param portCode                 the port code
     * @param province                 the province
     * @param provinceCode             the province code
     * @param shipmentAbsoluteDate     the shipment absolute date
     * @param shipmentAbsoluteZone     the shipment absolute zone
     * @param shipmentDateType         the shipment date type
     * @param shipmentMethod           the shipment method
     * @param shipmentRelativeDuration the shipment relative duration
     * @param shipmentRelativeField    the shipment relative field
     * @param shipmentRelativeStart    the shipment relative start
     * @param telephone                the telephone
     * @param telephoneArea            the telephone area
     * @param telephoneCountryv        the telephone countryv
     * @param tradeTerm                the trade term
     */
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
     * Gets alternate address.
     *
     * @return the alternate address
     */
    public String getAlternateAddress() {
        return alternateAddress;
    }

    /**
     * Sets alternate address.
     *
     * @param alternateAddress the alternate address
     */
    public void setAlternateAddress(String alternateAddress) {
        this.alternateAddress = alternateAddress;
    }

    /**
     * Gets carrier.
     *
     * @return the carrier
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets carrier.
     *
     * @param carrier the carrier
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
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
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
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
     * Gets country.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets country.
     *
     * @param country the country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets country code.
     *
     * @return the country code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets country code.
     *
     * @param countryCode the country code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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
     * Gets fax area.
     *
     * @return the fax area
     */
    public String getFaxArea() {
        return faxArea;
    }

    /**
     * Sets fax area.
     *
     * @param faxArea the fax area
     */
    public void setFaxArea(String faxArea) {
        this.faxArea = faxArea;
    }

    /**
     * Gets fax country.
     *
     * @return the fax country
     */
    public String getFaxCountry() {
        return faxCountry;
    }

    /**
     * Sets fax country.
     *
     * @param faxCountry the fax country
     */
    public void setFaxCountry(String faxCountry) {
        this.faxCountry = faxCountry;
    }

    /**
     * Gets insurance fee.
     *
     * @return the insurance fee
     */
    public BigDecimal getInsuranceFee() {
        return insuranceFee;
    }

    /**
     * Sets insurance fee.
     *
     * @param insuranceFee the insurance fee
     */
    public void setInsuranceFee(BigDecimal insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    /**
     * Gets logistics code.
     *
     * @return the logistics code
     */
    public String getLogisticsCode() {
        return logisticsCode;
    }

    /**
     * Sets logistics code.
     *
     * @param logisticsCode the logistics code
     */
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    /**
     * Gets logistics fee.
     *
     * @return the logistics fee
     */
    public BigDecimal getLogisticsFee() {
        return logisticsFee;
    }

    /**
     * Sets logistics fee.
     *
     * @param logisticsFee the logistics fee
     */
    public void setLogisticsFee(BigDecimal logisticsFee) {
        this.logisticsFee = logisticsFee;
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
     * Gets mobile area.
     *
     * @return the mobile area
     */
    public String getMobileArea() {
        return mobileArea;
    }

    /**
     * Sets mobile area.
     *
     * @param mobileArea the mobile area
     */
    public void setMobileArea(String mobileArea) {
        this.mobileArea = mobileArea;
    }

    /**
     * Gets mobile country.
     *
     * @return the mobile country
     */
    public String getMobileCountry() {
        return mobileCountry;
    }

    /**
     * Sets mobile country.
     *
     * @param mobileCountry the mobile country
     */
    public void setMobileCountry(String mobileCountry) {
        this.mobileCountry = mobileCountry;
    }

    /**
     * Gets port.
     *
     * @return the port
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets port.
     *
     * @param port the port
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * Gets port code.
     *
     * @return the port code
     */
    public String getPortCode() {
        return portCode;
    }

    /**
     * Sets port code.
     *
     * @param portCode the port code
     */
    public void setPortCode(String portCode) {
        this.portCode = portCode;
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
     * Gets province code.
     *
     * @return the province code
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * Sets province code.
     *
     * @param provinceCode the province code
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * Gets shipment absolute date.
     *
     * @return the shipment absolute date
     */
    public Date getShipmentAbsoluteDate() {
        return shipmentAbsoluteDate;
    }

    /**
     * Sets shipment absolute date.
     *
     * @param shipmentAbsoluteDate the shipment absolute date
     * @throws ParseException the parse exception
     */
    public void setShipmentAbsoluteDate(String shipmentAbsoluteDate) throws ParseException {
        this.shipmentAbsoluteDate = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(shipmentAbsoluteDate);
    }

    /**
     * Gets shipment absolute zone.
     *
     * @return the shipment absolute zone
     */
    public String getShipmentAbsoluteZone() {
        return shipmentAbsoluteZone;
    }

    /**
     * Sets shipment absolute zone.
     *
     * @param shipmentAbsoluteZone the shipment absolute zone
     */
    public void setShipmentAbsoluteZone(String shipmentAbsoluteZone) {
        this.shipmentAbsoluteZone = shipmentAbsoluteZone;
    }

    /**
     * Gets shipment date type.
     *
     * @return the shipment date type
     */
    public String getShipmentDateType() {
        return shipmentDateType;
    }

    /**
     * Sets shipment date type.
     *
     * @param shipmentDateType the shipment date type
     */
    public void setShipmentDateType(String shipmentDateType) {
        this.shipmentDateType = shipmentDateType;
    }

    /**
     * Gets shipment method.
     *
     * @return the shipment method
     */
    public String getShipmentMethod() {
        return shipmentMethod;
    }

    /**
     * Sets shipment method.
     *
     * @param shipmentMethod the shipment method
     */
    public void setShipmentMethod(String shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    /**
     * Gets shipment relative duration.
     *
     * @return the shipment relative duration
     */
    public String getShipmentRelativeDuration() {
        return shipmentRelativeDuration;
    }

    /**
     * Sets shipment relative duration.
     *
     * @param shipmentRelativeDuration the shipment relative duration
     */
    public void setShipmentRelativeDuration(String shipmentRelativeDuration) {
        this.shipmentRelativeDuration = shipmentRelativeDuration;
    }

    /**
     * Gets shipment relative field.
     *
     * @return the shipment relative field
     */
    public String getShipmentRelativeField() {
        return shipmentRelativeField;
    }

    /**
     * Sets shipment relative field.
     *
     * @param shipmentRelativeField the shipment relative field
     */
    public void setShipmentRelativeField(String shipmentRelativeField) {
        this.shipmentRelativeField = shipmentRelativeField;
    }

    /**
     * Gets shipment relative start.
     *
     * @return the shipment relative start
     */
    public String getShipmentRelativeStart() {
        return shipmentRelativeStart;
    }

    /**
     * Sets shipment relative start.
     *
     * @param shipmentRelativeStart the shipment relative start
     */
    public void setShipmentRelativeStart(String shipmentRelativeStart) {
        this.shipmentRelativeStart = shipmentRelativeStart;
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
     * Gets telephone area.
     *
     * @return the telephone area
     */
    public String getTelephoneArea() {
        return telephoneArea;
    }

    /**
     * Sets telephone area.
     *
     * @param telephoneArea the telephone area
     */
    public void setTelephoneArea(String telephoneArea) {
        this.telephoneArea = telephoneArea;
    }

    /**
     * Gets telephone countryv.
     *
     * @return the telephone countryv
     */
    public String getTelephoneCountryv() {
        return telephoneCountryv;
    }

    /**
     * Sets telephone countryv.
     *
     * @param telephoneCountryv the telephone countryv
     */
    public void setTelephoneCountryv(String telephoneCountryv) {
        this.telephoneCountryv = telephoneCountryv;
    }

    /**
     * Gets trade term.
     *
     * @return the trade term
     */
    public String getTradeTerm() {
        return tradeTerm;
    }

    /**
     * Sets trade term.
     *
     * @param tradeTerm the trade term
     */
    public void setTradeTerm(String tradeTerm) {
        this.tradeTerm = tradeTerm;
    }
}
