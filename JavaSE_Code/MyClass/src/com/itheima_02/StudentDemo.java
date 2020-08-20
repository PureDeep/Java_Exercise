package com.itheima_02;

public class StudentDemo {
    public static void main(String[] args) {
        Student st = new Student();
        st.age = 25;
        st.name = "Lucy";
        System.out.println(st.age);
        System.out.println(st.name);
        st.doHomework();
        st.study();
    }
}
