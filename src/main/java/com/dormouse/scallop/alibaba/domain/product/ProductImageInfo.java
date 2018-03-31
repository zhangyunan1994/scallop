/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import java.io.Serializable;
import java.util.Arrays;

/**
 * The type Product image info.
 */
public class ProductImageInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String[] images; // 主图列表，需先使用图片上传接口上传图片	["http://g03.s.alicdn.com/kf/HTB1PYE9IpXXXXbsXVXXq6xXFXXXg/200042360/HTB1PYE9IpXXXXbsXVXXq6xXFXXXg.jpg","http://g01.s.alicdn.com/kf/HTB1tNhsIFXXXXb2XXXXq6xXFXXX9/200042360/HTB1tNhsIFXXXXb2XXXXq6xXFXXX9.jpg"]
    private Boolean isWatermark;    // 是否打水印，是(true)或否(false)，1688无需关注此字段，1688的水印信息在上传图片时处理
    private Boolean isWatermarkFrame;   // 水印是否有边框，有边框(true)或者无边框(false)，1688无需关注此字段，1688的水印信息在上传图片时处理
    private String watermarkPosition;   // 水印位置，在中间(center)或者在底部(bottom)，1688无需关注此字段，1688的水印信息在上传图片时处理

    /**
     * Instantiates a new Product image info.
     */
    public ProductImageInfo() {
    }

    /**
     * Instantiates a new Product image info.
     *
     * @param images            the images
     * @param isWatermark       the is watermark
     * @param isWatermarkFrame  the is watermark frame
     * @param watermarkPosition the watermark position
     */
    public ProductImageInfo(String[] images, Boolean isWatermark, Boolean isWatermarkFrame, String watermarkPosition) {
        this.images = images;
        this.isWatermark = isWatermark;
        this.isWatermarkFrame = isWatermarkFrame;
        this.watermarkPosition = watermarkPosition;
    }

    @Override
    public String toString() {
        return "ProductImageInfo{" +
                "images=" + Arrays.toString(images) +
                ", isWatermark=" + isWatermark +
                ", isWatermarkFrame=" + isWatermarkFrame +
                ", watermarkPosition='" + watermarkPosition + '\'' +
                '}';
    }

    /**
     * Get images string [ ].
     *
     * @return the string [ ]
     */
    public String[] getImages() {
        return images;
    }

    /**
     * Sets images.
     *
     * @param images the images
     */
    public void setImages(String[] images) {
        this.images = images;
    }

    /**
     * Gets watermark.
     *
     * @return the watermark
     */
    public Boolean getWatermark() {
        return isWatermark;
    }

    /**
     * Sets watermark.
     *
     * @param watermark the watermark
     */
    public void setWatermark(Boolean watermark) {
        isWatermark = watermark;
    }

    /**
     * Gets watermark frame.
     *
     * @return the watermark frame
     */
    public Boolean getWatermarkFrame() {
        return isWatermarkFrame;
    }

    /**
     * Sets watermark frame.
     *
     * @param watermarkFrame the watermark frame
     */
    public void setWatermarkFrame(Boolean watermarkFrame) {
        isWatermarkFrame = watermarkFrame;
    }

    /**
     * Gets watermark position.
     *
     * @return the watermark position
     */
    public String getWatermarkPosition() {
        return watermarkPosition;
    }

    /**
     * Sets watermark position.
     *
     * @param watermarkPosition the watermark position
     */
    public void setWatermarkPosition(String watermarkPosition) {
        this.watermarkPosition = watermarkPosition;
    }
}
