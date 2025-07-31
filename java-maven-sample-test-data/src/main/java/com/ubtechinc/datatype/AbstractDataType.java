package com.ubtechinc.datatype;

/**
 * Abstract datatype
 *
 * @author MacBook Air
 * @date 2025/7/30 21:48
 */

public abstract class AbstractDataType<datatype> {


    protected datatype defaultValue;

    public AbstractDataType(datatype defauldatatypeValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * @return default value
     */

    public datatype getDefault() {

        return defaultValue;
    }

    /**
     * @param value -value wants to assign to
     */
    public void setDefault(datatype value) {
        this.defaultValue = value;
    }


    public abstract void formalForm();
}



