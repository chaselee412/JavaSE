package com.charles.operator;

public class Demo04 {
    public static void main(String[] args) {
        //++ -- 自增 自减
        int a = 3;
        int b =a++;  //执行完这行代码后，先给b赋值，再自增
        //a++ a=a+1  （后执行的隐藏语句）
        System.out.println(a);
        //a++ a=a+1  （先执行的隐藏语句）
        int c =++a;  //执行这行代码前，先自增，再给b赋值
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double pow = Math.pow(3,2);
        System.out.println(pow);
    }
}
