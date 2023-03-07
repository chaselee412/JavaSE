package com.oop.demo03;
public class Application {
    public static void main(String[] args) {
        Person person = new Person("charles",23); //new调用构造方法
        //public class Person里面有一个空的方法public Person(){},什么都不写都会有一个默认值
        System.out.println(person.name);
    }
}


//对世界更好建模
//类组织代码，对象封装数据