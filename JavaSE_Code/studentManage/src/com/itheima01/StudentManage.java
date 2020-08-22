package com.itheima01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<Student>();

        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(s);
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudent(s);
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent(s);
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    findAllStudent(s);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //break;
                    System.exit(0);
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入学生学号：");
        String sid = sc.nextLine();
        System.out.println("输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("输入学生住址：");
        String address = sc.nextLine();

        Student s = new Student(sid, name, age, address);

        array.add(s);

        System.out.println("添加成功！");
    }

    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无数据！");
            return;
        }

        System.out.println("学号\t\t姓名\t\t年龄\t住址");

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "\t" + s.getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要删除的学生学号：");
        String sid = sc.nextLine();

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
                System.out.println("删除学生成功！");
                break;
            }
        }
    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号：");
        String sid = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(sid)) {
                System.out.println("请输入学生姓名：");
                sid = sc.nextLine();
                array.get(i).setName(sid);
                System.out.println("请输入学生年龄：");
                sid = sc.nextLine();
                array.get(i).setAge(sid);
                System.out.println("请输入学生住址：");
                sid = sc.nextLine();
                array.get(i).setAddress(sid);
                System.out.println("修改信息成功！");
            }
        }
    }
}

