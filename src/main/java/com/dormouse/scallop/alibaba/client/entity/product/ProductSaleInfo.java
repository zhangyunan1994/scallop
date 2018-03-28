package com.dormouse.scallop.alibaba.client.entity.product;

import java.io.Serializable;
import java.util.List;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/29 下午10:12
 * todo  :
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
    private Integer quoteType;	//Integer	否	普通报价-FIXED_PRICE("0"),SKU规格报价-SKU_PRICE("1"),SKU区间报价（商品维度）-SKU_PRICE_RANGE_FOR_OFFER("2"),SKU区间报价（SKU维度）-SKU_PRICE_RANGE("3")，国际站无需关注

    public ProductSaleInfo() {
    }

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

    public Boolean getSupportOnlineTrade() {
        return supportOnlineTrade;
    }

    public void setSupportOnlineTrade(Boolean supportOnlineTrade) {
        this.supportOnlineTrade = supportOnlineTrade;
    }

    public Boolean getMixWholeSale() {
        return mixWholeSale;
    }

    public void setMixWholeSale(Boolean mixWholeSale) {
        this.mixWholeSale = mixWholeSale;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public Boolean getPriceAuth() {
        return priceAuth;
    }

    public void setPriceAuth(Boolean priceAuth) {
        this.priceAuth = priceAuth;
    }

    public List<ProductPriceRange> getPriceRanges() {
        return priceRanges;
    }

    public void setPriceRanges(List<ProductPriceRange> priceRanges) {
        this.priceRanges = priceRanges;
    }

    public Double getAmountOnSale() {
        return amountOnSale;
    }

    public void setAmountOnSale(Double amountOnSale) {
        this.amountOnSale = amountOnSale;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getMinOrderQuantity() {
        return minOrderQuantity;
    }

    public void setMinOrderQuantity(Integer minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    public Integer getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Integer batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Double getRetailprice() {
        return retailprice;
    }

    public void setRetailprice(Double retailprice) {
        this.retailprice = retailprice;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getSellunit() {
        return sellunit;
    }

    public void setSellunit(String sellunit) {
        this.sellunit = sellunit;
    }

    public Integer getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(Integer quoteType) {
        this.quoteType = quoteType;
    }
}
