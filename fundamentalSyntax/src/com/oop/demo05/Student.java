package com.oop.demo05;

public class Student {
        //属性 私有
        private String name;
        //student ID
        private int ID;
        //gender
        private char gender;
        //study()
        //sleep()
        private int age;
        //提供一些一些操作这些属性的方法
    //提供一些public 的get。set方法
    //get this data
    public String getName(){
        return this.name;
    }
    //set value for this data
    public void setName(String name){
        this.name = name;
    }
    //cmd+N automatic generate getName and setName 封装private后student类的变量不会被轻易调用

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 120 || age <= 0) {
            this.age = 0;
        }else {
            this.age = age;
        }
    }
}
