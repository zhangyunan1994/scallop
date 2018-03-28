package com.dormouse.scallop.alibaba.client.exception;

/**
 * Read timeout exception when ocean read reponse from api server
 * 
 * @see APIInvokeException
 * @author xiaoning.qxn
 */
public class InvokeTimeoutException extends APIInvokeException {

    /**
	 * 
	 */
    private static final long serialVersionUID = -5174180184656894499L;

    @Override
    protected void initDefaultErrorCode() {
        errorCode = "504";
    }

    public InvokeTimeoutException(){
    }

    /**
     * @param message
     */
    public InvokeTimeoutException(String message){
        super("invoke timeout exception:" + message);
        initDefaultErrorCode();
    }

    /**
     * @param cause
     */
    public InvokeTimeoutException(Throwable cause){
        super(cause);
        initDefaultErrorCode();
    }

    /**
     * @param message
     * @param cause
     */
    public InvokeTimeoutException(String message, Throwable cause){
        super(message, cause);
        initDefaultErrorCode();
    }

}
