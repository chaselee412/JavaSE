package com.charles.struct;

public class DoWhileDemo02 {
    public static void main(String[] args) {
        int a = 0;
        while (a<0){            //先判断后执行
            System.out.println(a);
            a++;
        }
        System.out.println("==================");
        do{                     //  先执行后判断
            System.out.println(a);
            a++;
        }while (a<0);
        System.out.println(a);
    }
}
