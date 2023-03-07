package com.charles.method;

public class Demo01 {
    public static void main(String[] args) {//public static 修饰符 void不返回值，执行完就结束// main方法在底层尽量要简洁
        int sum = add (1,2);
        System.out.println(sum); //System 类 out 对象 printline 方法
        test();
    }
    public static int add(int a, int b){//加上static就变成了类变量， 类里面都能用，如果调用方法返回一堆结果，就用返回void
        return a+b;
    }
    public static void test() {
        for (int i=0;i <= 1000;i++){
            if (i%5==0){
                System.out.print(i+"\t");//\t 转义字符
            }
            if (i%(5*3)==0){
                System.out.println();   //println输出完会换行
                //System.out.print("\n");
            }
        }
    }
}
