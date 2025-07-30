package com.ubtechinc.datatype;

import com.ubtechinc.datatype.AbstractDataType;

/**
 * long 型变量在声明的时候，末尾要带上大写的“L
 *
 */

/**
 *public datatype long
 * @author MacBook Air
 * @date 2025/7/29 22:27
 */

public class DataTypeLong extends AbstractDataType <Long> {

    public DataTypeLong(Long defaultValue) {
        super(defaultValue);
    }



    @Override
    public void formalForm() {

    }


    /**
     * 把long转成byte储存
     * @param x - long data to be converted to byte
     * @return converted byte
     */
    public static byte[] longToBytes(long x) {
    //        保存long的8个字节
        byte[] buffer = new byte[8];
        for (int i = 7; i >= 0; i--) {
    //            只保留最后八位的意思
            buffer[i] = (byte)(x & 0xFF);
            x >>= 8;
        }
        return buffer;
    }





}
