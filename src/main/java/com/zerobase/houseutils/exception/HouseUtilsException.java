package com.zerobase.houseutils.exception;

public class HouseUtilsException extends RuntimeException {
    private ErrorCode errorCode;
    private String message;

    public HouseUtilsException(ErrorCode errorCode) {
        this(errorCode, errorCode.getMessage());
    }

    public HouseUtilsException(ErrorCode errorCode, String customMessage) {
        super(customMessage);
        this.errorCode = errorCode;
        this.message = customMessage;
    }
}
