package com.ubtechinc.datatype;


/*
* public integer类
* */
public class AbstractDataTypeInteger {
    private int number;

/*
* 构造
* @param number*/
    public AbstractDataTypeInteger(int number) {
        this.number = number;
    }

/*
* @return number*/
    public int getNumber() {
        return number;
    }

    private void setNumber(int number) {
        this.number = number;
    }
    /*
     * @return square of number*/
    public int square(){
        return number*number;
    }

    /*
     * @return random number*/
    public int randomMultiply(){
        return  (int)(Math.random()*number);
    }

}
