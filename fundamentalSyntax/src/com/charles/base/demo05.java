package com.charles.base;

public class demo05 {
    public static void main(String[] args) {
        //操作大的数注意溢出问题
        //数字间用下划线分割
        int money =1_000_000_000;
        long longtest= 10000L;//尽量用大写L
        int years =20;
        int total =money* years;
        int total2 = money* years;//赋值之前没有强制转换成long，int数据溢出 错误例子
        long total3= money*((long)years);//先把一个数转为long
        System.out.println(total2);//数据溢出
        System.out.println(total3);
    }
}
