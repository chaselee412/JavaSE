package com.oop.demo01;

public class Demo04 {
    public static void main(String[] args) {
        int a =1;
        System.out.println(a);
        int b = Demo04.change(a);
        System.out.println(a);
        System.out.println(b);
    }
    public static int change(int a){
        a=10;//只是值传递，a变量在main的值并没有改变 ,赋值给了b
        return(a);
    }
}
