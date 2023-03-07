package com.charles.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //允许键盘接收数据进入可交互状态
        System.out.println("use next method to input:");
        //判断是否有交互动作，执行接下来的语句
        if (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("output content:"+str);
        }
        scanner.close();
    }
}
