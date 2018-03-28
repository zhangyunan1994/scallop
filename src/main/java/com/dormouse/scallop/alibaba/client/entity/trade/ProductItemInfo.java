package com.dormouse.scallop.alibaba.client.entity.trade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * desc  :
 * date  : 2017/8/30 下午9:30
 * todo  :
 */
public class ProductItemInfo implements Serializable{

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

    public ProductItemInfo() {
    }

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

    public String getCargoNumber() {
        return cargoNumber;
    }

    public void setCargoNumber(String cargoNumber) {
        this.cargoNumber = cargoNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(BigDecimal itemAmount) {
        this.itemAmount = itemAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String[] getProductImgUrl() {
        return productImgUrl;
    }

    public void setProductImgUrl(String[] productImgUrl) {
        this.productImgUrl = productImgUrl;
    }

    public String getProductSnapshotUrl() {
        return productSnapshotUrl;
    }

    public void setProductSnapshotUrl(String productSnapshotUrl) {
        this.productSnapshotUrl = productSnapshotUrl;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getRefund() {
        return refund;
    }

    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    public Long getSkuID() {
        return skuID;
    }

    public void setSkuID(Long skuID) {
        this.skuID = skuID;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getSubItemID() {
        return subItemID;
    }

    public void setSubItemID(Long subItemID) {
        this.subItemID = subItemID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public List<GuaranteeTermsInfo> getGuaranteesTerms() {
        return guaranteesTerms;
    }

    public void setGuaranteesTerms(List<GuaranteeTermsInfo> guaranteesTerms) {
        this.guaranteesTerms = guaranteesTerms;
    }

    public String getProductCargoNumber() {
        return productCargoNumber;
    }

    public void setProductCargoNumber(String productCargoNumber) {
        this.productCargoNumber = productCargoNumber;
    }

    public List<SkuItemDesc> getSkuInfos() {
        return skuInfos;
    }

    public void setSkuInfos(List<SkuItemDesc> skuInfos) {
        this.skuInfos = skuInfos;
    }

    public Long getEntryDiscount() {
        return entryDiscount;
    }

    public void setEntryDiscount(Long entryDiscount) {
        this.entryDiscount = entryDiscount;
    }

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }
}
