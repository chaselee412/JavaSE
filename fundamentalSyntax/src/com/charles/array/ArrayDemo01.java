package com.charles.array;

import javax.xml.transform.Source;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] nums; //announce set a place in stack
        nums = new int[10]; //create an array space in heap
        int[] nums2 = new int[20]; //同时声明且创建空间
        // give value to the element of arrays
        nums [0] =1;
        nums [1] =2;
        nums [2] =3;
        nums [3] =4;
        nums [4] =5;
        nums [5] =6;
        nums [6] =7;
        nums [7] =8;
        nums [8] =9;
        nums [9] =10;
        // calculate the sum of all elements
        int sum = 0;
        // get length of arrays: arrays.length
        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i];
        }
        System.out.println("sum result of array nums is:"+sum);

    }
}
