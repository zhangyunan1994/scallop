/**
 * Project: ocean.client.java.basic
 * 
 * File Created at 2011-10-18
 * $Id: Response.java 410052 2015-05-06 08:18:05Z hongbang.hb $
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
package com.dormouse.scallop.alibaba.client;

import com.sparrow.sdk.alibaba.client.entity.ResponseWrapper;

/**
 * http调用返回的结果对象
 * 
 * @author jade
 */
public class Response {
	private static final String DEFAULT_CHARSET = "UTF-8";
	private int statusCode;
	private Object result;
	private Throwable exception;
	private String charset = DEFAULT_CHARSET;
	private String encoding;
	private ResponseWrapper responseWrapper;

	public Response setResult(Object result) {
		this.result = result;
		return this;
	}

	public Object getResult() {
		return result;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Throwable getException() {
		return exception;
	}

	public void setException(Throwable exception) {
		this.exception = exception;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
}
