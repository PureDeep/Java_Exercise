package com.itheima_03;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //arr = null;
        System.out.println(arr[3]);
        System.out.println("--------");
        int[] arr2 = {4, 5, 6, 7};
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        arr = null;
        System.out.println(arr);
    }
}
