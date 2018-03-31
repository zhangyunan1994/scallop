/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;
import java.util.List;

/**
 * The type Product sale info.
 */
public class ProductSaleInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean supportOnlineTrade;//	Boolean	否	是否支持网上交易。true：支持 false：不支持，国际站不需关注此字段	TRUE
    private Boolean mixWholeSale;//	Boolean	否	是否支持混批，国际站无需关注此字段	TRUE
    private String saleType;//	String	否	销售方式，按件卖(normal)或者按批卖(batch)，1688站点无需关注此字段	normal
    private Boolean priceAuth;//	Boolean	否	是否价格私密信息，国际站无需关注此字段	TRUE
    private List<ProductPriceRange> priceRanges;//	alibaba.product.ProductPriceRange[]	否	区间价格。按数量范围设定的区间价格
    private Double amountOnSale;//	Double	否	可售数量，国际站无需关注此字段
    private String unit;//	String	否	计量单位
    private Integer minOrderQuantity;//	Integer	否	最小起订量，范围是1-99999。1688无需处理此字段
    private Integer batchNumber;//	Integer	否	每批数量，默认为空或者非零值
    private Double retailprice;//	Double	否	建议零售价，国际站无需关注
    private String tax;//	String	否	税率相关信息，内容由用户自定，国际站无需关注
    private String sellunit;//	String	否	售卖单位，如果为批量售卖，代表售卖的单位，例如1"手"=12“件"的"手"，国际站无需关注
    private Integer quoteType;    //Integer	否	普通报价-FIXED_PRICE("0"),SKU规格报价-SKU_PRICE("1"),SKU区间报价（商品维度）-SKU_PRICE_RANGE_FOR_OFFER("2"),SKU区间报价（SKU维度）-SKU_PRICE_RANGE("3")，国际站无需关注

    /**
     * Instantiates a new Product sale info.
     */
    public ProductSaleInfo() {
    }

    /**
     * Instantiates a new Product sale info.
     *
     * @param supportOnlineTrade the support online trade
     * @param mixWholeSale       the mix whole sale
     * @param saleType           the sale type
     * @param priceAuth          the price auth
     * @param priceRanges        the price ranges
     * @param amountOnSale       the amount on sale
     * @param unit               the unit
     * @param minOrderQuantity   the min order quantity
     * @param batchNumber        the batch number
     * @param retailprice        the retailprice
     * @param tax                the tax
     * @param sellunit           the sellunit
     * @param quoteType          the quote type
     */
    public ProductSaleInfo(Boolean supportOnlineTrade, Boolean mixWholeSale, String saleType, Boolean priceAuth, List<ProductPriceRange> priceRanges, Double amountOnSale, String unit, Integer minOrderQuantity, Integer batchNumber, Double retailprice, String tax, String sellunit, Integer quoteType) {
        this.supportOnlineTrade = supportOnlineTrade;
        this.mixWholeSale = mixWholeSale;
        this.saleType = saleType;
        this.priceAuth = priceAuth;
        this.priceRanges = priceRanges;
        this.amountOnSale = amountOnSale;
        this.unit = unit;
        this.minOrderQuantity = minOrderQuantity;
        this.batchNumber = batchNumber;
        this.retailprice = retailprice;
        this.tax = tax;
        this.sellunit = sellunit;
        this.quoteType = quoteType;
    }

    @Override
    public String toString() {
        return "ProductSaleInfo{" +
                "supportOnlineTrade=" + supportOnlineTrade +
                ", mixWholeSale=" + mixWholeSale +
                ", saleType='" + saleType + '\'' +
                ", priceAuth=" + priceAuth +
                ", priceRanges=" + priceRanges +
                ", amountOnSale=" + amountOnSale +
                ", unit='" + unit + '\'' +
                ", minOrderQuantity=" + minOrderQuantity +
                ", batchNumber=" + batchNumber +
                ", retailprice=" + retailprice +
                ", tax='" + tax + '\'' +
                ", sellunit='" + sellunit + '\'' +
                ", quoteType=" + quoteType +
                '}';
    }

    /**
     * Gets support online trade.
     *
     * @return the support online trade
     */
    public Boolean getSupportOnlineTrade() {
        return supportOnlineTrade;
    }

    /**
     * Sets support online trade.
     *
     * @param supportOnlineTrade the support online trade
     */
    public void setSupportOnlineTrade(Boolean supportOnlineTrade) {
        this.supportOnlineTrade = supportOnlineTrade;
    }

    /**
     * Gets mix whole sale.
     *
     * @return the mix whole sale
     */
    public Boolean getMixWholeSale() {
        return mixWholeSale;
    }

    /**
     * Sets mix whole sale.
     *
     * @param mixWholeSale the mix whole sale
     */
    public void setMixWholeSale(Boolean mixWholeSale) {
        this.mixWholeSale = mixWholeSale;
    }

    /**
     * Gets sale type.
     *
     * @return the sale type
     */
    public String getSaleType() {
        return saleType;
    }

    /**
     * Sets sale type.
     *
     * @param saleType the sale type
     */
    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    /**
     * Gets price auth.
     *
     * @return the price auth
     */
    public Boolean getPriceAuth() {
        return priceAuth;
    }

    /**
     * Sets price auth.
     *
     * @param priceAuth the price auth
     */
    public void setPriceAuth(Boolean priceAuth) {
        this.priceAuth = priceAuth;
    }

    /**
     * Gets price ranges.
     *
     * @return the price ranges
     */
    public List<ProductPriceRange> getPriceRanges() {
        return priceRanges;
    }

    /**
     * Sets price ranges.
     *
     * @param priceRanges the price ranges
     */
    public void setPriceRanges(List<ProductPriceRange> priceRanges) {
        this.priceRanges = priceRanges;
    }

    /**
     * Gets amount on sale.
     *
     * @return the amount on sale
     */
    public Double getAmountOnSale() {
        return amountOnSale;
    }

    /**
     * Sets amount on sale.
     *
     * @param amountOnSale the amount on sale
     */
    public void setAmountOnSale(Double amountOnSale) {
        this.amountOnSale = amountOnSale;
    }

    /**
     * Gets unit.
     *
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets unit.
     *
     * @param unit the unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Gets min order quantity.
     *
     * @return the min order quantity
     */
    public Integer getMinOrderQuantity() {
        return minOrderQuantity;
    }

    /**
     * Sets min order quantity.
     *
     * @param minOrderQuantity the min order quantity
     */
    public void setMinOrderQuantity(Integer minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    /**
     * Gets batch number.
     *
     * @return the batch number
     */
    public Integer getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets batch number.
     *
     * @param batchNumber the batch number
     */
    public void setBatchNumber(Integer batchNumber) {
        this.batchNumber = batchNumber;
    }

    /**
     * Gets retailprice.
     *
     * @return the retailprice
     */
    public Double getRetailprice() {
        return retailprice;
    }

    /**
     * Sets retailprice.
     *
     * @param retailprice the retailprice
     */
    public void setRetailprice(Double retailprice) {
        this.retailprice = retailprice;
    }

    /**
     * Gets tax.
     *
     * @return the tax
     */
    public String getTax() {
        return tax;
    }

    /**
     * Sets tax.
     *
     * @param tax the tax
     */
    public void setTax(String tax) {
        this.tax = tax;
    }

    /**
     * Gets sellunit.
     *
     * @return the sellunit
     */
    public String getSellunit() {
        return sellunit;
    }

    /**
     * Sets sellunit.
     *
     * @param sellunit the sellunit
     */
    public void setSellunit(String sellunit) {
        this.sellunit = sellunit;
    }

    /**
     * Gets quote type.
     *
     * @return the quote type
     */
    public Integer getQuoteType() {
        return quoteType;
    }

    /**
     * Sets quote type.
     *
     * @param quoteType the quote type
     */
    public void setQuoteType(Integer quoteType) {
        this.quoteType = quoteType;
    }
}
