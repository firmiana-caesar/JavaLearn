package Thinking_In_Java_Chapter2;

class Bowl{
    io io = new io();
    Bowl(int marker){
        io.print("Bowl :" + marker);
    }

    void f1(int marker){
        io.print("f1 :" + marker);
    }
}

class Table{
    static Bowl bowl1 = new Bowl(1);
    io io = new io();
    Table(){
        io.print("Table()");
        bowl2.f1(1);
    }

    void f2(int marker){
        io.print("f2 :" + marker);
    }

    static Bowl bowl2 = new Bowl(2);
}

class Cupboard{
    io io = new io();
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard(){
        io.print("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int marker){
        io.print("f3 :" + marker);
    }
}

public class staticMenber{
    io io = new io();
    staticMenber(){
        io.print("Creating new Cupboard in main");
        new Cupboard();
        io.print("Creating new Cupboard in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}


