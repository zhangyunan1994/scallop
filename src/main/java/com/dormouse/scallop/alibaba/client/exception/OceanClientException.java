package com.dormouse.scallop.alibaba.client.exception;

/**
 * Client side exception of Ocean
 * 
 * @see APIInvokeException
 * @author xiaoning.qxn
 */
public class OceanClientException extends OceanException {

    /**
	 * 
	 */
    private static final long serialVersionUID = -8369983656444533967L;

    protected void initDefaultErrorCode() {
        errorCode = "400";
    }

    public OceanClientException(){
    }

    /**
     * @param message
     */
    public OceanClientException(String message){
        super(message);
        initDefaultErrorCode();
    }

    /**
     * @param cause
     */
    public OceanClientException(Throwable cause){
        super(cause);
        initDefaultErrorCode();
    }

    /**
     * @param message
     * @param cause
     */
    public OceanClientException(String message, Throwable cause){
        super(message, cause);
        initDefaultErrorCode();
    }
}
