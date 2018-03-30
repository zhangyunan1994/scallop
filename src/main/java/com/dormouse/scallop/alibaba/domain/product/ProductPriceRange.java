/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/29 下午10:26
 * todo  :
 */
public class ProductPriceRange implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer startQuantity;
    private Double price;

    public ProductPriceRange() {
    }

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

    public Integer getStartQuantity() {
        return startQuantity;
    }

    public void setStartQuantity(Integer startQuantity) {
        this.startQuantity = startQuantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
