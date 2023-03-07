package com.oop.demo08;

public class Student {
    private static int age; //静态的变量  多线程
    private double score;//非静态的变量
    public void run(){
        go();
    }
    public static void go(){

    }
    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(Student.age);
        //System.out.println(Student.score);
        System.out.println(s1.age);
        System.out.println(s1.score);
        new Student().run(); //通过对象才能调用run类
        Student.go();
    }
    //静态变量对类只有一个，可以被类中的实例去共享
}
