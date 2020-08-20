package com.itheima_01;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = new int[2];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        arr[0] = 100;
        arr[1] = 200;
        arr2[0] = 100;
        arr2[1] = 300;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        int[] arr3 = arr;
        System.out.println(arr3);
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
    }
}
