/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.alibaba.domain.trade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


/**
 * The type Product item info.
 */
public class ProductItemInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cargoNumber;//	java.lang.String	否	指定单品货号，国际站无需关注。该字段不一定有值，仅仅在下单时才会把货号记录(如果卖家设置了单品货号的话)。别的订单类型的货号只能通过商品接口去获取。请注意：通过商品接口获取时的货号和下单时的货号可能不一致，因为下单完成后卖家可能修改商品信息，改变了货号。
    private String description;//	java.lang.String	否	描述,1688无此信息
    private BigDecimal itemAmount;//	java.math.BigDecimal	否	实付金额，单位为元
    private String name;//	java.lang.String	否	商品名称
    private BigDecimal price;//	java.math.BigDecimal	否	原始单价，以元为单位
    private Long productID;//	java.lang.Long	否	产品ID（非在线产品为空）
    private String[] productImgUrl;//	String[]	否	商品图片url
    private String productSnapshotUrl;//	java.lang.String	否	产品快照url，交易订单产生时会自动记录下当时的商品快照，供后续纠纷时参考
    private BigDecimal quantity;//	java.math.BigDecimal	否	以unit为单位的数量，例如多少个、多少件、多少箱、多少吨
    private BigDecimal refund;//	java.math.BigDecimal	否	退款金额，单位为元
    private Long skuID;//	java.lang.Long	否	skuID
    private Integer sort;//	java.lang.Integer	否	排序字段，商品列表按此字段进行排序，从0开始，1688不提供
    private String status;//	java.lang.String	否	子订单状态
    private Long subItemID;//	java.lang.Long	否	商品明细条目ID
    private String type;//	java.lang.String	否	类型，国际站使用，供卖家标注商品所属类型
    private String unit;//	java.lang.String	否	售卖单位	例如：个、件、箱、吨
    private String weight;//	java.lang.String	否	重量	按重量单位计算的重量，例如：100
    private String weightUnit;//	java.lang.String	否	重量单位	例如：g，kg，t
    private List<GuaranteeTermsInfo> guaranteesTerms;//	alibaba.openplatform.trade.model.GuaranteeTermsInfo[]	否	保障条款，此字段仅针对1688
    private String productCargoNumber;//	java.lang.String	否	指定商品货号，该字段不一定有值，在下单时才会把货号记录。别的订单类型的货号只能通过商品接口去获取。请注意：通过商品接口获取时的货号和下单时的货号可能不一致，因为下单完成后卖家可能修改商品信息，改变了货号。该字段和cargoNUmber的区别是：该字段是定义在商品级别上的货号，cargoNUmber是定义在单品级别的货号
    private List<SkuItemDesc> skuInfos;//	alibaba.trade.SkuItemDesc[]	否
    private Long entryDiscount;//	Long	否	订单明细涨价或降价的金额
    private String specId;//	String	否	订单销售属性ID

    /**
     * Instantiates a new Product item info.
     */
    public ProductItemInfo() {
    }

    /**
     * Instantiates a new Product item info.
     *
     * @param cargoNumber        the cargo number
     * @param description        the description
     * @param itemAmount         the item amount
     * @param name               the name
     * @param price              the price
     * @param productID          the product id
     * @param productImgUrl      the product img url
     * @param productSnapshotUrl the product snapshot url
     * @param quantity           the quantity
     * @param refund             the refund
     * @param skuID              the sku id
     * @param sort               the sort
     * @param status             the status
     * @param subItemID          the sub item id
     * @param type               the type
     * @param unit               the unit
     * @param weight             the weight
     * @param weightUnit         the weight unit
     * @param guaranteesTerms    the guarantees terms
     * @param productCargoNumber the product cargo number
     * @param skuInfos           the sku infos
     * @param entryDiscount      the entry discount
     * @param specId             the spec id
     */
    public ProductItemInfo(String cargoNumber, String description, BigDecimal itemAmount, String name, BigDecimal price, Long productID, String[] productImgUrl, String productSnapshotUrl, BigDecimal quantity, BigDecimal refund, Long skuID, Integer sort, String status, Long subItemID, String type, String unit, String weight, String weightUnit, List<GuaranteeTermsInfo> guaranteesTerms, String productCargoNumber, List<SkuItemDesc> skuInfos, Long entryDiscount, String specId) {
        this.cargoNumber = cargoNumber;
        this.description = description;
        this.itemAmount = itemAmount;
        this.name = name;
        this.price = price;
        this.productID = productID;
        this.productImgUrl = productImgUrl;
        this.productSnapshotUrl = productSnapshotUrl;
        this.quantity = quantity;
        this.refund = refund;
        this.skuID = skuID;
        this.sort = sort;
        this.status = status;
        this.subItemID = subItemID;
        this.type = type;
        this.unit = unit;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.guaranteesTerms = guaranteesTerms;
        this.productCargoNumber = productCargoNumber;
        this.skuInfos = skuInfos;
        this.entryDiscount = entryDiscount;
        this.specId = specId;
    }

    @Override
    public String toString() {
        return "ProductItemInfo{" +
                "cargoNumber='" + cargoNumber + '\'' +
                ", description='" + description + '\'' +
                ", itemAmount=" + itemAmount +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productID=" + productID +
                ", productImgUrl=" + Arrays.toString(productImgUrl) +
                ", productSnapshotUrl='" + productSnapshotUrl + '\'' +
                ", quantity=" + quantity +
                ", refund=" + refund +
                ", skuID=" + skuID +
                ", sort=" + sort +
                ", status='" + status + '\'' +
                ", subItemID=" + subItemID +
                ", type='" + type + '\'' +
                ", unit='" + unit + '\'' +
                ", weight='" + weight + '\'' +
                ", weightUnit='" + weightUnit + '\'' +
                ", guaranteesTerms=" + guaranteesTerms +
                ", productCargoNumber='" + productCargoNumber + '\'' +
                ", skuInfos=" + skuInfos +
                ", entryDiscount=" + entryDiscount +
                ", specId='" + specId + '\'' +
                '}';
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
     * Gets item amount.
     *
     * @return the item amount
     */
    public BigDecimal getItemAmount() {
        return itemAmount;
    }

    /**
     * Sets item amount.
     *
     * @param itemAmount the item amount
     */
    public void setItemAmount(BigDecimal itemAmount) {
        this.itemAmount = itemAmount;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
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
     * Get product img url string [ ].
     *
     * @return the string [ ]
     */
    public String[] getProductImgUrl() {
        return productImgUrl;
    }

    /**
     * Sets product img url.
     *
     * @param productImgUrl the product img url
     */
    public void setProductImgUrl(String[] productImgUrl) {
        this.productImgUrl = productImgUrl;
    }

    /**
     * Gets product snapshot url.
     *
     * @return the product snapshot url
     */
    public String getProductSnapshotUrl() {
        return productSnapshotUrl;
    }

    /**
     * Sets product snapshot url.
     *
     * @param productSnapshotUrl the product snapshot url
     */
    public void setProductSnapshotUrl(String productSnapshotUrl) {
        this.productSnapshotUrl = productSnapshotUrl;
    }

    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets refund.
     *
     * @return the refund
     */
    public BigDecimal getRefund() {
        return refund;
    }

    /**
     * Sets refund.
     *
     * @param refund the refund
     */
    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    /**
     * Gets sku id.
     *
     * @return the sku id
     */
    public Long getSkuID() {
        return skuID;
    }

    /**
     * Sets sku id.
     *
     * @param skuID the sku id
     */
    public void setSkuID(Long skuID) {
        this.skuID = skuID;
    }

    /**
     * Gets sort.
     *
     * @return the sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * Sets sort.
     *
     * @param sort the sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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
     * Gets sub item id.
     *
     * @return the sub item id
     */
    public Long getSubItemID() {
        return subItemID;
    }

    /**
     * Sets sub item id.
     *
     * @param subItemID the sub item id
     */
    public void setSubItemID(Long subItemID) {
        this.subItemID = subItemID;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
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
     * Gets weight.
     *
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * Gets weight unit.
     *
     * @return the weight unit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Sets weight unit.
     *
     * @param weightUnit the weight unit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * Gets guarantees terms.
     *
     * @return the guarantees terms
     */
    public List<GuaranteeTermsInfo> getGuaranteesTerms() {
        return guaranteesTerms;
    }

    /**
     * Sets guarantees terms.
     *
     * @param guaranteesTerms the guarantees terms
     */
    public void setGuaranteesTerms(List<GuaranteeTermsInfo> guaranteesTerms) {
        this.guaranteesTerms = guaranteesTerms;
    }

    /**
     * Gets product cargo number.
     *
     * @return the product cargo number
     */
    public String getProductCargoNumber() {
        return productCargoNumber;
    }

    /**
     * Sets product cargo number.
     *
     * @param productCargoNumber the product cargo number
     */
    public void setProductCargoNumber(String productCargoNumber) {
        this.productCargoNumber = productCargoNumber;
    }

    /**
     * Gets sku infos.
     *
     * @return the sku infos
     */
    public List<SkuItemDesc> getSkuInfos() {
        return skuInfos;
    }

    /**
     * Sets sku infos.
     *
     * @param skuInfos the sku infos
     */
    public void setSkuInfos(List<SkuItemDesc> skuInfos) {
        this.skuInfos = skuInfos;
    }

    /**
     * Gets entry discount.
     *
     * @return the entry discount
     */
    public Long getEntryDiscount() {
        return entryDiscount;
    }

    /**
     * Sets entry discount.
     *
     * @param entryDiscount the entry discount
     */
    public void setEntryDiscount(Long entryDiscount) {
        this.entryDiscount = entryDiscount;
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
