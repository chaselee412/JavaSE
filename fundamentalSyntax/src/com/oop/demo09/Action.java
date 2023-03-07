package com.oop.demo09;

public abstract class Action {
    //只写约束 别人来实现
    //Abstract只有方法的名字， 没有方法的实现
    public abstract void doSomething();
    public void so(){
        //抽象类可以有普通方法，但是必须写出方法体
    };
}
//不能new这个抽象类，只能靠子类去实现
//抽象类可以写普通方法
//抽象方法必须在抽象类中
//抽象的抽象：约束
//不能new抽象类但存在构造器
//存在的意义 提高开发效率