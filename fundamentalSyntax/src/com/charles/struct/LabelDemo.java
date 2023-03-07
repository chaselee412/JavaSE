package com.charles.struct;

public class LabelDemo {
    public static void main(String[] args) {
        //打印101到150之间所有质数
        //质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数
        int count = 0;
        outer: for (int i = 101; i < 150; i++) {
            for (int j = 2; j <i/2; j++) { //依次除 值为i/2以下的数，若大于i/2，结果小于i/j<2没有意义不存在质数
                if (i%j == 0);{
                    continue outer;
                }
            }

        }
    }
}
