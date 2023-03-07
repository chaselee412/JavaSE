package com.charles.base;

public class demo07 {
    //定义 属性：变量
    //实例变量(可赋值也可以不用)：从属于对象；如果不进行初始化，这类型默认值0 0.0
    //布尔值：默认false
    //除基本类型，其余默认值都是null；
    String name;
    int age= 20;

    //类变量
    static double salary =2500;

    static {
        //加了static作用域会变高
    }
    //main方法
    public static void main(String[] args) {
        //局部变量：必须声明和初始化值（告诉i是什么数据类型以及值 ，变量在main方法以外无效）
        int i= 10;
        System.out.println(i);
        //变量类型（在这个demo08.class里面的所有实例变量都叫demo07类型） 变量名字（demo07的从属对象name,age）
        demo07 demo07 = new demo07();//=new base01.demo07(demo07的变量名全部赋值到左侧即可用)
        System.out.println(demo07.age);
        System.out.println(demo07.name);
        System.out.println(salary);//static 不是像上一行demo07类引出的方法，所以如果去掉static变量没法传到main方法，会随着demo07的class一起出现，一起消失
    }
    //其他方法
    //public void add(i);//局部变量在main方法以外无效
}
