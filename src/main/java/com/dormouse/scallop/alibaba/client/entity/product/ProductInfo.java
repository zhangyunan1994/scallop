package com.dormouse.scallop.alibaba.client.entity.product;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/29 下午10:06
 * todo  :
 */
public class ProductInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long productID;     //商品ID
    private String productType;	// 商品类型，在线批发商品(wholesale)或者询盘商品(sourcing)，1688网站缺省为wholesale
    private Long categoryID;    //	类目ID，标识商品所属类目
    private List<ProductAttribute> attributes;	// alibaba.product.ProductAttribute[]	否	商品属性和属性值
    private Long[] groupID;     //	Long[]	否	分组ID，确定商品所属分组。1688可传入多个分组ID，国际站同一个商品只能属于一个分组，因此默认只取第一个
    private String status;      //	否 商品状态。auditing：审核中；online：已上网；FailAudited：审核未通过；outdated：已过期；member delete(d)：用户删除；delete：审核删除；published 已发布。此状态为系统内部控制，外部无法修改。
    private String subject;	    // 商品标题，最多128个字符
    private String description;	//商品详情描述，可包含图片中心的图片URL
    private String language;	// 语种，参见FAQ 语种枚举值，1688网站默认传入CHINESE	ENGLISH
    private Integer periodOfValidity;   // 信息有效期，按天计算，国际站无此信息
    private Integer bizType;	        // 业务类型。1：商品，2：加工，3：代理，4：合作，5：商务服务。国际站按默认商品。
    private Boolean pictureAuth;	    // 是否图片私密信息，国际站此字段无效
    private ProductImageInfo image;	    // 商品主图
    private List<ProductSKUInfo> skuInfos;	// sku信息
    private ProductSaleInfo saleInfo;       // 商品销售信息
    private ProductShippingInfo shippingInfo;   // 商品物流信息
    private ProductInternationalTradeInfo internationalTradeInfo;   // 商品国际贸易信息，1688无需处理此字段
    private List<ProductExtendInfo> extendInfos;    // 商品扩展信息
    @JSONField(format = "yyyyMMddHHmmssSSSZ")
    private Date createTime;        // 创建时间
    @JSONField(format = "yyyyMMddHHmmssSSSZ")
    private Date lastUpdateTime;	// 最后修改时间
    @JSONField(format = "yyyyMMddHHmmssSSSZ")
    private Date lastRepostTime;	// 最近重发时间，国际站无此信息
    @JSONField(format = "yyyyMMddHHmmssSSSZ")
    private Date approvedTime;	    // 审核通过时间，国际站无此信息
    @JSONField(format = "yyyyMMddHHmmssSSSZ")
    private Date expireTime;	    // 过期时间，国际站无此信息

    public ProductInfo() {
    }

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

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public List<ProductAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ProductAttribute> attributes) {
        this.attributes = attributes;
    }

    public Long[] getGroupID() {
        return groupID;
    }

    public void setGroupID(Long[] groupID) {
        this.groupID = groupID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getPeriodOfValidity() {
        return periodOfValidity;
    }

    public void setPeriodOfValidity(Integer periodOfValidity) {
        this.periodOfValidity = periodOfValidity;
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public Boolean getPictureAuth() {
        return pictureAuth;
    }

    public void setPictureAuth(Boolean pictureAuth) {
        this.pictureAuth = pictureAuth;
    }

    public ProductImageInfo getImage() {
        return image;
    }

    public void setImage(ProductImageInfo image) {
        this.image = image;
    }

    public List<ProductSKUInfo> getSkuInfos() {
        return skuInfos;
    }

    public void setSkuInfos(List<ProductSKUInfo> skuInfos) {
        this.skuInfos = skuInfos;
    }

    public ProductSaleInfo getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(ProductSaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    public ProductShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ProductShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public ProductInternationalTradeInfo getInternationalTradeInfo() {
        return internationalTradeInfo;
    }

    public void setInternationalTradeInfo(ProductInternationalTradeInfo internationalTradeInfo) {
        this.internationalTradeInfo = internationalTradeInfo;
    }

    public List<ProductExtendInfo> getExtendInfos() {
        return extendInfos;
    }

    public void setExtendInfos(List<ProductExtendInfo> extendInfos) {
        this.extendInfos = extendInfos;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) throws ParseException {
        this.createTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(createTime);
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) throws ParseException {
        this.lastUpdateTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(lastUpdateTime);
    }

    public Date getLastRepostTime() {
        return lastRepostTime;
    }

    public void setLastRepostTime(String lastRepostTime) throws ParseException {
        this.lastRepostTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(lastRepostTime);
    }

    public Date getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(String approvedTime) throws ParseException {
        this.approvedTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(approvedTime);
    }

    public Date getExpireTime() {
        return expireTime;
    }

    @JSONField(name = "expireTime")
    public void setExpireTime(String expireTime) throws ParseException {
        this.expireTime = new SimpleDateFormat("yyyyMMddHHmmssSSSZ").parse(expireTime);
    }
}
