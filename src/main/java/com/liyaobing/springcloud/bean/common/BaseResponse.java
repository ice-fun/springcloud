package com.liyaobing.springcloud.bean.common;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class BaseResponse<T> implements Serializable {
    public final static int SUCCESS_CODE = 200;
    public final static String SUCCESS_MSG = "success";
    public final static int FAIL_CODE = 300;
    public final static int UNAUTHORIZED_CODE = 301;
    public final static int NO_ACCESS = 305;
    public final static int ERROR_CODE = 500;

    private int statusCode;
    private String statusMsg;
    private T data;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BaseResponse(int statusCode, String statusMsg, T data) {
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
        this.data = data;
    }

    public static <T> BaseResponse<T> createResponse(int code, String msg, T data) {
        return new BaseResponse<T>(code, msg, data);
    }

    public static <T> BaseResponse<T> createNoDataResponse(int code, String msg) {
        return createResponse(code, msg, null);
    }

    public static <T> BaseResponse<T> createSuccessResponse() {
        return createResponse(SUCCESS_CODE, SUCCESS_MSG, null);
    }

    public static <T> BaseResponse<T> createSuccessResponse(T data) {
        return createResponse(SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static <T> BaseResponse<T> createFailResponse(String msg, T data) {
        return createResponse(FAIL_CODE, msg, data);
    }

    public static <T> BaseResponse<T> createFailResponse(String msg) {
        return createNoDataResponse(FAIL_CODE, msg);
    }

    public static <T> BaseResponse<T> createUnauthorizedResponse(String msg, T data) {
        return createResponse(FAIL_CODE, msg, data);
    }

    public static <T> BaseResponse<T> createUnauthorizedResponse(String msg) {
        return createNoDataResponse(FAIL_CODE, msg);
    }

    public static <T> BaseResponse<T> createErrorResponse(String msg, T data) {
        return createResponse(ERROR_CODE, msg, data);
    }

    public static <T> BaseResponse<T> createErrorResponse(String msg) {
        return createNoDataResponse(ERROR_CODE, msg);
    }

    public static <T> BaseResponse<T> createSuccessOrFailResponse(boolean success, String msg) {
        if (success) {
            return createSuccessResponse();
        }
        return createFailResponse(msg);
    }

    public static <T> BaseResponse<T> createNotNullFailResponse(String msg) {
        return createNoDataResponse(FAIL_CODE, msg);
    }
}

