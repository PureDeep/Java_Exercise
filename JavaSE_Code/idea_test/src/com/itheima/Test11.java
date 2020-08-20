package com.itheima;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args){
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< arr.length; i++){
            System.out.println(i+":");
            arr[i] = sc.nextInt();
        }
        int max = arr[0], min = arr[0];
        int m = 0, n = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                m = i;
            }
            if(arr[i] < min){
                min = arr[i];
                n = i;
            }
        }
        int sum = 0, average = 0;
        for(int i = 0; i< arr.length; i++){
            if(i != m && i != n){
                sum += arr[i];
            }
        }
        average = sum /(arr.length - 2);
        System.out.println("Average: " + average);
    }
}
