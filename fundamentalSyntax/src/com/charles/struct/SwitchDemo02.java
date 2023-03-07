package com.charles.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        //字符和字符串的本质都是数字
        //反编译  java-----class（字节码文件）----反编译IDEA
        String name = "财宇";
        switch (name){
            case "Charles":
                System.out.println("Charles");
                break;
            case "财宇":
                System.out.println("Caiyu");
                break;
            default:
                System.out.println("what's up");
        }
        System.out.println("still run after break in switch structure"); //break只会跳出switch内部下面的语句，但仍然会执行switch体后面的语句
    }
}
