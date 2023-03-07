package com.oop.demo06;

public class B extends A{
    public B(){
        super();
        test1();
    }



    //it could only be public, if is private, the method couldn't be used for Object
    public void test(){
        System.out.println("H=>test()");
    }
    public void test1(){       //A b =new B()这个无法 调用B类独有的public方法
        System.out.println("you jump");
    }
    /*
    public static void test() {//去掉static会有重写
        System.out.println("B=>test()");
    }*/
}
