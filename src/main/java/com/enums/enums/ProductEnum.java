package com.enums.enums;

public enum ProductEnum {
    //车贷
    CARLOAN("carLoan"),
    //房贷
    HOUSELOAN("houseLoan"),
    //现金贷
    CASHLOAN("cashLoan");

    private String name;

    ProductEnum(String name) {
        this.name = name;
    }

    /**
     * 根据类型的名称，返回类型的枚举实例。
     *
     * @param name 类型名称
     */
    public static ProductEnum ofName(String name) {
        for (ProductEnum type : ProductEnum.values()) {
            if (type.getName().equals(name)) {
                return type;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        String name = "carLoan";
        ProductEnum productEnum = ProductEnum.ofName(name);
        System.out.println("name:{}"+name+" productEnum:{}"+productEnum);
        System.out.println("name:{}"+productEnum.name()+" ordinal:{}"+productEnum.ordinal());
    }

}
