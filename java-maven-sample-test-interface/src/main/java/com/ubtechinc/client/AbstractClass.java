package com.ubtechinc.client;

public class AbstractClass {

    //抽象类
    abstract class Vehicle{

        private int currentPrice;

    //里面的构造方法，默认无参，此处有参
        public Vehicle(int currentPrice) {
            this.currentPrice = currentPrice;
        }
    //抽象方法
        abstract void getCurrentPrice();

        //抽象类中可以接受完整方法

        public void hint(){
            System.out.println("refresh the page!");
        }


    }

    //子类继承
    class Car extends Vehicle implements movable{

        public Car(int currentPrice) {
            super(currentPrice);
        }
//子类实现
 @Override
         void getCurrentPrice(){
        System.out.println("get current price!");
        };
//接口实现
public void getNextMove(){
    System.out.println("get next move!");
}
    }

//接口
    interface movable {
        //接口里面的常量必须public final
    public final static String INIT_NAME = "";

        //接口里面只能有抽象方法

      void getNextMove();
}




}
