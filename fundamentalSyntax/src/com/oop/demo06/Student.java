package com.oop.demo06;

//Student is person
public class Student extends Person {
    public Student() {
        //super（）隐藏代码（默认调用）：调用父类的无参构造
        // 调用父类构造器，必须要在子类构造器的第一行
        super("caiyu"); //调用有参必须先填参数
        System.out.println("Student无参执行");
    }

    private String name = "charles";
    public void print(){
        System.out.println("student");
    }
    public void test1(){
        print();//student
        this.print();//student
        super.print();//person
    }

    public void test(String name){
        System.out.println(name); //传递的参数
        System.out.println(this.name);//当前类里面的东西
        System.out.println(super.name);//父类的东西
    }
}
