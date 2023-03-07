package com.exception.demo02;

public class MyException extends Exception{//双击shift健查找超好用
    //传递数字大于10
    private int detail;

    public MyException(int a) {
        this.detail = a;
    }
    //toString方法 异常打印信息

    @Override
    public String toString() {
        return "MyException{" + "detail=" + detail + '}';
    }
}
