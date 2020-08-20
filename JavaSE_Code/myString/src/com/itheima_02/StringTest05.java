package com.itheima_02;

import java.util.Scanner;

public class StringTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = reverse(str);
        System.out.println(s);
    }

    public static String reverse(String str){
        String s = "";
        for(int i = str.length() - 1; i >= 0; i--){
            s += str.charAt(i);
        }
        return s;
    }
}
