package com.oop.demo01;

public class Demo02 {
    public static void main(String[] args) {
        Student.say();
        //实例化这个对象new
        //对象类型 对象名 = 对象值
        Student student = new Student();//对象值变成了实例化对象
        student.say1();
    }

    //static是和Demo02类一起加载的
    public static void a() {
        b();
    }

    //非静态方法必须实例化new之后才存在
    public static void b() {//去除static会报错

    }
}