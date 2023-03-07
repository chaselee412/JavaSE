package com.charles.operator;

public class Demo02 {
    public static void main(String[] args) {
    long a = 123123123123123L;
    int b =123;
    short c = 10;
    byte d= 8;
    System.out.println(a+b+c+d); //Long四个其中一个有long，结果为long
    System.out.println(b+c+d); //Int
    System.out.println((double)c+d);//加了double把d变为最优先级

    }
}
