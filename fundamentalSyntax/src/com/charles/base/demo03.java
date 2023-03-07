package com.charles.base;

public class demo03 {
    public static void main(String[] args) {
        //整数拓展 进制 二0b 十 八0 十六0x
        int i =10;
        int i2=010;
        int i3 = 0x10;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("==========================");
        //===============================================================
        // 浮点数拓展 bank business express amount
        //===============================================================
        //float 有限 离散 舍入误差 大约接近不等于
        //double
        //避免浮点数比较
        //bigdecimal 数学工具类 没有误差

        float f = 0.1f;//0.1
        double d = 1.0/10;//0.1
        System.out.println(f==d);//false
        System.out.println(f);
        System.out.println(d);
        float d1 =23121212121212121f;
        float d2 =d1 + 1;
        System.out.println(d1==d2);
        //===============================================================
        // 字符拓展
        //===============================================================
        System.out.println("==================================");
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int)c1);// forced transform
        System.out.println(c2);
        System.out.println((int)c2);
        //char orginal from num
        //unicode 97=a 65=A 2byte 0-65536
        //U0000 UFFFF
        System.out.println("==================================");
        char c3 = '\u0061';
        System.out.println(c3);
        //转义字符  \t \n
        System.out.println("Hello\tWorld");
        System.out.println("Hello\nWorld");
        System.out.println("==================================");
        //地址和值不同
        String sa =new String("hello world");
        String sb =new String("hello world");
        System.out.println(sa==sb);
        String sc ="hello world";
        String sd ="hello world";
        System.out.println(sc==sd);
        //object memory analysis
        boolean flag =true;
        if (flag){

        }
    }
}
