package Thinking_In_Java_Chapter2;

/**
 This code is created to test finalized() function
 */
public class Book {
    io io = new io();
    boolean checkOut = false;
    Book(boolean checkout){
        checkOut = checkout;
    }

    void checkIn(){
        checkOut = false;
    }

    protected void finalize(){
        if(checkOut){
            io.print("Error: check out");
                //super.finalize();
        }
    }


}
