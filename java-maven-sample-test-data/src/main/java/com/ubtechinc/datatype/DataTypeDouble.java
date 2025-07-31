package com.ubtechinc.datatype;

import com.ubtechinc.datatype.AbstractDataType;

/**
 * 自动类型转换优先级，double>float>long>int
 * 隐式转换
 * 强制转换
 */

/**
 * Double占 64 位（8 字节）
 * 实际开发中，如果不是特别大的金额，建议乘以 100 转成整型进行处理，或者用BigDecimal那个类
 */

/**
 *public datatype double
 * @author MacBook Air
 * @date 2025/7/29 22:15
 */

public class DataTypeDouble extends AbstractDataType<Double> {


    public DataTypeDouble(Double defaultDouble) {
        super(defaultDouble);
    }

    @Override
    public void formalForm() {

    }


    /**
     静态方法相当于类，无需创建对象也能用，不支持多态重写，不支持调用实例变量
     * */
    /**
     *
     * @param former -first double
     * @param latter - second double
     * @return - product of two param
     */
    public static double multiplyDouble(double former, double latter) {
        return former * latter;
    }

    /**
     *
     * @param number - double number to be rounded
     * @return num round to 2 decimal places
     */
    public double roundToTwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }

}

