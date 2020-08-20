package com.itheima_01;
import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        isEven(a);
    }
    public static void isEven(int num){
        if(num % 2== 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
