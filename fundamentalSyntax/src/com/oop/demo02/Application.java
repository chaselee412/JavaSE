
package com.oop.demo02;

//一个程序比如demo02 的包下只有一个启动main类
public class Application {
    public static void main(String[] args) {
        //类：抽象化，实例化
        //类实例化后会产生一个自己的对象
        //student对象是Student类的具体实例
        Student sam = new Student();
        Student jonny = new Student();
        sam.name="Sam";
        sam.age =3;
        System.out.println(sam.name);
        System.out.println(sam.age);
        jonny.name="Jonny";
        jonny.age=2;
        System.out.println(jonny.name);
        System.out.println(jonny.age);
    }
}
//对世界更好建模
//类组织代码，对象封装数据