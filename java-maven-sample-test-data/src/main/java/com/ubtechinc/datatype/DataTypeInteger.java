package com.ubtechinc.datatype;

import com.ubtechinc.datatype.AbstractDataType;

/**
 * 四字节，32位
 * 取值范围在 -2,147,483,648（-2 ^ 31）和 2,147,483,647（2 ^ 31 -1）（含）之间。如果没有特殊需求，整型数据就用 int
 */

/**
 * public integer类
 *
 * @author MacBook Air
 * @date 2025/7/29 22:23
 */

public class DataTypeInteger extends AbstractDataType<Integer> {


    public DataTypeInteger(int number) {
        super(number);
    }

    @Override
    public void formalForm() {

    }

    /**
     * @return square of number
     */
    public int square() {
        return defaultValue * defaultValue;
    }

    /**
     * @return random number
     */
    public int randomMultiply() {
        return (int) (Math.random() * defaultValue);
    }

}
