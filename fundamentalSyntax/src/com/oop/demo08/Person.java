package com.oop.demo08;

public class Person { //如果这个类被final修饰，就无法生成子类
    {       //2。赋初始值   //和对象同时产生， 且在构造方法之前
        System.out.println("匿名代码块");
    }
    static { //只执行一次
        System.out.println("静态代码块");
    }
    public Person(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("========================");
        Person person1 = new Person();  //静态代码块只执行一次
    }
}
