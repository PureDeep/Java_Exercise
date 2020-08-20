package com.itheima01;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("Hello");
        array.add("World");
        array.add("Java");
        System.out.println("array: " + array);

//        System.out.println(array.remove("World"));
//        System.out.println(array.remove("World"));
//        System.out.println("array: " + array);

//        System.out.println(array.remove(1));
//        System.out.println("array: " + array);

//        array.set(1, "BiliBili");
//        System.out.println("array: " + array);

//        System.out.println(array.get(1));
//        System.out.println("array: " + array);

        System.out.println(array.size());
        System.out.println("array: " + array);
    }
}
