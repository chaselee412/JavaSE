package com.oop.demo11;

import java.sql.SQLOutput;
import java.util.IdentityHashMap;

public class Outer {
    private int id = 10;
    public void out(){
        System.out.println("这是外部类的方法");
    }
    public class Inner{     //若加上static 则报错，因为static 则优先加载 静态内部类不能访问外部非static属性
        public void in() {
            System.out.println("这是内部类的方法");
        }
        //获得外部类的私有属性
        public void getID(){
            System.out.println(id);
        }
    }
    public void method(){
        class Inner{
            public void in(){}

        }
    }
}

class A{
    public static void main(String[] args) {

    }
}
