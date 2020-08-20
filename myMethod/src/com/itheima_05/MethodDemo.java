package com.itheima_05;

public class MethodDemo {
    public static void main(String[] args){
        System.out.println(getSum(1,2,3));
        System.out.println(getSum(1.0,2.0));
        System.out.println(getSum(1,2));
    }

    public static int getSum(int a, int b){
        return a + b;
    }

    public static double getSum(double a, double b){
        return a + b;
    }

    public static int getSum(int a, int b, int c){
        return a + b + c;
    }
}
