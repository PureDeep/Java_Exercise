package com.itheima_04;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        Student s2 = new Student("林青霞");
        s2.show();
        Student s3 = new Student(30);
        s3.show();
        Student s4 = new Student("张曼玉", 29);
        s4.show();
    }
}
