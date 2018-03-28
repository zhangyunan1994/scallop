package com.dormouse.scallop.alibaba.client.exception;

/**
 * Unsupport API Exception
 * 
 * @see OceanClientException
 * @author xiaoning.qxn
 */
public class UnsupportAPIException extends OceanClientException {

    /**
	 * 
	 */
    private static final long serialVersionUID = 4175002508169314702L;

    @Override
    protected void initDefaultErrorCode() {
        errorCode = "404";
    }

    public UnsupportAPIException(){
    }

    /**
     * @param message
     */
    public UnsupportAPIException(String message){
        super("unsupport api:" + message);
        initDefaultErrorCode();
    }

    /**
     * @param cause
     */
    public UnsupportAPIException(Throwable cause){
        super(cause);
        initDefaultErrorCode();
    }

    /**
     * @param message
     * @param cause
     */
    public UnsupportAPIException(String message, Throwable cause){
        super(message, cause);
        initDefaultErrorCode();
    }

}
