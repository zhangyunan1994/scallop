/**
 * Project: ocean.client.java.basic
 *
 * File Created at 2011-11-23
 * $Id: LoggerHelper.java 410052 2015-05-06 08:18:05Z hongbang.hb $
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
package com.dormouse.scallop.alibaba.client.util;

import java.util.logging.Logger;

/**
 * Comment of LoggerHelper
 * 
 * @author jade
 *
 */
public final class LoggerHelper {
	private static Logger logger = Logger.getLogger("com.chameleon.sdk.alibaba.openapi.client");

	public static Logger getClientLogger() {
		return logger;
	}

	private LoggerHelper() {
	}
}
