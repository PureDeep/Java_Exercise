package com.itheima_01;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.brand);
        System.out.println(p.prices);
        p.brand = "XiaoMi";
        p.prices = 3000;
        System.out.println(p.brand);
        System.out.println(p.prices);
    }
}
