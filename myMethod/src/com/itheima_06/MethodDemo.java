package com.itheima_06;

public class MethodDemo {
    public static void main(String[] args){
        boolean intResult = compare(5,6);
        System.out.println(intResult);
        System.out.println("--------");

        boolean shortResult = compare((short)5.0,(short)6.0);
        System.out.println(shortResult);
        System.out.println("--------");

        boolean longResult = compare((long)5,(long)6);
        System.out.println(longResult);
        System.out.println("--------");

        boolean byteResult = compare((byte)5,(byte)6);
        System.out.println(byteResult);
        System.out.println("--------");
    }

    public static boolean compare(int a, int b){
        System.out.println("int");
        if(a == b) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean compare(short a, short b){
        System.out.println("short");
        if(a == b) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean compare(byte a, byte b){
        System.out.println("byte");
        if(a == b) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean compare(long a, long b){
        System.out.println("long");
        if(a == b) {
            return true;
        }else{
            return false;
        }
    }
}
