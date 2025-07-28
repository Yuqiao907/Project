package com.ubtechinc.process;

public class DataAddition {

    public static int addNum(int startNumber) {
        int sum = 0;
        for (int i = 1; i <= startNumber; i++) {
            sum += i;
        }
        return sum;
    }
}
