package com.licc.drools.enums;

/**
 *
 * @author lichangchao
 * @version 1.0.0
 * @date 2017/8/16 9:33
 * @see
 */
public enum EnumMessage {
    HELLO(1, "hello drools"), BYE(2, "good bye drools");
    private int    code;
    private String value;

    EnumMessage(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

}
