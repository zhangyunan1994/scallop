/**
 * Project: ocean.client.java.basic
 *
 * File Created at 2011-10-26
 * $Id: RequestPolicy.java 410052 2015-05-06 08:18:05Z hongbang.hb $
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
package com.dormouse.scallop.alibaba.client.policy;

import com.sparrow.sdk.alibaba.client.ErrorHandler;

/**
 * 请求级访问策略
 * <p>
 * 定义是否使用签名、是否使用https、是否加入授权信息、超时设置、http方法设置等请求级别信息
 * <p>
 * 参考<code>ClientPolicy</code>
 * <p>
 * 
 * @author jade
 * @author xiaoning.qxn
 */
public class RequestPolicy implements Cloneable {

	private boolean requestSendTimestamp = false;
	private boolean useHttps = false;
	private Protocol requestProtocol = Protocol.param2;
	private Protocol responseProtocol = Protocol.json2;
	private boolean responseCompress = true;
	private int requestCompressThreshold = -1; // 默认不开启
	private int timeout = 5000; // 5秒
	private HttpMethodPolicy httpMethod = HttpMethodPolicy.POST;
	private String queryStringCharset = "GB18030"; // Request URL query string
													// encoder
	private String contentCharset = "UTF-8"; // Request body encoder
	private boolean useSignture = true;
	private boolean needAuthorization = false;
	private boolean accessPrivateApi = false;
	private int defaultApiVersion = 1;
	private ErrorHandler errorHandler;

	public static RequestPolicy authPolicy = null;

	/**
	 * 全局的授权请求的request policy，用户可能需要设置超时时间，其他不用变
	 * 
	 * @return
	 */
	public static RequestPolicy getAuthPolicy() {
		if (authPolicy == null) {
			authPolicy = new RequestPolicy().setHttpMethod(HttpMethodPolicy.POST).setRequestProtocol(Protocol.param2)
					.setUseHttps(true).setNeedAuthorization(false);
		}
		return authPolicy;
	}

	public RequestPolicy clone() {
		RequestPolicy newObj = newPolicy();
		newObj.requestSendTimestamp = requestSendTimestamp;
		newObj.useHttps = useHttps;
		newObj.requestProtocol = requestProtocol;
		newObj.responseProtocol = responseProtocol;
		newObj.responseCompress = responseCompress;
		newObj.requestCompressThreshold = requestCompressThreshold;
		newObj.timeout = timeout;
		newObj.httpMethod = httpMethod;
		newObj.queryStringCharset = queryStringCharset;
		newObj.contentCharset = contentCharset;
		newObj.useSignture = useSignture;
		newObj.accessPrivateApi = accessPrivateApi;
		newObj.defaultApiVersion = defaultApiVersion;
		return newObj;
	}

	protected RequestPolicy newPolicy() {
		return new RequestPolicy();
	}

	/**
	 * 设置是否使用时间戳
	 * 
	 * @param requestSendTimestamp
	 * @return a reference to this object
	 */
	public RequestPolicy setRequestSendTimestamp(boolean requestSendTimestamp) {
		this.requestSendTimestamp = requestSendTimestamp;
		return this;
	}

	public boolean isRequestSendTimestamp() {
		return requestSendTimestamp;
	}

	public boolean isUseHttps() {
		return useHttps;
	}

	/**
	 * 设置是否使用https访问
	 * 
	 * @param useHttps
	 * @return a reference to this object
	 */
	public RequestPolicy setUseHttps(boolean useHttps) {
		this.useHttps = useHttps;
		return this;
	}

	/**
	 * 设置访问协议,默认为推荐的param2
	 * 
	 * @param protocol
	 * @return a reference to this object
	 */
	public RequestPolicy setRequestProtocol(Protocol protocol) {
		if (protocol == null) {
			throw new IllegalArgumentException("protocol can not be null");
		}
		this.requestProtocol = protocol;
		return this;
	}

	
	public Protocol getRequestProtocol() {
		return requestProtocol;
	}

	public boolean isResponseCompress() {
		return responseCompress;
	}

	/**
	 * response是否压缩
	 * 
	 * @param responseCompress
	 * @return a reference to this object
	 */
	private RequestPolicy setResponseCompress(boolean responseCompress) {
		this.responseCompress = responseCompress;
		return this;
	}

	public int getRequestCompressThreshold() {
		return requestCompressThreshold;
	}

	/**
	 * 设置请求压缩的阀值，超过这个阀值就进行压缩,默认值为-1不开启,建议1K，即1024
	 * 
	 * @param requestCompressThreshold
	 * @return
	 */
	public RequestPolicy setRequestCompressThreshold(int requestCompressThreshold) {
		this.requestCompressThreshold = requestCompressThreshold;
		return this;
	}

	public int getTimeout() {
		return timeout;
	}

	/**
	 * 设置超时时间,默认5s
	 * 
	 * @param timeout
	 * @return a reference to this object
	 */
	public RequestPolicy setTimeout(int timeout) {
		this.timeout = timeout;
		return this;
	}

	/**
	 * 设置http方法，默认为自动（ATOU），当request中有参数时，使用post，否则get
	 * 
	 * @param httpMethod
	 * @return a reference to this object
	 */
	public RequestPolicy setHttpMethod(HttpMethodPolicy httpMethod) {
		this.httpMethod = httpMethod;
		return this;
	}

	public HttpMethodPolicy getHttpMethod() {
		return httpMethod;
	}

	public String getQueryStringCharset() {
		return queryStringCharset;
	}

	/**
	 * 设置request编码，默认为UTF-8
	 * 
	 * @param queryStringCharset
	 * @return a reference to this object
	 */
	public RequestPolicy setQueryStringCharset(String queryStringCharset) {
		this.queryStringCharset = queryStringCharset;
		return this;
	}

	public String getContentCharset() {
		return contentCharset;
	}

	/**
	 * 设置cotent编码，默认为UTF-8
	 * 
	 * @param contentCharset
	 * @return a reference to this object
	 */
	public RequestPolicy setContentCharset(String contentCharset) {
		this.contentCharset = contentCharset;
		return this;
	}

	/**
	 * 设置response协议，默认为推荐的json
	 * 
	 * @param responseProtocol
	 * @return a reference to this object
	 */
	public RequestPolicy setResponseProtocol(Protocol responseProtocol) {
		if (requestProtocol == null) {
			throw new IllegalArgumentException("response protocol can not be null");
		}
		this.responseProtocol = responseProtocol;
		return this;
	}

	public Protocol getResponseProtocol() {
		return responseProtocol;
	}

	/**
	 * 请求HTTP方法策略
	 * 
	 * @author jade
	 */
	public static enum HttpMethodPolicy {
		/**
		 * 总是使用post
		 */
		POST,
		/**
		 * 总是使用get
		 */
		GET;
	}

	public ErrorHandler getErrorHandler() {
		return errorHandler;
	}

	/**
	 * 设置error handler
	 * 
	 * @param errorHandler
	 * @return a reference to this object
	 */
	public RequestPolicy setErrorHandler(ErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
		return this;
	}

	public boolean isUseSignture() {
		return useSignture;
	}

	/**
	 * 是否使用签名，取决于api要求
	 * 
	 * @param useSignture
	 * @return a reference to this object
	 */
	public RequestPolicy setUseSignture(boolean useSignture) {
		this.useSignture = useSignture;
		return this;
	}

	public boolean isNeedAuthorization() {
		return needAuthorization;
	}

	/**
	 * 是否加入授权信息，取决于api要求
	 * 
	 * @param needAuthorization
	 * @return a reference to this object
	 */
	public RequestPolicy setNeedAuthorization(boolean needAuthorization) {
		this.needAuthorization = needAuthorization;
		return this;
	}

	public boolean isAccessPrivateApi() {
		return accessPrivateApi;
	}

	/**
	 * 是否在访问私有api，默认为false. 即访问url以http://host:port/api/...方式
	 * 
	 * @param accessPrivateApi
	 */
	public void setAccessPrivateApi(boolean accessPrivateApi) {
		this.accessPrivateApi = accessPrivateApi;
	}

	public int getDefaultApiVersion() {
		return defaultApiVersion;
	}

}
