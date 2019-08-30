package com.enums.utils;

/**
 * 通用的枚举类型转换器
 */
public class EnumUtil {

    public static <T extends Enumerable> T of(Class<T> enumClass, String name) {
        for (T Clazz : enumClass.getEnumConstants()) {
            if (name == Clazz.getName()) {
                return Clazz;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        StatusEnum statusEnum = EnumUtil.of(StatusEnum.class, "1");
        System.out.println("statusEnum:{}"+statusEnum);
    }
}
