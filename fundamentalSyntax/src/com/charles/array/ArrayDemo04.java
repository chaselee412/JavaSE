package com.charles.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arrays =  {1,2,3,4,5};
        for (int array : arrays) { //foreach 用法 arrays.for (元素：数组）适合打印输出取不到下标
            System.out.println(array);
        }
        printArray(arrays);
        System.out.println("=============================");
        int[] reverse = reverse(arrays);
        printArray(reverse); //直接print数组会打印对象的乱码值无法显示数组，可以用printarray方法或者foreach方法显示数组
    }
    public static int[] reverse(int[] arrays){
        int result[] = new int[arrays.length];
        for (int i = 0,j= arrays.length-1; i < arrays.length ; i++,j--) {
            result[j]= arrays[i];
        }
        return result;
    }
    public static void printArray(int[] arrays) { //arrays是形参不可变名
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]+"");
        }
    }
}
