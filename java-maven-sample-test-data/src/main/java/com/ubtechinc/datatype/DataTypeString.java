package com.ubtechinc.datatype;

import com.ubtechinc.datatype.AbstractDataType;
/*
* 并非基础数据类型，但这里进行了封装
* */
public class DataTypeString extends AbstractDataType<String> {


    public DataTypeString(String defaultString) {
        super(defaultString);
    }


    @Override
     public void formalForm(){

        this.defaultValue = defaultValue.toLowerCase().replaceAll("\\s+","");
    }

    private int returnLength(){
        formalForm();
        return defaultValue.length();
    }
}
