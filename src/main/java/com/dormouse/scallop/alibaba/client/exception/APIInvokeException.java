/**
 * Project: ocean.client.java.basic
 * 
 * File Created at 2011-11-30
 * $Id: APIInvokeException.java 330381 2014-03-04 07:58:24Z yichun.wangyc $
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
package com.dormouse.scallop.alibaba.client.exception;

/**
 * Server side exception of Ocean
 * 
 * @see OceanClientException
 * @author xiaoning.qxn
 */
public class APIInvokeException extends OceanException {

    /**
     * 
     */
    private static final long serialVersionUID = 451580322715077481L;

    protected void initDefaultErrorCode() {
        errorCode = "500";
    }

    /**
     * 
     */
    public APIInvokeException(){
    }

    /**
     * @param message
     */
    public APIInvokeException(String message){
        super(message);
        initDefaultErrorCode();
    }

    /**
     * @param cause
     */
    public APIInvokeException(Throwable cause){
        super(cause);
        initDefaultErrorCode();
    }

    /**
     * @param message
     * @param cause
     */
    public APIInvokeException(String message, Throwable cause){
        super(message, cause);
        initDefaultErrorCode();
    }
}
