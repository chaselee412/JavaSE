package com.charles.struct;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input:");
        String s = scanner.nextLine();
        // equals: judge if String were equal
        if (s.equals("Hi")){
            System.out.println(s);
        }
        System.out.println("End");

        scanner.close();
    }
}
