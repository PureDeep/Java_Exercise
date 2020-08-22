package com.itheima04;

public class Zi extends Fu{
    public void method(){
        System.out.println("Zi类中method方法被调用");
    }

    public void show(){
        super.show();
        System.out.println("Zi类中show方法被调用");
    }
}
