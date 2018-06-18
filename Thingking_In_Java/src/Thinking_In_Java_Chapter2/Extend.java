package Thinking_In_Java_Chapter2;

class Cleanerser{
    private String s  = "Cleanser";
    public void append(String a){s += a ;}
    public void dilute(){append("dilute()");}
    public void apply(){append("apply()");}
    public void scrub(){append("scrub()");}
    public String tpString(){return s;}
    public void testMain(){
        Cleanerser x = new Cleanerser();
        x.dilute();
        x.apply();
        x.scrub();
        io io = new io();
        io.print(x.tpString());
    }
}

class Detergent extends Cleanerser {
    public void scrub(){
        append("detergent scrub");
        super.scrub();
    }

    public void foam(){
        append("foam()");
    }

    public void Detergent(){
        io io = new io();
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        io.print("test base class");
        super.testMain();
    }
}

public class Extend {
    public Extend() {
        Detergent x = new Detergent();
    }
}
