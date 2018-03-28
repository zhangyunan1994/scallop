/**
 * Project: ocean.client.java.basic
 *
 * File Created at 2011-10-27
 * $Id: Json2HttpResponseParser.java 311300 2013-12-23 06:15:28Z yichun.wangyc $
 *
 * Copyright 2008 Alibaba.com Croporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.dormouse.scallop.alibaba.client.imp.serialize;

import java.util.LinkedHashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dormouse.scallop.alibaba.client.entity.ResponseWrapper;
import com.dormouse.scallop.alibaba.client.policy.Protocol;
import com.dormouse.scallop.alibaba.client.serialize.DeSerializerListener;
import com.dormouse.scallop.alibaba.client.util.ExceptionParser;

/**
 * 
 * @author hongbang.hb
 *
 */
public class Json2Deserializer extends AbstractJsonDeserializer {

	private Map<Class<? extends DeSerializerListener>, DeSerializerListener> listnerList = new LinkedHashMap<Class<? extends DeSerializerListener>, DeSerializerListener>();

	public String supportedContentType() {
		return Protocol.json2.name();
	}

	@Override
	public <T> ResponseWrapper<T> deSerialize(String content, Class<T> resultType) {
		for (DeSerializerListener deSerializerListener : listnerList.values()) {
			deSerializerListener.onResponseDeSerialized(content);
		}
		JSONObject json = JSON.parseObject(content);
		T result = this.parseResult(json, resultType);
		ResponseWrapper<T> responseWrapper = new ResponseWrapper<T>();
		responseWrapper.setResult(result);
		return responseWrapper;
	}

	@Override
	public Throwable buildException(String content, int statusCode) {
		for (DeSerializerListener deSerializerListener : listnerList.values()) {
			deSerializerListener.onResponseExceptioned(content);
		}
		Map result = JSON.parseObject(content, Map.class);
		return ExceptionParser.buildException4Json2(result);
	}

	public void registeDeSerializerListener(DeSerializerListener listner) {
		if (!listnerList.containsKey(listner.getClass())) {
			listnerList.put(listner.getClass(), listner);
		}
	}

}
