package com.itheima03;

import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rs = reverse(s);
        System.out.println(rs);
    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        String rs = sb.reverse().toString();
        return rs;
    }
}
