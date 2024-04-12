package com.wp.common;

/**
 * @author wp
 * @create 2024-04-11  11:46
 */
public enum AreaEnum {
    NORTHEAST("东北地区","00"),
    NORTHCHINA("华北地区","01");

    private String text;

    private String code;

    AreaEnum(String text, String code) {
        this.text = text;
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
