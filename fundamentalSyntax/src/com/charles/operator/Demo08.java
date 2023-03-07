package com.charles.operator;
//三元运算符
public class Demo08 {
    public static void main(String[] args) {
        //x ?y :z
        //if x== true 则结果为y，否则结果为z
        int score =80;
        String type =score <60? "fail":"pass";
        System.out.println(type);
        //优先级（）多用括号确保顺序
    }
}
