package com.ubtechinc.datatype;


public abstract class AbstractDataType<datatype> {


        protected datatype defaultValue;

        public AbstractDataType(datatype defauldatatypeValue) {
            this.defaultValue = defaultValue;
        }

    /**
     *
     * @return default value
     */

        public datatype getDefault() {
            return defaultValue;
        }

    /**
     *
     * @param value
     */
        public void setDefault(datatype value) {
            this.defaultValue = value;
        }


        public abstract void formalForm();
    }



