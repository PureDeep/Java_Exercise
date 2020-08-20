package com.itheima;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args){
        int[] arr = {19,28,37,46,50};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findIndex(num, arr));
    }

    public static int findIndex(int num, int[] arr){
        int a = -1;
        for(int i = 0; i<arr.length;i++){
            if(num == arr[i]){
                a = i;
                break;
            }
        }
        return a;
    }
}
