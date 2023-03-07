package com.oop.demo01;


import java.io.IOException;

public class Demo01 {
    //main 方法
    public static void main(String[] args) {

    }
    /*
    修饰符 返回值类型  方法名（...){
        //方法体
        return 返回值;
     */
    public String sayHello(){
        return "hello,world";
    }
    public void hello(){
        return;
    }
    public int max(int a, int b){
        return a>b? a:b; //三元运算符替代if
    }
    //数组下标越界异常：Arrayindexoutofbounds
    public void readFile(String file) throws IOException {
        //抛出IO异常
    }
}
