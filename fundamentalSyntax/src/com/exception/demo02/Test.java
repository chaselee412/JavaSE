package com.exception.demo02;

public class Test {
    //可能存在异常的方法
    static void test(int a) throws MyException {
        System.out.println("传递的参数为"+a);
        if(a>10){
            throw new MyException(a);//可以在方法体内try and catch捕获，也可以向上抛出throws 在MyException里面解决
        }
        System.out.println("OK");
    }

    public static void main(String[] args) {
        try {
            test(111); //test方法抛出了一个异常，需要捕获
        } catch (MyException e) {
            System.out.println("MyException=>"+e);
            System.out.println(e.toString());
        }
    }
}
