package com.company.test;

public class Test {
    public static void main(String[] args)
    {
        Another another = new Another();
        another.printNum();
        Main fuck_me = new Main(5);
        fuck_me.Draw(11);

        //向上转型，通过一个指向子类对象的父类引用类型，可以调用子类中父类和子类都存在的方法
        //向上转型在运行的时候会遗忘子类中不存在于父类的方法，也会覆盖父类中相同的方法——重写
        //多态的三种实现形式：重写，继承，向上转型
        Main a = new Another();
        a.printNum();
    }
}
