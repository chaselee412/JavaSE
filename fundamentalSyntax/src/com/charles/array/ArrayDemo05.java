package com.charles.array;


public class ArrayDemo05 {
    //[4][2]
    public static void main(String[] args) {
        int[][] array = {{1,2},{2,3},{3,4},{4,5}};
    /*
        1,2     array[0]
        2,3     array[1]
        3,4     array[2]
        4,5     array[3]
     */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
        System.out.println("==========================");
        printArray(array[0]);
        System.out.println("==========================");
        System.out.println(array[0][0]);
        System.out.println(array[2][0]);
        System.out.println(array[2][1]);
    }

 //打印数组元素
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]+" ");
        }
    }

}
