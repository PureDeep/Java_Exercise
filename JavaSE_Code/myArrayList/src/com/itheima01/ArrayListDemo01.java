package com.itheima01;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        System.out.println(array.add("Hello!"));
        array.add("World!");
        array.add(1,"New");
        array.add(3,"Here!");
        //array.add(5,"Now!");
        System.out.println(array);
    }
}
