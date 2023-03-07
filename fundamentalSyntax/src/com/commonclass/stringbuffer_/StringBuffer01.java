package com.commonclass.stringbuffer_;

public class StringBuffer01 {
    public static void main(StringAndStringBuffer[] args) {
        //stringBuffer 的直接父类是abstractStringBuilder
        //StringBuffer 实现了Serializable，StringBuffer的对象可以串行化，保存到文件或者网络传输
        //在父类中有属性 char[] value, 不是final类型
        //该value数组存放字符串内容，因此存放在堆中 不在常量池
        //StringBuffer是一个final类，不能被继承
        StringBuffer stringBuffer = new StringBuffer();
    }
}
    //String保存的是字符串常量，里面的值不能改，每次String类的更新就是更改地址，效率低
    //private final char value
    //StringBuffer保存的是字符串常量，里面的值可以修改，每次StringBuffer更新实际上可以更新内容，不用更新地址，效率较高
    //char[] value 不是final，该value数组存放字符串内容， 引出存放在堆中
    //StringBuilder 是一个 final类，不能被继承
    //因为StringBuffer字符内容是存在char[] value， 所以在变化（增/删）(可变长度)不用每次都更换地址（即不是每次创建新对象），所以效率高于String
    //
    //
    //
