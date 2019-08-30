package com.enums.enums;

public enum RGBEnum {

    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
    // 成员变量
    private String name;

    private int index;

    private RGBEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }

    //覆盖方法  :只能使用toString方法来输出枚举变量值
    @Override
    public String toString() {
        return this.index+"_"+this.name;
    }

    public static void main(String[] args) {
        for(RGBEnum rgb:RGBEnum.values()) {
            System.out.println(rgb.toString());
        }
    }
}
