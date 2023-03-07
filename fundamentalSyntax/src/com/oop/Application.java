package com.oop;


import com.oop.demo06.A;
import com.oop.demo06.B;
import com.oop.demo07.Person;
import com.oop.demo07.Student;
import com.oop.demo07.Teacher;
import com.oop.demo09.Action;
import com.oop.demo11.Outer;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        //通过外部类来实例化内部类
        inner.getID();
    }
}




/*
public class Application {
    public static void main(String[] args) {
        //new Action();  不能new抽象类
    }
}
*/

//强制转换
/*
public class Application {
    public static void main(String[] args) {
         //高                 //低
        Person student =new Student();
        Student student1 = (Student)student;
        student1.eat();
        Student s1 = new Student();
        Person person = s1;
        //s1的student类 到person类，低转高不用回强制转换 //子类转换成父类可能丢失自己本来的方法

    }
}
父类引用指向子类的对象
子类转换成父类，向上转型
父类转换成子类，向下转型  强制转换(丢失方法)
方便方法的调用，减少重复的代码
 */

//instance of
/*
public class Application {
    public static void main(String[] args) {
        //Object>String
        //Object>Person>Teacher
        //Object>Person>Student //和Teacher是同级不是直系从属关系，String也不是直系关系
        Object object = new Student();
        System.out.println(object instanceof Student);//T
        System.out.println(object instanceof Person);//T
        System.out.println(object instanceof Object);//T
        System.out.println(object instanceof Teacher);//F
        System.out.println(object instanceof String);//F
        System.out.println("====================================");
        Person person = new Student();
        System.out.println(person instanceof Student);//T
        System.out.println(person instanceof Person);//T
        System.out.println(person instanceof Object);//T
        System.out.println(person instanceof Teacher);//F
        //System.out.println(person instanceof String);//F 编译报错 看左边，执行报错看右边，是不是在父类子类这条线上面
        Student student = new Student();
        System.out.println(student instanceof Student);//T
        System.out.println(student instanceof Person);//T
        System.out.println(student instanceof Object);//T
        //System.out.println(student instanceof Teacher);//F
        //System.out.println(student instanceof String);//F 编译报错 看左边，执行报错T/F看右边，是不是在父类子类这条线上面
    }
}
*/





//多态
/*
public class Application {
    public static void main(String[] args) {
        //new Student(); //一个对象的实例类型是确定的
        //new Person();
        //可以指向的这个对象的引用类型不确定，可以是子类，也可以是父类
        //Student能调用的方法都是自己的或者继承父类的（比如未重写的）
        Student s1 = new Student();
        //Person 父类型，可以指向子类（父类重写的方法）， 但是不能调用子类独有的方法
        Person s2 =new Student();//父类的引用指向子类的实例类型， JAva可以通过父类去new子类
        Object s3 = new  Student(); //Object 也是父类
        s2.run();   //子类重写父类的方法，执行子类的方法
        s1.run();
        //对象能执行哪些方法看左边的引用类型，和右边的关系不大，比如s2，Person类有的方法都可以调用，Student类里只能用重写Person的方法，Student类独有的方法不可用
        //s2.eat();//把Person类强制转换成student类型，高转低的类型
        s1.eat();
    }
}

//左边决定方法右边决定用哪个构造器去初始化  //父类提供方法模板 //构造器所属类大于等于声明类型
同一方法可以根据发送对象的不同采用多种不同的行为方式
1。多态是方法的多态，属性无多态
2。父类和子类有联系 才能进行类型转换 ClassCastException
3。存在条件：继承条件 方法需要重写， 父类引用指向子类对象 Father f1 = new Son();
    static 方法，属于类，不属于实例
    final常量 无法改变
    private 方法 无法重写
 */






//override
/*
public class Application {
    public static void main(String[] args) {
        //只有static方法：//方法的调用只和左边，定义的数据类型有关
        //非静态方法：重写
        A a =new A();
        a.test();
        B b =new B();
        b.test();
        b.test1();
        //父类的引用指向了子类
        //父类的引用A指向了B
        A b1 =new B();//非静态方法，子类重写了父类的方法
        b1.test();
        ((B)b1).test1(); //只有通过强转才能使用test1



    }
}

 */


//super
/*
public class Application {
    public static void main(String[] args){
        Student student = new Student();
        //student.test("caiyu");
        //student.test1();
    }
}

1.super调用父类的构造方法，必须在构造方法的第一个
2.super必须只能出现在子类的方法或者构造方法中
3.super和this不能同时调用方法
vs this
代表对象不同：
this：本身调用者这个对象
super：代表父类对象的引用
前提：
this：无继承也可以使用
super:只能在继承条件下可以使用
构造方法：
this():本类的构造
super():父类的构造
 */


/*
public class Application {
    public static void main(String[] args) {
        Person person = new Person();
        //Student student =new  Student();
        //student.say();
        //System.out.println(student.getMoney());
    }
    //ctrl+h open hierarchy
}
*/






//getter setter
/*
1.improve the security of code and protect data
2.hide the process of code
3.unified interface
4.improve maintenance ability possibility
 */
/*
public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1.name = ""; private无法取出
        s1.setName("charles");
        System.out.println(s1.getName());
        s1.setAge(20);//illegal
        System.out.println(s1.getAge());
    }
}
*/





/*
public class Application {
    public static void main(String[] args) {

    1.类和对象
        类是一个模板：抽象，对象是一个具体实例
    2.方法
        定义，调用
    3.对应的引用
        引用类型：基本类型(8)
        对象通过引用来操作：栈--》堆
    4.属性：字段Field 成员变量
        默认初始化：
            数字：0  0.0
            char: u0000
            boolean: false
            引用：null
            修饰符 属性类型 属性名=属性值！
    5.对象的创建和使用
        必须使用new 关键字创造对象，构造器 Person charles = new Person();
        对象的属性 charles.name
        对象的方法 charles.sleep()
    6.类：
        静态的属性 属性
        动态的行为 方法


    }
}
*/

/*
public class Application {   //内存图详解
    public static void main(String[] args) {
        Pet dog = new Pet();  //调用无参构造
        dog.name = "Cara";
        dog.age = 3;
        dog.shout();
        System.out.println(dog.name);
        System.out.println(dog.age);
    }
}
*/
