package com.commonclass.wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        //包装类 integer ->String
        Integer i =100;//自动装箱
        //方式1
        String str1 = i+"";// 100变成"100"，对原先的数据类型并无影响
        //方式2
        String str2 = i.toString();
        String str3 = String.valueOf(i);
        //String ->包装类
        String str4 ="12345";
        Integer i2 =Integer.parseInt(str4); //使用自动装箱
        Integer i3 = new Integer(str4); //构造器
        System.out.println("ok");
    }
}
