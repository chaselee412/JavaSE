package com.oop.demo01;
//学生类
public class Student {
    public static void say(){ //静态方法
        System.out.println("student gossip");
    }

    public void say1(){    //非静态方法需要实例化
        System.out.println("student gossip1");
    }

}
