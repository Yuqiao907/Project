package com.ubtechinc.datatype;

import com.ubtechinc.datatype.AbstractDataType;

/**
 *
 * @author MacBook Air
 * 并非基础数据类型，但这里进行了封装
 * @date 2025/7/29 6:08
 */

public class DataTypeString extends AbstractDataType<String> {


    public DataTypeString(String defaultString) {
        super(defaultString);
    }


    @Override
    /**
     * 去掉string当中的空格并统一为小写
     */
     public void formalForm(){

        this.defaultValue = defaultValue.toLowerCase().replaceAll("\\s+","");
    }

    /**
     * 返回 default value的长度
     * @return length
     */

    private int returnLength(){
        formalForm();
        return defaultValue.length();
    }
}
