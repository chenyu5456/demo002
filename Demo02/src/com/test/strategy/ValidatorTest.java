package com.test.strategy;

/**
 * 策略模式测试
 */
public class ValidatorTest {
    public static void main(String[] args) {
        testValidator();
        lamdbaTest();
    }

    public static void testValidator(){
        Validator numericValidator = new Validator(new IsNumeric());
        boolean b1 = numericValidator.validate("12");
        System.out.println(b1);

        Validator lowerCase = new Validator(new IsAllLowerCase());
        boolean b2 = lowerCase.validate("aba");
        System.out.println(b2);
    }

    public static void lamdbaTest(){
        Validator validator = new Validator((String s) -> s.matches("[A-Z]+"));
        boolean aa = validator.validate("Aa");
        System.out.println(aa);
    }
}
