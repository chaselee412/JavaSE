package com.charles.struct;

public class SwitchDemo01 {
    public static void main(String[] args) {
        //if提高范围查找效率，switch提高单个值查找效率
        //case穿透 ,有break 可以跳过下面执行语句 （包括default语句）可以去除D,E的break做测试
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("great");
                break;
            case 'B':
                System.out.println("good");
                break;
            case 'C':
                System.out.println("pass");
                break;
            case 'D':
                System.out.println(("need more effort"));
                break;
            case 'E':
                System.out.println("fail");
                break;
            default:
                System.out.println("unknown grade");
        }
    }
}
