/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;
import java.util.List;

/**
 * The type Product sku info.
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

    /**
     * Instantiates a new Product sku info.
     */
    public ProductSKUInfo() {
    }

    /**
     * Instantiates a new Product sku info.
     *
     * @param attributes   the attributes
     * @param cargoNumber  the cargo number
     * @param amountOnSale the amount on sale
     * @param retailPrice  the retail price
     * @param price        the price
     * @param priceRange   the price range
     * @param skuCode      the sku code
     * @param skuId        the sku id
     * @param specId       the spec id
     */
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

    /**
     * Gets attributes.
     *
     * @return the attributes
     */
    public List<SKUAttrInfo> getAttributes() {
        return attributes;
    }

    /**
     * Sets attributes.
     *
     * @param attributes the attributes
     */
    public void setAttributes(List<SKUAttrInfo> attributes) {
        this.attributes = attributes;
    }

    /**
     * Gets cargo number.
     *
     * @return the cargo number
     */
    public String getCargoNumber() {
        return cargoNumber;
    }

    /**
     * Sets cargo number.
     *
     * @param cargoNumber the cargo number
     */
    public void setCargoNumber(String cargoNumber) {
        this.cargoNumber = cargoNumber;
    }

    /**
     * Gets amount on sale.
     *
     * @return the amount on sale
     */
    public Integer getAmountOnSale() {
        return amountOnSale;
    }

    /**
     * Sets amount on sale.
     *
     * @param amountOnSale the amount on sale
     */
    public void setAmountOnSale(Integer amountOnSale) {
        this.amountOnSale = amountOnSale;
    }

    /**
     * Gets retail price.
     *
     * @return the retail price
     */
    public Double getRetailPrice() {
        return retailPrice;
    }

    /**
     * Sets retail price.
     *
     * @param retailPrice the retail price
     */
    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Gets price range.
     *
     * @return the price range
     */
    public List<ProductPriceRange> getPriceRange() {
        return priceRange;
    }

    /**
     * Sets price range.
     *
     * @param priceRange the price range
     */
    public void setPriceRange(List<ProductPriceRange> priceRange) {
        this.priceRange = priceRange;
    }

    /**
     * Gets sku code.
     *
     * @return the sku code
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * Sets sku code.
     *
     * @param skuCode the sku code
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    /**
     * Gets sku id.
     *
     * @return the sku id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * Sets sku id.
     *
     * @param skuId the sku id
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * Gets spec id.
     *
     * @return the spec id
     */
    public String getSpecId() {
        return specId;
    }

    /**
     * Sets spec id.
     *
     * @param specId the spec id
     */
    public void setSpecId(String specId) {
        this.specId = specId;
    }
}
