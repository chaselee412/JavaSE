package com.exception.demo1;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);  //cmd+option+T 快捷键生成
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
        }
    }
}
