package com.charles.struct;

public class TestDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++ ){//循环体1
            for (int j = 5; j >= i; j--){ //循环体2  //j和i大于小于比较，初始值设定和迭代+/- 可以决定每行递增或者递减
                System.out.print(" ");//换成a可查看相对位置
            }

            for (int j = 1; j <= i; j++){ //循环3
                System.out.print("b");
            }
            for (int j = 1; j < i; j++ ){  //循环4   //没有取等于，少打印一行相当于整体print向一下平移一行
                System.out.print("b");
            }
            //print是依次打印，按顺序在循环2，3，4完成后回到大循环体1继续判断

            System.out.println();
        }
    }
}
