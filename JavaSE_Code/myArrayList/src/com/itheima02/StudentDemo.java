package com.itheima02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

//        for(int i = 0; i < 3; i++){
//            System.out.println("输入第" + (i+1) + "个学生的姓名：" );
//            String name = sc.nextLine();
//            System.out.println("输入第" + (i+1) + "个学生的年龄：" );
//            int age = sc.nextInt();
//            Student s = new Student(name, age);
//            array.add(s);
//        }

//        Student s1 = new Student("张三", 20);
//        Student s2 = new Student("李四", 21);
//        Student s3 = new Student("王五", 22);

//        array.add(s1);
//        array.add(s2);
//        array.add(s3);
        addStudent(array);
        addStudent(array);
        addStudent(array);

        for(int i = 0; i < array.size(); i++){
            Student s = array.get(i);
            s.show();
        }
    }

    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入学生的姓名：" );
        String name = sc.nextLine();
        System.out.println("输入学生的年龄：" );
        int age = sc.nextInt();
        Student s = new Student(name, age);
        array.add(s);
    }
}
