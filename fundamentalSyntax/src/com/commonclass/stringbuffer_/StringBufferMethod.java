package com.commonclass.stringbuffer_;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("tom");
        s.append(',');//"hello,"
        s.append("zhang");//"hello,zhang"
        s.append("zhao").append(100).append(true).append(10.5);
        System.out.println(s);
        s.delete(11,14); // [11,14)
        System.out.println(s);
        s.replace(9,11,"Zed");
        System.out.println(s);
        //查找指定字符床在第一次出现的索引，如果找不到返回-1
        int indexOf =s.indexOf("zhang");
        System.out.println( indexOf);
        s.insert(9,"zhaomin");//在索引为9的位置插入"zhaomin"，原来索引为9的内容自动后移
        System.out.println(s);
        System.out.println(s.length());
    }
}
