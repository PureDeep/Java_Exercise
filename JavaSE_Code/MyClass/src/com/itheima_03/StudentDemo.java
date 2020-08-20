package com.itheima_03;

public class StudentDemo {
    public static void main(String[] args) {
        Student t = new Student();
        t.names = "Lucy";
        t.setAge(20);
        System.out.println(t.getAge());
        t.show();
    }
}
