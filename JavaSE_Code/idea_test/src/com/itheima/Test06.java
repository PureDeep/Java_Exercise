package com.itheima;

public class Test06 {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 10 != 7) & (arr[i] % 100 / 10 != 7) & (arr[i] % 2 == 0)) {
                System.out.println(arr[i]);
                sum += arr[i];
            }
        }
        System.out.println("Sum: " + sum);
    }
}
