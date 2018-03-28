/**
 * Project: ocean.client.java.basic
 *
 * File Created at 2011-10-18
 * $Id: ClientPolicy.java 410405 2015-05-07 13:01:22Z hongbang.hb $
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


/**
 * 客户端级访问策略
 * <p>
 * 定义域名、端口、appKey、秘钥等客户端级信息
 * <p>
 * 参考<code>RequestPolicy</code>
 * <p>
 * 
 * @author jade
 */
public class ClientPolicy implements Cloneable {

	private static Integer DEFAULT_HTTP_PORT = 80;
	private static Integer DEFAULT_HTTPS_PORT = 443;

	private static final ClientPolicy CBU_POLICY = new ClientPolicy("gw.open.1688.com");

	private String serverHost;
	private int httpPort = DEFAULT_HTTP_PORT;
	private int httpsPort = DEFAULT_HTTPS_PORT;
	private String appKey;
	private String signingKey;
	private int defaultTimeout = 5000;
	private String defaultContentCharset = "UTF-8";
	private boolean defaultUseHttps = false;
	private String agent = "Ocean-SDK-Client";

	/**
	 * 生成默认的ClientPolicy实例，包括默认的http(80)，https(443)端口,默认的域名gw.open.1688.com，
	 * 以及默认的api版本为1
	 * 
	 * @return
	 */
	public static ClientPolicy getDefaultChinaAlibabaPolicy() {
		return CBU_POLICY.clone();
	}

	/**
	 * 拷贝生成新的对象
	 */
	public ClientPolicy clone() {
		ClientPolicy newObj = newPolicy();
		newObj.httpPort = httpPort;
		newObj.httpsPort = httpsPort;
		newObj.defaultTimeout = defaultTimeout;
		newObj.defaultContentCharset = defaultContentCharset;
		newObj.defaultUseHttps = defaultUseHttps;

		newObj.appKey = appKey;
		newObj.signingKey = signingKey;
		newObj.agent = agent;
		return newObj;
	}

	protected ClientPolicy newPolicy() {
		return new ClientPolicy(serverHost);
	}

	/**
	 * 指定开放平台服务地址来生成ClientPolicy
	 * 
	 * @param serverHost
	 *            开放平台服务ip地址或者域名
	 */
	public ClientPolicy(String serverHost) {
		if (serverHost == null || serverHost.length() < 1) {
			throw new IllegalArgumentException("serverHost can not be empty");
		}
		this.serverHost = serverHost;
	}

	/**
	 * 获取http端口
	 * 
	 * @return
	 */
	public int getHttpPort() {
		return httpPort;
	}

	/**
	 * 获取https端口
	 * 
	 * @return
	 */
	public int getHttpsPort() {
		return httpsPort;
	}

	/**
	 * 获取开放平台服务ip地址或者域名
	 * 
	 * @return
	 */
	public String getServerHost() {
		return serverHost;
	}

	/**
	 * 设置http端口
	 * 
	 * @param httpPort
	 *            端口
	 * @return a reference to this object
	 */
	public ClientPolicy setHttpPort(Integer httpPort) {
		this.httpPort = httpPort;
		return this;
	}

	/**
	 * 设置https端口
	 * 
	 * @param httpsPort
	 *            端口
	 * @return a reference to this object
	 */
	public ClientPolicy setHttpsPort(Integer httpsPort) {
		this.httpsPort = httpsPort;
		return this;
	}

	public String getAppKey() {
		return appKey;

	}

	/**
	 * 设置app key
	 * 
	 * @param appKey
	 * @return a reference to this object
	 */
	public ClientPolicy setAppKey(String appKey) {
		this.appKey = appKey;
		return this;
	}

	public String getSigningKey() {
		return signingKey;
	}

	/**
	 * 设置秘钥
	 * 
	 * @param signingKey
	 * @return a reference to this object
	 */
	public ClientPolicy setSigningKey(String signingKey) {
		this.signingKey = signingKey;
		return this;
	}

	public int getDefaultTimeout() {
		return defaultTimeout;
	}

	public ClientPolicy setDefaultTimeout(int defaultTimeout) {
		this.defaultTimeout = defaultTimeout;
		return this;
	}

	public String getDefaultContentCharset() {
		return defaultContentCharset;
	}

	public ClientPolicy setDefaultContentCharset(String defaultContentCharset) {
		this.defaultContentCharset = defaultContentCharset;
		return this;
	}

	public boolean isDefaultUseHttps() {
		return defaultUseHttps;
	}

	public ClientPolicy setDefaultUseHttps(boolean defaultUseHttps) {
		this.defaultUseHttps = defaultUseHttps;
		return this;
	}

	public String getAgent() {
		return agent;
	}

}
