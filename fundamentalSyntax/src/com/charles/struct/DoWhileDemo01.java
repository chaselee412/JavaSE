package com.charles.struct;

public class DoWhileDemo01 {
    public static void main(String[] args) {
        int i =0;
        int sum = 0;
        do {
            sum =sum + i;
            i++;            //在执行while判断前已经至少执行一遍语句，先执行后判断
        }while (i<=100);
        System.out.println(sum);
    }
}
