package com.oop.demo10;

//接口所有定义的方法都是抽象的 public abstract
//类实现implement接口
//实现接口的类就必须重写接口的方法  接口就是一种约束但是没有具体实现
public class UserServiceImpl implements UserService,TimeService{
    @Override
    public void run(String name) {

    }

    @Override
    public void add(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }

    @Override
    public void timer() {

    }
}
//接口是约束
//定义一些方法，让不同人实现
//public static final
//public abstract
//接口不能被实例化，接口中没有构造方法
//可以实现多个接口implements，
//必须要重写接口中的方法
