package com.charles.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //输入多个数字，求总和与平均数，每输入一次用回车确认，输入非数字来结束输入并输出执行结果；
        Scanner scanner =new Scanner(System.in);
        double sum = 0;
        int m = 0;

        while (scanner.hasNextDouble()){      //如果是非数字跳出while循环
            double x =scanner.nextDouble();
            m = m+1;//m++
            sum =sum +x;
            System.out.println("you input "+m+"number,current sum is"+sum);
        }
        System.out.println(m+"numbers of sum"+sum);
        System.out.println(m+"numbers of mean"+(sum/m));
        scanner.close();
    }
}
