package com.charles.method;

public class Demo02 {
    public static void main(String[] args) {
        double max = max(10,10); //返回值（等式左侧）是double就优先double，返回值是int就优先int return数据类型和参数类型都会在重载方法中优先匹配，简单的数据类型不能向上兼容
        System.out.println(max); //参数类表必须不同
    }

    public static double max(double num1,double num2){
        double result = 0;         //
        if(num1==num2){
            System.out.println("num1=num2");
            return 0;       //
        }
        if (num1>num2){
            result = num1;
        }else {
            result = num2;
        }
        return result;
    }

    public static int max(int num1,int num2){
        int result = 0;         //return需要一个值来传递， 在if条件中赋给result值，然后return出去
        if(num1==num2){
            System.out.println("num1=num2");
            return 0;       //终止方法
        }
        if (num1>num2){
            result = num1;
        }else {
            result = num2;
        }
        return result;
    }
    //java都是值传递
}
