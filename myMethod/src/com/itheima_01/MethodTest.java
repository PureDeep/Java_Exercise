package com.itheima_01;
import java.util.Scanner;

public class MethodTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        getMax(a, b);
    }

    public static void getMax(int a, int b){
        if(a > b){
            System.out.println("Max: " + a);
        }else{
            System.out.println("Max: " + b);
        }
    }
}
