package com.oop.demo06;
// in java,  all class are extended from Object indirectly or directly by default
//Object线程之间通信的方法----多线程
//只有单继承，没有多继承 一个儿子没有多个爸爸
public class Person {
    public Person(String name) {
        System.out.println("person无参执行");
    }

    protected String name = "handsome";
    public void print(){  //private的东西无法被继承
        System.out.println("person");
    }
}
/*
public class Person {
    //public
    //private

    public void say(){
        System.out.println("said a word");
    }
    private int money= 1_000_000_000;//have to use getter to for student use

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    //property set private and method set public
}
*/