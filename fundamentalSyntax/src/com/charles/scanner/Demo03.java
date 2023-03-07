package com.charles.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input data:");
        String str = scanner.nextLine();
        System.out.println("output result:"+str);
        scanner.close();
    }
}
