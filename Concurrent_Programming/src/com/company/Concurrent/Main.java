package com.company.Concurrent;
import java.util.*;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws Exception {
        // write your code here

        Thread[] threads = new Thread[100];
        for (int i = 0; i < threads.length; i++) {

            threads[i] =  new Thread() {
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        count++;
                    }
                }
            };
            threads[i].start();
        }
        for (Thread thread : threads){
            thread.join();
        }
        System.out.println(count);
    }
}
/*
    ++自增操作并不是线程安全的，理论上以上代码的结果应该是1000000，但是因为++这种原子操作并不会保证线程安全，
    多个线程对同一个变量进行操作，没有锁的情况下就会发生线程冲突，从而有些操作就会失效。
 */

