/**
 * Project: ocean.client.java.basic
 *
 * File Created at 2011-10-27
 * $Id: Xml2HttpResponseParser.java 311300 2013-12-23 06:15:28Z yichun.wangyc $
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

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.sparrow.sdk.alibaba.client.entity.ResponseWrapper;
import com.sparrow.sdk.alibaba.client.policy.Protocol;
import com.sparrow.sdk.alibaba.client.serialize.DeSerializerListener;
import com.sparrow.sdk.alibaba.client.util.LoggerHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sparrow.sdk.alibaba.client.serialize.DeSerializer;

/**
 * 
 * @author hongbang.hb
 *
 */
public class Xml2Deserializer implements DeSerializer {

	public String supportedContentType() {
		return Protocol.xml2.name();
	}

	public <T> ResponseWrapper<T> deSerialize(InputStream istream, Class<T> resultType, String charSet)
			throws IOException, ParseException {
		LoggerHelper.getClientLogger().finer("Parse body by xml2.");
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(istream);
			NodeList nodeList = document.getChildNodes();
			Node root = nodeList.item(0);

			if (Map.class.isAssignableFrom(resultType)) {
				Map result = new LinkedHashMap();
				deserializeMap(root, result);
				ResponseWrapper<T> responseWrapper = new ResponseWrapper<T>();
				responseWrapper.setResult((T) result);
				return responseWrapper;
			} else if (List.class.isAssignableFrom(resultType)) {
				List result = new ArrayList();
				deserializeList(root, result);
				ResponseWrapper<T> responseWrapper = new ResponseWrapper<T>();
				responseWrapper.setResult((T) result);
				return responseWrapper;
			} else {
				throw new RuntimeException(supportedContentType() + " only supported Map and List as result type.");
			}
		} catch (Exception ex) {
			throw new RuntimeException("Exception occured when parse response.", ex);
		}
	}

	private void deserializeList(Node propertyNode, List result) throws IOException, ParseException {
		NodeList childrenNodeList = propertyNode.getChildNodes();
		for (int i = 0; i < childrenNodeList.getLength(); i++) {
			Node child = childrenNodeList.item(i);
			Object object = deserialize(propertyNode);
			result.add(object);
		}
	}

	private void deserializeMap(Node propertyNode, Map result) throws IOException, ParseException {
		NodeList childrenNodeList = propertyNode.getChildNodes();
		for (int i = 0; i < childrenNodeList.getLength(); i++) {
			Node child = childrenNodeList.item(i);
			Object object = deserialize(propertyNode);
			Object extObject = result.get(child.getLocalName());
			if (extObject != null) {
				if (extObject instanceof List) {
					List extOjbectList = (List) extObject;
					extOjbectList.add(object);
				} else {
					List extOjbectList = new ArrayList();
					extOjbectList.add(extObject);
					extOjbectList.add(object);
					result.put(child.getLocalName(), extOjbectList);
				}
			} else {
				result.put(child.getLocalName(), object);
			}

		}
	}

	private Object deserialize(Node propertyNode) throws IOException, ParseException {
		if (propertyNode.hasChildNodes()) {
			Node child = propertyNode.getFirstChild();
			if (isOceanXMLRootArray(child)) {
				List result = new ArrayList();
				deserializeList(propertyNode, result);
				return result;
			} else {
				Map result = new LinkedHashMap();
				deserializeMap(propertyNode, result);
				return result;
			}
		} else {
			String nodeValue = propertyNode.getNodeValue();
			return nodeValue;
		}
	}

	private boolean isOceanXMLRootArray(Node node) {
		return "list".equals(node.getLocalName()) || "item".equals(node.getLocalName());
	}

	public Throwable buildException(InputStream inputStream, int statusCode, String charSet) throws IOException,
			ParseException {
		throw new UnsupportedOperationException();
	}

	public void registeDeSerializerListener(DeSerializerListener listner) {
		// TODO Auto-generated method stub

	}

}
