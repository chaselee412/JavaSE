package com.charles.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;
        System.out.println("input int number:");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("int number:" + i);
        }else {
            System.out.println("input number is not int");
        }
        System.out.println("please input float");
        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
            System.out.println("int number:" + f);
        }else {
            System.out.println("input number is not float");
        }
        scanner.close();
    }
}
