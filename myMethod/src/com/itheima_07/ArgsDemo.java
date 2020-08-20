package com.itheima_07;

public class ArgsDemo {
    public static void main(String[] args){
        int[] arr = {10,20,30};
        System.out.println("Before: " + arr[1]);
        change(arr);
        System.out.println("After: " + arr[1]);
    }

    public static void change(int[] arr){
        arr[1] = 200;
    }
}
