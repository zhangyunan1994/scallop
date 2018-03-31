/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;

/**
 * The type Product price range.
 */
public class ProductPriceRange implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer startQuantity;
    private Double price;

    /**
     * Instantiates a new Product price range.
     */
    public ProductPriceRange() {
    }

    /**
     * Instantiates a new Product price range.
     *
     * @param startQuantity the start quantity
     * @param price         the price
     */
    public ProductPriceRange(Integer startQuantity, Double price) {
        this.startQuantity = startQuantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductPriceRange{" +
                "startQuantity=" + startQuantity +
                ", price=" + price +
                '}';
    }

    /**
     * Gets start quantity.
     *
     * @return the start quantity
     */
    public Integer getStartQuantity() {
        return startQuantity;
    }

    /**
     * Sets start quantity.
     *
     * @param startQuantity the start quantity
     */
    public void setStartQuantity(Integer startQuantity) {
        this.startQuantity = startQuantity;
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
}
