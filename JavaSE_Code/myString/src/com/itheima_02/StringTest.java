package com.itheima_02;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String username = "YWLi";
        String pwd = "2766877";
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("请输入用户名：");
            String strUsr = sc.nextLine();
            System.out.println("请输入密码：");
            String strPwd = sc.nextLine();
            if(username.equals(strUsr) && pwd.equals(strPwd)){
                System.out.println("登录成功！");
                break;
            }else {
                if(i == 2){
                    System.out.println("登陆失败！机会已全部用完！");
                    break;
                }else{
                    System.out.println("登陆失败！你还有"+ (2-i) +"次机会，请重新输入用户名和密码！");
                }
            }
        }
    }
}
