package com.itheima_02;

import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int numUpper = 0, numLower = 0, num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 64 && str.charAt(i) < 91) {
                numUpper++;
            } else if (str.charAt(i) > 96 && str.charAt(i) < 123) {
                numLower++;
            } else if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                num++;
            }
        }
        System.out.println("大写字母，小写字母，数字的数量分别是：" + numUpper + ", " + numLower + ", " + num);
    }
}
