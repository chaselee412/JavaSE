package com.oop.demo11;

import com.oop.demo10.UserService;

public class Test {
    public static void main(String[] args) {
        //Apple apple = new Apple();
        new Apple().eat();//匿名内部类，没有名字初始化类，不用将实例保存到变量中
        new UserService1(){         //匿名接口

            @Override
            public void Hello() {

            }
        };
    }
}
class Apple{
    public void eat(){
        System.out.println("1");
    }
}

interface UserService1{
    void Hello();
}