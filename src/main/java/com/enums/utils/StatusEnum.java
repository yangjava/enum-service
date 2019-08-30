package com.enums.utils;

public enum StatusEnum implements Enumerable{
    /**
     * 成功
     */
    SUCCESS("1", "成功"),

    /**
     * 失败
     */
    FAIL("2", "失败");

    private String name;

    private String value;

    StatusEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
