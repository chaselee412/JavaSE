package com.charles.struct;

public class ForDemo03 {
    public static void main(String[] args) {

        for (int i=0;i <= 1000;i++){
            if (i%5==0){
                System.out.print(i+"\t");//\t 转义字符
            }
            if (i%(5*3)==0){
                System.out.println();   //println输出完会换行
                //System.out.print("\n");
            }
        }
    }
}
