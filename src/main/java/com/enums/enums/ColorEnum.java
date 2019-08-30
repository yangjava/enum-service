package com.enums.enums;

/**
 * 枚举是一个特殊的类  class
 * 相当于使用  final static修饰，不能被继承
 * 拥有默认的私有构造方法 private ColorEnum();
 * 所有的枚举都继承自java.lang.Enum类。
 * 由于Java 不支持多继承，所以枚举对象不能再继承其他类
 */
public enum ColorEnum {
    //每个枚举变量都是枚举类ColorEnum的实例，相当于RED=new ColorEnum（1），按序号来。
    //每个成员变量都是final static修饰
    RED, GREEN, BLANK, YELLOW;

    public static void main(String[] args) {
        for(ColorEnum color:ColorEnum.values()) {
            System.out.println("name:{}"+color.name()+" ordinal:{}"+color.ordinal());
            System.out.println("color:{}"+color);
        }
    }
}
