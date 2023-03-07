package com.oop.demo03;

public class Person {
    int age;
    //一个类什么都不写，也会生成一个构造器
    String name;

    //实例化初始值
    //使用new关键字，本质在调用构造qi,用来初始化值
    public Person() {
    }

    //有参构造，一旦定义了有参构造，要调用无参必须显示其定义
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age){
        this.name=name;
        this.age =age;
    }
    //cmd+N 生成构造器 select none 生成无参
}
/*
public class Application {
    public static void main(String[] args) {
        Person person = new Person("charles",23); //new调用构造方法
        //public class Person里面有一个空的方法public Person(){},什么都不写都会有一个默认值
        System.out.println(person.name);
    }
}
    构造器
    1.和类名相同
    2。无返回值
    作用：
    1。new本质在到
    2。初始化对象的值
    //有参构造，一旦定义了有参构造，要调用无参必须显示其定义，不得靠默认
    this代表当前对象
 */
