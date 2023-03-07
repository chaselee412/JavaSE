package com.charles.method;

import java.util.Scanner;
//Need to be reviewed again
public class Counter {
    public static void main(String[] args) {
        method();
        while(true){
            Scanner scanner = new Scanner(System.in);//创建一个扫描器对象，扫描键盘输入信息
            System.out.println("继续按Y,退出按N");
            String sure = scanner.nextLine();
            if(sure.equals("Y")){  //比较输入的字符是否与Y相等，相等则执行此if语句
                System.out.println("欢迎继续使用计算器:");
                method();
            }else if(sure.equals("N")){  //比较输入的字符是否与N相等，相等则执行此if语句
                System.out.println("退出计算器，欢迎再次使用！");
                scanner.close();
                System.exit(0);
            }else {  //输入的字符不是Y或N，则执行此输出语句
                System.out.println("输入错误，请重新输入!!!");
            }
        }
    }
    public static void method(){
        Scanner scanner = new Scanner(System.in);//创建一个扫描器对象，扫描键盘输入信息
        System.out.print("请输入第一个运算数字：");
        double num1 = scanner.nextDouble();//把第一个输入的值赋给变量num1
        System.out.print("请输入需要使用的运算符(当前可用运算符有：+ - * /): ");
        String symbol = scanner.next();//把输入的运算符赋给变量symbol
        System.out.print("请输入第二个运算数字：");
        double num2 = scanner.nextDouble();//把第二个输入的值赋给变量num2
        final String s = "+";//不变的字符设置为final比较好

        switch(symbol){
            case s://当赋给symbol的值为“+”时
                System.out.print("运算结果为："+num1+symbol+num2+"=");
                add(num1,num2);//执行加法——add方法
                break;
            case "-"://当赋给symbol的值为“-”时
                System.out.print("运算结果为："+num1+symbol+num2+"=");
                sub(num1,num2);//执行减法——sub方法
                break;
            case "*"://当赋给symbol的值为“*”时
                System.out.print("运算结果为："+num1+symbol+num2+"=");
                mul(num1,num2);//执行乘法——mul方法
                break;
            case "/"://当赋给symbol的值为“/”时
                System.out.print("运算结果为："+num1+symbol+num2+"=");
                div(num1,num2);//执行除法——div方法
                break;
            default://当输入的值不是+、-、*、/其中一个时执行下列输出语句
                System.out.println("输入错误");
        }
    }
    //加法
    public static void add(double a,double b){
        System.out.println(a+b);
    }

    //减法
    public static void sub(double a,double b){
        System.out.println(a-b);
    }

    //乘法
    public static void mul(double a,double b){
        System.out.println(a*b);
    }

    //除法
    public static void div(double a,double b){
        System.out.println(a/b);
    }

}
