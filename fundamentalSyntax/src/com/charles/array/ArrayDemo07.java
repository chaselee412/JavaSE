package com.charles.array;


import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] a = {1,2,43,453,23,21,435,231};
        int[] sort =sort(a);
        System.out.println(Arrays.toString(a));

    }
    //1.比较数组中，两个相邻的元素，如果第一个比第二个大，交换位置
    //2.每轮比较都会产生一个最大或最小的数字：下次则可以少一次排序
    //3.依次循环直到结束
    public static int[] sort(int[] arrays) {
        //外层判断走多少次
        int temp = 0;
        for (int i = 0; i < arrays.length-1; i++) {
            boolean flag = false; //flag 标识为减少没有意义的比较,整个一轮j下来都没有产生比较为false,比如值比较了一轮i=1的时候就退出
            //内层循环，比较判断两个数，如果第一个数比第二个大，交换位置
            for (int j = 0; j < arrays.length-1-i;j++) {//由于每次产生一个最大的数，每一轮内层循环都会减少一个比较次数，所以要减去i
                if(arrays[j+1]<arrays[j]){
                    temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] =temp;
                    flag = true; //整个一套j下来如果没有比较就吃不到flag=true
                }
            }
            if(flag==false){    //for里层外层也能够吃到
                break;
            }
        }
        return arrays;
    }

}

