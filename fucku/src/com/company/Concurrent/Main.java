package com.company.Concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ReentrantLock lock = new ReentrantLock(true);

        lock.lock();

        synchronized (Main.class) {
            // blabla
        }
    }
}
