package com.exception.demo1;
/*
public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b= 0;
        //捕获多个异常，从小到大捕获

        try {//监控区域
            System.out.println(a/b); //new Test().a();//System.out.println(a/b);
        }catch (Error e){  //ArithmeticException e
            System.out.println("Error");
        }catch(Exception e){
            System.out.println("Exception");
        }catch (Throwable t){
            System.out.println("Throwable");
        }finally { //不管有无异常都会执行finally  //善后工作
            System.out.println("finally");
        }
        //finally 假设IO，资源，关闭Scanner
    }
    public void a(){
        b();
    }
    public void b(){
        a();
    }
}*/
public class Test {
    public static void main(String[] args) {

        try {
            new Test().test(1,0);//不用try catch 出现ArithmeticException程序立即终止 用try catch捕获后程序会依旧正常往下执行
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }

    }
    //假设这个方法中处理不了这个异常，方法上抛出异常
    public void test(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException(); //主动抛出异常 一般在方法中使用
        }

    }
}
/*
try {//监控区域
        int a = 1;
        int b = 0;
        //捕获多个异常，从小到大捕获
        if(b==0){
        throw new ArithmeticException(); //主动抛出异常
        }
        System.out.println(a/b);
        } catch (Error e) {
        System.out.println("Error");
        } catch (Exception e) {
        System.out.println("Exception");
        } catch (Throwable t) {
        System.out.println("Throwable");
        } finally { //不管有无异常都会执行finally  //善后工作
        System.out.println("finally");
        }*/