package com.dormouse.scallop.alibaba.client.exception;

/**
 * Api server which has been called by Ocean occurs a exception
 * 
 * @see APIInvokeException
 * @author xiaoning.qxn
 */
public class InvokeTargetException extends APIInvokeException {

    /**
	 * 
	 */
    private static final long serialVersionUID = -3140716302010989752L;

    @Override
    protected void initDefaultErrorCode() {
        errorCode = "500";
    }

    public InvokeTargetException(){
    }

    /**
     * @param message
     */
    public InvokeTargetException(String message){
        super(message);
        initDefaultErrorCode();
    }

    /**
     * @param cause
     */
    public InvokeTargetException(Throwable cause){
        super(cause);
        initDefaultErrorCode();
    }

    /**
     * @param message
     * @param cause
     */
    public InvokeTargetException(String message, Throwable cause){
        super(message, cause);
        initDefaultErrorCode();
    }
}
