package com.itheima01;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("HellowWorld!");
        System.out.println(sb);
        StringBuilder sb2 = new StringBuilder("helloworld!");
        System.out.println(sb2);
        sb2 = sb.reverse();
        System.out.println(sb2);
        StringBuilder a = sb.reverse();
        System.out.println(sb);
        String s = sb.toString();
        System.out.println(s);
    }
}
