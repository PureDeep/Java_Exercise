package com.itheima;

public class Test03 {
    public static void main(String[] args){
        for(int i = 1; i<= 100; i++){
            if(i % 7 == 0){
                System.out.println(i);
            }else if(i % 10 == 7){
                System.out.println(i);
            }else if(i / 10 == 7){
                System.out.println(i);
            }
        }
    }
}