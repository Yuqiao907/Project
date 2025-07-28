package com.ubtechinc.datatype.integertype;


/*
* public integer类
* */
public class DataTypeInteger {
    private int number;

/*
* 构造
* @param number*/
    public DataTypeInteger(int number) {
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
