package com.charles.struct;

public class IfDemo05 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("========================");
        //遍历数组元素
        for (int x:numbers){   //数组内每个元素的值都赋给x 增强for 循环
            System.out.println(x);
        }
    }
}
