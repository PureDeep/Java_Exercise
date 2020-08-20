package com.itheima_05;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("猪");
        s1.setAge(20);
        s1.show();

        Student s2 = new Student("狗",20);
        s2.show();
    }
}
