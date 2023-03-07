package com.charles.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建扫描器对象接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next接收：");
        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            //使用next接收
            String str =scanner.next();
            System.out.println("输入的内容为："+str);
        }

        //凡是IO流的类如果不关闭会一直占用资源，因此要随时关闭
        scanner.close();
        
    }
}
