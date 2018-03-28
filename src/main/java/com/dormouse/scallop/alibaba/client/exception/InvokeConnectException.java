package com.dormouse.scallop.alibaba.client.exception;

/**
 * Occur connect exception when ocean connects the api server
 * 
 * @see APIInvokeException
 * @author xiaoning.qxn
 */
public class InvokeConnectException extends APIInvokeException {

    /**
	 * 
	 */
    private static final long serialVersionUID = -1141635353247513206L;

    @Override
    protected void initDefaultErrorCode() {
        errorCode = "502";
    }

    public InvokeConnectException(){
    }

    /**
     * @param message
     */
    public InvokeConnectException(String message){
        super("invoke connect exception:" + message);
        initDefaultErrorCode();
    }

    /**
     * @param cause
     */
    public InvokeConnectException(Throwable cause){
        super(cause);
        initDefaultErrorCode();
    }

    /**
     * @param message
     * @param cause
     */
    public InvokeConnectException(String message, Throwable cause){
        super(message, cause);
        initDefaultErrorCode();
    }
}
