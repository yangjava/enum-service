package com.enums.enums;

public enum SeasonEunm {
    /**
     * 每一个枚举变量都是枚举类SeasonEunm的实例化
     * SeasonEunm.SPRING获得的对象相当于new SeasonEunm("春","春困");获得的对象
     */
    SPRING("春","春困"),SUMMER("夏","夏睡"),AUTUMN("秋","秋乏"),WINTER("冬","冬眠");

    /**
     * @param name
     * @param value
     */
    private SeasonEunm(String name, String value) {
        this.name = name;
        this.value = value;
    }


    /**
     * 添加成员变量的原因是，方便够着方法赋值，
     * 使用SeasonEunm.SPRING.getName就能获取对应的值
     */
    private String name;
    private String value;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        for(SeasonEunm season:SeasonEunm.values()) {
            System.out.println("seasion:{}"+season);
            System.out.println("name:{}"+season.getName()+" value:{}"+season.getValue());
        }
    }
}
