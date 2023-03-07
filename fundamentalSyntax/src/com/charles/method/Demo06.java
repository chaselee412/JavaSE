package com.charles.method;

public class Demo06 {
    public static void main(String[] args) {
        System.out.println(f(3));
    }
    public static int f(int n){
        if (n==1){
            return 1;
        }else {
            return n*f(n-1); //这个f(2)可以返回去用，不断的调用自身
        }
    }
}
