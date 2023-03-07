package com.oop.demo10;

public interface UserService {
    //interface定义关键字，接口都需要实现类
    void run(String name); //没有实现，如果要在{}里面实现具体的方法不能写在interface里面
    //接口中的所有定义默认都是public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}
