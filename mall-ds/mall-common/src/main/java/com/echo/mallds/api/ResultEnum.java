package com.echo.mallds.api;

public enum ResultEnum {
    SUCCESS(0000, "成功"),

    SERVER_ERROR(9999, "服务器错误");

    private final Integer code;

    private final String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResultEnum{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
