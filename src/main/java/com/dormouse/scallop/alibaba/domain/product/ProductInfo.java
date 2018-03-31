/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.product;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * The type Product info.
 */
public class ProductInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long productID;     //商品ID
    private String productType;    // 商品类型，在线批发商品(wholesale)或者询盘商品(sourcing)，1688网站缺省为wholesale
    private Long categoryID;    //	类目ID，标识商品所属类目
    private List<ProductAttribute> attributes;    // alibaba.product.ProductAttribute[]	否	商品属性和属性值
    private Long[] groupID;     //	Long[]	否	分组ID，确定商品所属分组。1688可传入多个分组ID，国际站同一个商品只能属于一个分组，因此默认只取第一个
    private String status;      //	否 商品状态。auditing：审核中；online：已上网；FailAudited：审核未通过；outdated：已过期；member delete(d)：用户删除；delete：审核删除；published 已发布。此状态为系统内部控制，外部无法修改。
    private String subject;        // 商品标题，最多128个字符
    private String description;    //商品详情描述，可包含图片中心的图片URL
    private String language;    // 语种，参见FAQ 语种枚举值，1688网站默认传入CHINESE	ENGLISH
    private Integer periodOfValidity;   // 信息有效期，按天计算，国际站无此信息
    private Integer bizType;            // 业务类型。1：商品，2：加工，3：代理，4：合作，5：商务服务。国际站按默认商品。
    private Boolean pictureAuth;        // 是否图片私密信息，国际站此字段无效
    private ProductImageInfo image;        // 商品主图
    private List<ProductSKUInfo> skuInfos;    // sku信息
    private ProductSaleInfo saleInfo;       // 商品销售信息
    private ProductShippingInfo shippingInfo;   // 商品物流信息
    private ProductInternationalTradeInfo internationalTradeInfo;   // 商品国际贸易信息，1688无需处理此字段
    private List<ProductExtendInfo> extendInfos;    // 商品扩展信息
    @JSONField(format = "yyyyMMddHHmmssSSSZ")
    private Date createTime;        // 创建时间
    @JSONField(format = "yyyyMMddHHmmssSSSZ")
    private Date lastUpdateTime;    // 最后修改时间
    @JSONField(format = "yyyyMMddHHmmssSSSZ")
    private Date lastRepostTime;    // 最近重发时间，国际站无此信息
    @JSONField(format = "yyyyMMddHHmmssSSSZ")
    private Date approvedTime;        // 审核通过时间，国际站无此信息
    @JSONField(format = "yyyyMMddHHmmssSSSZ")
    private Date expireTime;        // 过期时间，国际站无此信息

    /**
     * Instantiates a new Product info.
     */
    public ProductInfo() {
    }

    /**
     * Instantiates a new Product info.
     *
     * @param productID              the product id
     * @param productType            the product type
     * @param categoryID             the category id
     * @param attributes             the attributes
     * @param groupID                the group id
     * @param status                 the status
     * @param subject                the subject
     * @param description            the description
     * @param language               the language
     * @param periodOfValidity       the period of validity
     * @param bizType                the biz type
     * @param pictureAuth            the picture auth
     * @param image                  the image
     * @param skuInfos               the sku infos
     * @param saleInfo               the sale info
     * @param shippingInfo           the shipping info
     * @param internationalTradeInfo the international trade info
     * @param extendInfos            the extend infos
     * @param createTime             the create time
     * @param lastUpdateTime         the last update time
     * @param lastRepostTime         the last repost time
     * @param approvedTime           the approved time
     * @param expireTime             the expire time
     */
    public ProductInfo(Long productID, String productType, Long categoryID, List<ProductAttribute> attributes, Long[] groupID, String status, String subject, String description, String language, Integer periodOfValidity, Integer bizType, Boolean pictureAuth, ProductImageInfo image, List<ProductSKUInfo> skuInfos, ProductSaleInfo saleInfo, ProductShippingInfo shippingInfo, ProductInternationalTradeInfo internationalTradeInfo, List<ProductExtendInfo> extendInfos, Date createTime, Date lastUpdateTime, Date lastRepostTime, Date approvedTime, Date expireTime) {
        this.productID = productID;
        this.productType = productType;
        this.categoryID = categoryID;
        this.attributes = attributes;
        this.groupID = groupID;
        this.status = status;
        this.subject = subject;
        this.description = description;
        this.language = language;
        this.periodOfValidity = periodOfValidity;
        this.bizType = bizType;
        this.pictureAuth = pictureAuth;
        this.image = image;
        this.skuInfos = skuInfos;
        this.saleInfo = saleInfo;
        this.shippingInfo = shippingInfo;
        this.internationalTradeInfo = internationalTradeInfo;
        this.extendInfos = extendInfos;
        this.createTime = createTime;
        this.lastUpdateTime = lastUpdateTime;
        this.lastRepostTime = lastRepostTime;
        this.approvedTime = approvedTime;
        this.expireTime = expireTime;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productID=" + productID +
                ", productType='" + productType + '\'' +
                ", categoryID=" + categoryID +
                ", attributes=" + attributes +
                ", groupID=" + Arrays.toString(groupID) +
                ", status='" + status + '\'' +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", periodOfValidity=" + periodOfValidity +
                ", bizType=" + bizType +
                ", pictureAuth=" + pictureAuth +
                ", image=" + image +
                ", skuInfos=" + skuInfos +
                ", saleInfo=" + saleInfo +
                ", shippingInfo=" + shippingInfo +
                ", internationalTradeInfo=" + internationalTradeInfo +
                ", extendInfos=" + extendInfos +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                ", lastRepostTime=" + lastRepostTime +
                ", approvedTime=" + approvedTime +
                ", expireTime=" + expireTime +
                '}';
    }

    /**
     * Gets product id.
     *
     * @return the product id
     */
    public Long getProductID() {
        return productID;
    }

    /**
     * Sets product id.
     *
     * @param productID the product id
     */
    public void setProductID(Long productID) {
        this.productID = productID;
    }

    /**
     * Gets product type.
     *
     * @return the product type
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets product type.
     *
     * @param productType the product type
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * Gets category id.
     *
     * @return the category id
     */
    public Long getCategoryID() {
        return categoryID;
    }

    /**
     * Sets category id.
     *
     * @param categoryID the category id
     */
    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    /**
     * Gets attributes.
     *
     * @return the attributes
     */
    public List<ProductAttribute> getAttributes() {
        return attributes;
    }

    /**
     * Sets attributes.
     *
     * @param attributes the attributes
     */
    public void setAttributes(List<ProductAttribute> attributes) {
        this.attributes = attributes;
    }

    /**
     * Get group id long [ ].
     *
     * @return the long [ ]
     */
    public Long[] getGroupID() {
        return groupID;
    }

    /**
     * Sets group id.
     *
     * @param groupID the group id
     */
    public void setGroupID(Long[] groupID) {
        this.groupID = groupID;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets subject.
     *
     * @param subject the subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets language.
     *
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets language.
     *
     * @param language the language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Gets period of validity.
     *
     * @return the period of validity
     */
    public Integer getPeriodOfValidity() {
        return periodOfValidity;
    }

    /**
     * Sets period of validity.
     *
     * @param periodOfValidity the period of validity
     */
    public void setPeriodOfValidity(Integer periodOfValidity) {
        this.periodOfValidity = periodOfValidity;
    }

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public Integer getBizType() {
        return bizType;
    }

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    /**
     * Gets picture auth.
     *
     * @return the picture auth
     */
    public Boolean getPictureAuth() {
        return pictureAuth;
    }

    /**
     * Sets picture auth.
     *
     * @param pictureAuth the picture auth
     */
    public void setPictureAuth(Boolean pictureAuth) {
        this.pictureAuth = pictureAuth;
    }

    /**
     * Gets image.
     *
     * @return the image
     */
    public ProductImageInfo getImage() {
        return image;
    }

    /**
     * Sets image.
     *
     * @param image the image
     */
    public void setImage(ProductImageInfo image) {
        this.image = image;
    }

    /**
     * Gets sku infos.
     *
     * @return the sku infos
     */
    public List<ProductSKUInfo> getSkuInfos() {
        return skuInfos;
    }

    /**
     * Sets sku infos.
     *
     * @param skuInfos the sku infos
     */
    public void setSkuInfos(List<ProductSKUInfo> skuInfos) {
        this.skuInfos = skuInfos;
    }

    /**
     * Gets sale info.
     *
     * @return the sale info
     */
    public ProductSaleInfo getSaleInfo() {
        return saleInfo;
    }

    /**
     * Sets sale info.
     *
     * @param saleInfo the sale info
     */
    public void setSaleInfo(ProductSaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    /**
     * Gets shipping info.
     *
     * @return the shipping info
     */
    public ProductShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    /**
     * Sets shipping info.
     *
     * @param shippingInfo the shipping info
     */
    public void setShippingInfo(ProductShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    /**
     * Gets international trade info.
     *
     * @return the international trade info
     */
    public ProductInternationalTradeInfo getInternationalTradeInfo() {
        return internationalTradeInfo;
    }

    /**
     * Sets international trade info.
     *
     * @param internationalTradeInfo the international trade info
     */
    public void setInternationalTradeInfo(ProductInternationalTradeInfo internationalTradeInfo) {
        this.internationalTradeInfo = internationalTradeInfo;
    }

    /**
     * Gets extend infos.
     *
     * @return the extend infos
     */
    public List<ProductExtendInfo> getExtendInfos() {
        return extendInfos;
    }

    /**
     * Sets extend infos.
     *
     * @param extendInfos the extend infos
     */
    public void setExtendInfos(List<ProductExtendInfo> extendInfos) {
        this.extendInfos = extendInfos;
    }

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Sets create time.
     *
     * @param createTime the create time
     * @throws ParseException the parse exception
     */
    public void setCreateTime(String createTime) throws ParseException {
        this.createTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(createTime);
    }

    /**
     * Gets last update time.
     *
     * @return the last update time
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets last update time.
     *
     * @param lastUpdateTime the last update time
     * @throws ParseException the parse exception
     */
    public void setLastUpdateTime(String lastUpdateTime) throws ParseException {
        this.lastUpdateTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(lastUpdateTime);
    }

    /**
     * Gets last repost time.
     *
     * @return the last repost time
     */
    public Date getLastRepostTime() {
        return lastRepostTime;
    }

    /**
     * Sets last repost time.
     *
     * @param lastRepostTime the last repost time
     * @throws ParseException the parse exception
     */
    public void setLastRepostTime(String lastRepostTime) throws ParseException {
        this.lastRepostTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(lastRepostTime);
    }

    /**
     * Gets approved time.
     *
     * @return the approved time
     */
    public Date getApprovedTime() {
        return approvedTime;
    }

    /**
     * Sets approved time.
     *
     * @param approvedTime the approved time
     * @throws ParseException the parse exception
     */
    public void setApprovedTime(String approvedTime) throws ParseException {
        this.approvedTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(approvedTime);
    }

    /**
     * Gets expire time.
     *
     * @return the expire time
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * Sets expire time.
     *
     * @param expireTime the expire time
     * @throws ParseException the parse exception
     */
    @JSONField(name = "expireTime")
    public void setExpireTime(String expireTime) throws ParseException {
        this.expireTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(expireTime);
    }
}
