package com.dormouse.scallop.alibaba.client.exception;

/**
 * <p>
 * Security exception of Ocean
 * 
 * @see OceanClientException
 * @author xiaoning.qxn
 */
public class SecurityException extends OceanClientException {

    /**
	 * 
	 */
    private static final long serialVersionUID = 5274399451960948597L;

    @Override
    protected void initDefaultErrorCode() {
        errorCode = "400";
    }

    public SecurityException(){
    }

    /**
     * @param message
     */
    public SecurityException(String message){
        super("security exception:" + message);
        initDefaultErrorCode();
    }

    /**
     * @param cause
     */
    public SecurityException(Throwable cause){
        super(cause);
        initDefaultErrorCode();
    }

    /**
     * @param message
     * @param cause
     */
    public SecurityException(String message, Throwable cause){
        super(message, cause);
        initDefaultErrorCode();
    }

}
