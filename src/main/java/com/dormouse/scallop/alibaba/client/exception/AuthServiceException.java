package com.dormouse.scallop.alibaba.client.exception;

/**
 * Occur auth Exception when the client try to pass the authenticate or get some permission
 * 
 * @see OceanClientException
 * @author xiaoning.qxn
 */
public class AuthServiceException extends OceanClientException {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1966110063291114667L;

    protected void initDefaultErrorCode() {
        errorCode = "401";
    }

    public AuthServiceException(){
    }

    /**
     * @param message
     */
    public AuthServiceException(String message){
        super("auth service exception:" + message);
        initDefaultErrorCode();
    }

    /**
     * @param cause
     */
    public AuthServiceException(Throwable cause){
        super(cause);
        initDefaultErrorCode();
    }

    /**
     * @param message
     * @param cause
     */
    public AuthServiceException(String message, Throwable cause){
        super(message, cause);
        initDefaultErrorCode();
    }

}
