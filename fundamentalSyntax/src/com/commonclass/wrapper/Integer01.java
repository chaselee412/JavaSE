package com.commonclass.wrapper;

public class Integer01 {
    public static void main(String[] args) {
        //演示int<-->Integer 装箱和拆箱
        int n1 =100;
        Integer integer = n1;
        Integer integer1 =Integer.valueOf(n1);
        //手动拆箱
        int i = integer.intValue();
        //jdk5以后可以自动装箱和拆箱
        int n2 = 200;
        //自动装箱 int->Integer
        Integer integer2 = n2; //底层使用的是Integer.valueOf(n2)
        int n3 = integer2;  //底层仍然使用的是intValue
    }
}
