/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;
import java.util.List;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/29 下午10:12
 * todo  :
 */
public class ProductSKUInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<SKUAttrInfo> attributes;    // SKU属性值，可填多组信息
    private String cargoNumber;     //	String	否	指定规格的货号，国际站无需关注
    private Integer amountOnSale;    // Integer	否	可销售数量，国际站无需关注
    private Double retailPrice;        // double	否	建议零售价，国际站无需关注
    private Double price;            // Double	否	报价时该规格的单价，国际站注意要点：含有SKU属性的在线批发产品设定具体价格时使用此值，若设置阶梯价格则使用priceRange
    private List<ProductPriceRange> priceRange; //	alibaba.product.ProductPriceRange[]	否	阶梯报价，1688无需关注
    private String skuCode;        // String	否	商品编码，1688无需关注
    private Long skuId;     // 否	skuId, 国际站无需关注
    private String specId;    // String	否	specId, 国际站无需关注

    public ProductSKUInfo() {
    }

    public ProductSKUInfo(List<SKUAttrInfo> attributes, String cargoNumber, Integer amountOnSale, Double retailPrice, Double price, List<ProductPriceRange> priceRange, String skuCode, Long skuId, String specId) {
        this.attributes = attributes;
        this.cargoNumber = cargoNumber;
        this.amountOnSale = amountOnSale;
        this.retailPrice = retailPrice;
        this.price = price;
        this.priceRange = priceRange;
        this.skuCode = skuCode;
        this.skuId = skuId;
        this.specId = specId;
    }

    @Override
    public String toString() {
        return "ProductSKUInfo{" +
                "attributes=" + attributes +
                ", cargoNumber='" + cargoNumber + '\'' +
                ", amountOnSale=" + amountOnSale +
                ", retailPrice=" + retailPrice +
                ", price=" + price +
                ", priceRange=" + priceRange +
                ", skuCode='" + skuCode + '\'' +
                ", skuId=" + skuId +
                ", specId='" + specId + '\'' +
                '}';
    }

    public List<SKUAttrInfo> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<SKUAttrInfo> attributes) {
        this.attributes = attributes;
    }

    public String getCargoNumber() {
        return cargoNumber;
    }

    public void setCargoNumber(String cargoNumber) {
        this.cargoNumber = cargoNumber;
    }

    public Integer getAmountOnSale() {
        return amountOnSale;
    }

    public void setAmountOnSale(Integer amountOnSale) {
        this.amountOnSale = amountOnSale;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<ProductPriceRange> getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(List<ProductPriceRange> priceRange) {
        this.priceRange = priceRange;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }
}
