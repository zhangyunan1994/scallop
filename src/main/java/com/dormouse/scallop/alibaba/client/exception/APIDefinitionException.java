/*
 * Copyright 2012 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.dormouse.scallop.alibaba.client.exception;

/**
 * 
 * @author fray.yangb Aug 15, 2012 2:01:16 PM
 */
public class APIDefinitionException extends OceanException {

    /**
     *
     */
    private static final long serialVersionUID = 8441359514315157038L;

    protected void initDefaultErrorCode() {
        errorCode = "100";
    }

    /**
     *
     */
    public APIDefinitionException(){
    }

    /**
     * @param message
     */
    public APIDefinitionException(String message){
        super(message);
        initDefaultErrorCode();
    }

    /**
     * @param cause
     */
    public APIDefinitionException(Throwable cause){
        super(cause);
        initDefaultErrorCode();
    }

    /**
     * @param message
     * @param cause
     */
    public APIDefinitionException(String message, Throwable cause){
        super(message, cause);
        initDefaultErrorCode();
    }

}
