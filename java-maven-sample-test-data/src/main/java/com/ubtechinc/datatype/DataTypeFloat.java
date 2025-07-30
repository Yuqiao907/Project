package com.ubtechinc.datatype;

import com.ubtechinc.datatype.AbstractDataType;

/**
 * 单精度浮点数通常占用 32 位（4 字节）存储空间。精度大约为 6 到 9 位有效数字,节省内存，不在乎精度
 * 浮点数在二进制中是近似表示，所以判断是否相等时需要定义一个误差范围，只要在范围里就是相当
 * 四舍五入要和double一样显示处理
 * 长链加法时误差会累积
 * 定义时须带上f
 */

/**
 *public datatype float
 * @author MacBook Air
 * @date 2025/7/29 22:19
 */

public class DataTypeFloat extends AbstractDataType <Float> {

    public DataTypeFloat(Float defaultValue) {
        super(defaultValue);
    }



    @Override
    public void formalForm() {

    }

    /**
     * 选出两个float中更大的那个
     * @param a -float a
     * @param b -float b
     * @return max of two float
     */
    public static float floatMax(float a, float b){
        //if (a != a) return a;
    //        判断一下是否是正0负0的特殊情况，把一个 float 类型的数字转成它在内存中对应的二进制表示（32 位）
    //        然后以 int 的形式返回这 32 位的值，看符号位的正负

        if (a == 0.0f && b == 0.0f) {
            return (Float.floatToRawIntBits(a) & 0x80000000) == 0 ? b : a;
        }

        return (a >= b) ? a : b;
    }

}


