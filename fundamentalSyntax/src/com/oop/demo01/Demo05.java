package com.oop.demo01;
//引用传递，对象本质还是值传递
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();     //这个Person类生成了一个实例对象person（一个具体的人）类是对象的模板
        //Person person1 = new Person();
        System.out.println("person name before get value"+ person.name);
        //System.out.println("Person1 name before get value"+person1.name);
        Demo05.change(person);            //实例对象person的name进行方法上的赋值，引用传递
        //Demo05.change(person1);           //在方法中更多的使用还是面向过程编程
        System.out.println("person name："+person.name);
        //System.out.println("person name"+person1.name);
    }

    public static void change(Person person) {
        //person是一个对象：指向的------》Person person = new Person(); 这是一个具体的人，可以改变属性
        person.name="charles";
    }
}
//定义一个类有属性name
class Person{
    String name; //只是一个形参， 两个人person,person1可以有不同的形参值
}