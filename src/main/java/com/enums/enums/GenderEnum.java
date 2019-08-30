package com.enums.enums;

/**
 * @author yangjingjing
 *
 */
public enum GenderEnum {
    /**
     * 男
     */
    MALE{
        @Override
        public Boolean isMale(){
            return true;
        }
    },
    /**
     * 女
     */
    FEMALE{
       @Override
       public Boolean isFemale(){
           return true;
       }
   };

    public Boolean isMale(){
        return false;
    }

    public Boolean isFemale(){
        return false;
    }

    public static void main(String[] args) {
        System.out.println(GenderEnum.FEMALE.isFemale());
        System.out.println(GenderEnum.FEMALE.isMale());
    }

}
