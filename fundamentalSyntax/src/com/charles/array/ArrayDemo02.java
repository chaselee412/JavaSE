package com.charles.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //static initiate setting
        int[] a = {1,2,3,4,5,6,7,8};  //basic type
        Man[] mans = {new Man(),new Man()}; //reference type // argument input,按照数组的位置，分别可给方法man1，man2设置实参
        System.out.println(a[0]);
        //dynamic initiate setting 后期赋值 包含默认初始化
        int[] b =new int[10];
        b[0] = 10;
        System.out.println(b[0]);
        //数组下标越界 ArrayIndexOutofBounds

    }
}
