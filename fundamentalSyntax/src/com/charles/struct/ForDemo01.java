package com.charles.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        int a = 1;//初始化
        while(a<=100){//条件判断
            System.out.println(a);//循环体
            a+=2;//迭代
        }
        System.out.println("while loop end");
        for (int i=1;i<=100;i++){
            System.out.println(i);
        }
        //100.for  shortcut
        System.out.println("for loop end");
        /*
        初始化，声明一种类型，可初始化一个或多个循环控制变量，也可以为空语句
        检测布尔值，如果true，执行循环体。如果false，循环终止，执行循环体后的语句
        执行一次循环后，更新循环控制变量（迭代因子控制变量的增减）
        再次检测布尔值，循环执行上面的过程
         */
        /*
        for (;;i++){
        死循环
        }

         */
    }
}
