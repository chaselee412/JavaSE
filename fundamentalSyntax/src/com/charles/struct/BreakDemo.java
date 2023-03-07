package com.charles.struct;

public class BreakDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i<100){
            i++;
            System.out.println(i);
            if (i==30){
                break;
            }
        }
        System.out.println("123");//break只会跳出while循环，但仍然会执行while体后面的语句
    }
}
