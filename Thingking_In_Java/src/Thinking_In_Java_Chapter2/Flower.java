package Thinking_In_Java_Chapter2;

/**
 * This code is created to test multiple constructor with different arguments
 */
public class Flower {
    io io = new io();
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals){
        petalCount = petals;
        io.print("Constructor w/ int arg only, petal count = " + petalCount);
    }

    Flower(String ss){
        io.print("Constructor w/ String arg only, petal count = " + ss);
        s = ss;
    }

    Flower(String s, int petals){
        this(petals);
        this.s = s;
        io.print("String and integer args");
    }

    Flower(){
        this("fuck", 47);
        io.print("default constructor without args");
    }

    void printPetalCount(){
        io.print("petal count :" + petalCount + "s :" + s);
    }
}
