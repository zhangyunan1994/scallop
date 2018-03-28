package com.dormouse.scallop.alibaba.client.http;///**
// * Project: ocean.client.java.basic
// *
// * File Created at 2011-10-18
// * $Id: InvokeContext.java 412998 2015-05-22 06:37:04Z hongbang.hb $
// *
// * Copyright 2008 Alibaba.com Croporation Limited.
// * All rights reserved.
// *
// * This software is the confidential and proprietary information of
// * Alibaba Company. ("Confidential Information").  You shall not
// * disclose such Confidential Information and shall use it only in
// * accordance with the terms of the license agreement you entered into
// * with Alibaba.com.
// */
//package com.sparrow.sdk.alibaba.client.http;
//
//import com.sparrow.sdk.alibaba.client.Request;
//import com.sparrow.sdk.alibaba.client.Response;
//import com.sparrow.sdk.alibaba.client.entity.ResponseWrapper;
//import com.sparrow.sdk.alibaba.client.policy.RequestPolicy;
//
///**
// * Comment of InvokeContext
// *
// * @author jade
// */
//
//public class InvokeContext {
//	private Request request;
//	private Response response;
//	private RequestPolicy policy;
//	private Class<?> resultType;
//	private ResponseWrapper responseWrapper;
//
//	public InvokeContext() {
//	}
//
//	public Request getRequest() {
//		return request;
//	}
//
//	public void setRequest(Request request) {
//		this.request = request;
//	}
//
//	public Response getResponse() {
//		return response;
//	}
//
//	public synchronized void setResponse(Response response) {
//		this.response = response;
//	}
//
//	public RequestPolicy getPolicy() {
//		return policy;
//	}
//
//	public void setPolicy(RequestPolicy policy) {
//		this.policy = policy;
//	}
//
//	public Class<?> getResultType() {
//		return resultType;
//	}
//
//	public void setResultType(Class<?> resultType) {
//		this.resultType = resultType;
//	}
//
//	public ResponseWrapper getResponseWrapper() {
//		return responseWrapper;
//	}
//
//	public void setResponseWrapper(ResponseWrapper responseWrapper) {
//		this.responseWrapper = responseWrapper;
//	}
//
//	public synchronized void failed(Throwable exception) {
//		if (response == null) {
//			response = new Response();
//		}
//		response.setException(exception);
//	}
//
//
//}
