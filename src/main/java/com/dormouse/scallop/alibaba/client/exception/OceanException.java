package com.dormouse.scallop.alibaba.client.exception;

/**
 * Ocean Exception
 * 
 * @author xiaoning.qxn
 */
public class OceanException extends Exception {

    /**
	 * 
	 */
    private static final long serialVersionUID = -1828858210195741131L;

    protected String          errorCode;

    protected String          errorMessage;

    /**
     * 获取返回的error_code错误码
     * 
     * @return
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 获取返回的error_message错误信息
     * 
     * @return
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public OceanException(){
    }

    /**
     * @param message
     */
    public OceanException(String message){
        super(message);
        this.errorMessage = message;
    }

    /**
     * @param message
     */
    public OceanException(String errorCode, String message){
        super(message);
        this.errorCode = errorCode;
        this.errorMessage = message;
    }

    /**
     * @param cause
     */
    public OceanException(Throwable cause){
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public OceanException(String message, Throwable cause){
        super(message, cause);
    }
}
