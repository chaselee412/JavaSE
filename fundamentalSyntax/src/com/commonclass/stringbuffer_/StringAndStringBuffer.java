package com.commonclass.stringbuffer_;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        String str = "hello Sam";
        //返回的才是StringBuffer的对象，对str本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        //使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer append = stringBuffer1.append(str);
        //看看StringBuffer-->String
        StringBuffer stringBuffer2 = new StringBuffer("tom come");
        //toString method
        String s = stringBuffer2.toString();
        System.out.println(s);
        //用构造器搞定
        String s1 = new String(stringBuffer2);
    }
}
