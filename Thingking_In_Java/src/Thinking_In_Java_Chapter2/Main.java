package Thinking_In_Java_Chapter2;

import java.util.*;

public class Main {

    public static void main(String[] args){

        //TestIO(args);
        //Double_Constructor double_constructor = new Double_Constructor();
        //Double_Constructor fuck_con = new Double_Constructor(1);
        //FlowerTest();
        //BookTest();

        //this line is test for static member
        //new staticMenber();
        //Extend x = new Extend();

    }

    static void FlowerTest(){
        Flower flower = new Flower();
        flower.printPetalCount();
    }

    static void TestIO(String[] args){
        io io = new io();
        io.print("Hello, today is:");
        io.print(new Date());
        System.getProperties().list(System.out);
        io.print(System.getProperty("user.name"));
        io.print(
                System.getProperty("java.library.path")
        );
        Test test = new Test();
        io.print(test.a);
        io.print(test.b);
        io.print(args);
    }

    static void BookTest(){
        Book book = new Book(true);
        book.checkIn();
        new Book(true);
        System.gc();
    }

}

