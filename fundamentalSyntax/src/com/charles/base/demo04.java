package com.charles.base;

public class demo04 {
    public static void main(String[] args) {
        int i = 128;
        double b= i;
        //强制转换
        //自动转换
        System.out.println(i);
        System.out.println(b);
        /*
        注意点
        1. 不能对布尔值进行转换
        2. 不能把对象类型转换成不相关类型
        3. 再把高容量转低容量，强制转换
        4. 强制转换会有内存溢出，或精度问题
         */
        System.out.println("================");
        System.out.println((int)23.7);//double损失精度
        System.out.println((int)-45.89f);//float损失精度
        System.out.println("==============");
        char c= 'a';
        int d = c+1; //转换成unicode数字
        System.out.println(d);
        System.out.println((char)d);//由unicode数字转为字符
    }
}
