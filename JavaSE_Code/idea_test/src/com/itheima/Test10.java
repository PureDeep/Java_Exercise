package com.itheima;

public class Test10 {
    public static void main(String[] args){
        int[] arr = {19,28,37,46,50};
        System.out.print("[");
        for(int i = 0; i< arr.length-1; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.print(arr[arr.length -1]);
        System.out.println("]");
        reverse(arr);
        System.out.print("[");
        for(int i = 0; i< arr.length-1; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.print(arr[arr.length -1]);
        System.out.println("]");
    }

    public static int[] reverse(int[] arr){
        if(arr.length % 2 == 0){
            for(int i = 0; i <= arr.length/2 -1; i ++){
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[arr.length - 1- i];
                arr[arr.length - 1- i] = temp;
            }
        }else{
            for(int i = 0; i <= arr.length/2; i++){
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[arr.length - 1- i];
                arr[arr.length - 1- i] = temp;
            }
        }
        return arr;
    }
}
