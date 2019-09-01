package com.pan.codeExercises.enumTest;


/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/1 22:30
 */
public enum EnumTest {
    ONE(1, "a"), TWO(2, "b"), THREE(3, "c"), FOUR(4, "d"), FIVE(5, "e"), SIX(6, "f");

    private Integer retCode;
    private String retMessage;

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public String getRetMessage() {
        return retMessage;
    }

    public void setRetMessage(String retMessage) {
        this.retMessage = retMessage;
    }

    EnumTest(Integer retCode, String retMessage) {
        this.retCode = retCode;
        this.retMessage = retMessage;
    }

    public static EnumTest forEach_CountryEnum(int index) {
        EnumTest[] arr = EnumTest.values();
        for (EnumTest enumTest : arr) {
            if (index == enumTest.getRetCode()){
                return enumTest;
            }
        }
        return null;
    }
}
