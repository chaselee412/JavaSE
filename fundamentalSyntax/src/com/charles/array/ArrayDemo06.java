package com.charles.array;


import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1,23224,231,98090,3231,4342,3242};
        System.out.println(a);   //打印对象的hash code [I@36baf30c
        System.out.println(Arrays.toString(a));  //打印数组元素Arrays.toString
        printArray(a);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));  //打印数组元素Arrays.toString
        Arrays.fill(a,2,4, 0);
        System.out.println(Arrays.toString(a));
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(i==0){
                System.out.print("[");
            }
            if(i==a.length-1){
                System.out.print(a[i]+"]");
            }else{
                System.out.print(a[i]+", ");
            }
        }
    }
}

