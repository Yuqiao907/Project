package com.ubtechinc.datatype;

import com.ubtechinc.datatype.AbstractDataType;

/**
 * 两字节，十六位，在通信协议、内存受限的嵌入式设备或二进制 I/O 中，Short 常用于节省空间
 */

/**
 *
 * @author MacBook Air
 * @date 2025/7/29 22:32
 */

public class DataTypeShort extends AbstractDataType <Short>{
    public final short MIN_VALUE;
    public final short MAX_VALUE;

    public DataTypeShort(short data,short minValue, short maxValue){
        super(data);
        this.MIN_VALUE = minValue;
        this.MAX_VALUE = maxValue;
    }



    @Override
    public void formalForm() {

    }

    /**
     *判断short是否在某个范围内
     * @author MacBook Air
     * @param value - 被与常量范围比较的整数
     * @return true if value is in the range
     * @date 2025/7/29 4:31
     */
    public boolean isValidShort(int value) {

        return value >= Short.MIN_VALUE && value <= Short.MAX_VALUE;
    }





}
