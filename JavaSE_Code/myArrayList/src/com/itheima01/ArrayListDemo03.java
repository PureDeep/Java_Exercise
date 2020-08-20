package com.itheima01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("Hello");
        array.add("World");
        array.add("Java");
        show(array);
    }

    public static void show(ArrayList array){
        for(int i = 0;i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
}
