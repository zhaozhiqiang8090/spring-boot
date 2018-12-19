package com.zzq.basic.java.enumration;

public enum MarriageCode {

    /**
     * 婚姻状况映射
     */
    MARITAL_STATUS_S("S", "1", "单身"),
    MARITAL_STATUS_C("C", "2", "已婚"),
    MARITAL_STATUS_O("O", "4", "其他");

    private String code;
    private String msg;
    private String showMsg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getShowMsg() {
        return showMsg;
    }

    public void setShowMsg(String showMsg) {
        this.showMsg = showMsg;
    }

    MarriageCode(String code, String msg, String... showMsg) {
        this.code = code;
        this.msg = msg;
        if (showMsg.length > 0) {
            this.showMsg = showMsg[0];
        }
    }

    public static MarriageCode getByCode(String code) {
        for (MarriageCode e : values()) {
            if (e.code.equals(code)) {
                return e;
            }
        }
        return null;
    }

}
