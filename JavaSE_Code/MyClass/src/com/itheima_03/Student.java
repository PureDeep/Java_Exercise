package com.itheima_03;

public class Student {
    String names;
    private int age;

    public void setAge(int a){
        this.age = a;
    }

    public int getAge(){
        return this.age;
    }

    public void show(){
        System.out.println(names + ": " + age);
    }
}
