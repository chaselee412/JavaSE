package com.charles.struct;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input score:");
        int score = scanner.nextInt();
        if (score>60){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        scanner.close();
    }
}
