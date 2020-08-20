package com.itheima_03;
import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = isEven(a);
        System.out.println(b);
    }

    public static boolean isEven(int a){
        if(a % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }
}
