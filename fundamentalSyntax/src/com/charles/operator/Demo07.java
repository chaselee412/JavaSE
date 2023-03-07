package com.charles.operator;

public class Demo07 {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        a+=b;
        System.out.println(a);
        a-=b;
        System.out.println(a);
        //字符串链接符 + ，String
        System.out.println(""+a+b);//先连接字符串，后面也是默认的为字符串
        System.out.println(a+b+"a");//先做相加，得出值再连接字符串

    }
}
