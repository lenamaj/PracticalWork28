package com.alfa.task12;

public class Runner {

    public void run(){

        //1

        Integer [] intArray = {4, 5, 7, 8, 99, 45};
        System.out.println(MyTestMethod.<Integer>calcNum(intArray, 5));
        System.out.println(MyTestMethod.calcNum(new Double[]{1.1, 2.5, 6.7}, 0.0));
        System.out.println(MyTestMethod.calcNum(new String[]{"assas", "ygfcbbn", "testfcbb", "texx"}, "text"));

        //2
        System.out.println(MyTestMethod.<Double>calcSum(new Double[]{1.1, 2.5, 6.7}, 0.0));
        System.out.println(MyTestMethod.<Integer>calcSum(new Integer[]{4, 5, 7, 8, 99, 45}, 7));
    }
}
