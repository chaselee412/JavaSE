package com.charles.struct;

public class ContinueDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i<100){
            i++;
            if (i%10==0){
                System.out.println();
                continue;               //continue用于终止某次循环，跳过循环体中尚未执行的语句，接着进行下一次是否执行循环的判定
            }
            System.out.println();
        }
    }
}
