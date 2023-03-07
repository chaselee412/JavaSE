package com.charles.struct;

import java.util.Scanner;
//一旦其中一个else if检测为true, 接下来的else if一直到else语句都跳过执行
public class IfDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input score:");
        int score = scanner.nextInt();
        if (score == 100){
            System.out.println("Full score");
        }else if(score<100&&score>=90){
            System.out.println("Grade A");
        }else if(score<90&&score>=80){
                System.out.println("Grade B");
        }else if(score<80&&score>=70) {
            System.out.println("Grade B");
        }else if(score<70&&score>=60){
            System.out.println("Grade C");
        }else if(score<60) {
            System.out.println("Grade D");
        }else {
            System.out.println("invalid score");
        }
        scanner.close();
    }
}
