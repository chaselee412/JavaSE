package com.oop.demo07;

public class Student extends Person {
    @Override
    public void run() {
        //super.run();  把该项重写
        System.out.println("run faster ");
    }
    public void eat(){
        System.out.println("student is eating");
    }
}
