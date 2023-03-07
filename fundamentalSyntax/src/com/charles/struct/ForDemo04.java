package com.charles.struct;

public class ForDemo04 {
    public static void main(String[] args) {
        //1.先打印第一列
        //2.把固定的1再用一个循环包起来 由内向外包起来，先写内层再加外层
        //3.去掉重复项，j<=i
        //4.调整样式

        for (int i =1;i<10;i++){
            for (int j=1;j<=i;j++){ //j<=i是精髓，不然会制造计算重复项
                System.out.print(i+"*"+j+"="+(i*j)+"\t");

                }
            System.out.println();
            }
        }
    }

