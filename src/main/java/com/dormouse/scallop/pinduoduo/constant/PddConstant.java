/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.pinduoduo.constant;

/**
 * The interface Pdd constant.
 *
 * @author 张瑀楠 zyndev@gmail.com
 * @version 0.0.1
 */
public interface PddConstant {

    /**
     * 拼多多api根路径
     */
    String API_DOMAIN = "http://gw-api.pinduoduo.com/api/router/";

    /**
     * The constant API_PROTOCOL.
     */
    String API_PROTOCOL = "param2/1/";

    /**
     * The interface Order.
     */
    interface Order {
        /**
         * The constant INFORMATION_GET.
         * （订单详情）
         */
        String INFORMATION_GET = "pdd.order.information.get";
        /**
         * The constant LIST_GET.
         * （订单列表查询接口（根据成团时间)
         */
        String LIST_GET = "pdd.order.list.get";
        /**
         * The constant NUMBER_LIST_GET.
         * （订单全量列表）
         */
        String NUMBER_LIST_GET = "pdd.order.number.list.get";
        /**
         * The constant NUMBER_LIST_INCREMENT_GET.
         * （订单全量列表）
         */
        String NUMBER_LIST_INCREMENT_GET = "pdd.order.number.list.increment.get";
        /**
         * The constant STATUS_GET.
         * （订单全量列表）
         */
        String STATUS_GET = "pdd.order.status.get";
    }

    interface Refund {
        String STATUS_CHECK = "pdd.refund.status.check";
    }

    interface Logistics {
        /**
         * （获取拼多多标准国家地址库）
         */
        String ADDRESS_GET = "pdd.logistics.address.get";
        /**
         * （快递公司查看接口）
         */
        String COMPANIES_GET = "pdd.logistics.companies.get";
        /**
         * （订单发货通知接口）
         */
        String ONLINE_SEND = "pdd.logistics.online.send";
    }

    interface Virtual {
        /**
         * （虚拟类目发货通知接口）
         */
        String PDD_VIRTUAL_MOBILE_CHARGE_NOTIFY = "pdd.virtual.mobile.charge.notify";
    }

    interface Goods {
        /**
         * 商品列表接口
         * 商品列表查询
         */
        String PDD_GOODS_LIST_GET = "pdd.goods.list.get";
        /**
         * 商品详情接口
         * 商品详情
         */
        String PDD_GOODS_INFORMATION_GET = "pdd.goods.information.get";
        /**
         * 商品全量修改接口
         * 全量更新商品库存
         */
        String PDD_GOODS_SKU_STOCK_UPDATE = "pdd.goods.sku.stock.update";
        /**
         * 商品增量修改接口
         * 查询商品库存增量更新
         */
        String PDD_GOODS_SKU_STOCK_INCREMENT_UPDATE = "pdd.goods.sku.stock.increment.update";
        /**
         * 商品标准类目接口
         * 获取拼多多标准商品类目信息
         */
        String PDD_GOODS_CATS_GET = "pdd.goods.cats.get";
        /**
         * 商品运费模版接口
         * 获取拼多多商家的物流运费模板信息
         */
        String PDD_GOODS_LOGISTICS_TEMPLATE_GET = "pdd.goods.logistics.template.get";
        /**
         * 商品图片上传接口
         * 商品图片上传服务
         */
        String PDD_GOODS_IMAGE_UPLOAD = "pdd.goods.image.upload";
        /**
         * 商品国家接口
         * 获取指定国家或地区信息
         */
        String PDD_GOODS_COUNTRY_GET = "pdd.goods.country.get";
        /**
         * 生成商家自定义的规格
         * 生成商家自定义的规格
         */
        String PDD_GOODS_SPEC_ID_GET = "pdd.goods.spec.id.get";
        /**
         * 商品属性类目接口
         * 获取商品规格信息
         */
        String PDD_GOODS_SPEC_GET = "pdd.goods.spec.get";
        /**
         * 获取当前授权商家可发布的商品类目信息
         * 获取当前授权商家可发布的商品类目信息
         */
        String PDD_GOODS_AUTHORIZATION_CATS = "pdd.goods.authorization.cats";
        /**
         * 获取服饰成分含量信息
         * 获取服饰成分含量信息，仅在cat_id=3845,233,231,218,234时入参
         */
        String PDD_GOODS_FABRIC_CONTENT_GET = "pdd.goods.fabric.content.get";
        /**
         * 获取服饰面料信息
         * 获取服饰面料信息，仅在cat_id=3845,233,231,218,234时入参
         */
        String PDD_GOODS_FABRIC_GET = "pdd.goods.fabric.get";
        /**
         * 商品新增接口
         * 单个商品发布，需要配合pdd.goods.image.upload上传主图及商品详情图片
         */
        String PDD_GOODS_ADD = "pdd.goods.add";
        /**
         * 商品编辑
         * 单个商品编辑
         */
        String PDD_GOODS_INFORMATION_UPDATE = "pdd.goods.information.update";
        /**
         * 商品明细
         * 新增商品或者修改商品的时候
         */
        String PDD_GOODS_DETAIL_GET = "pdd.goods.detail.get";
        /**
         * 商品上架状态设置
         * 修改商品上下架状态
         */
        String PDD_GOODS_SALE_STATUS_SET = "pdd.goods.sale.status.set";


    }

}
