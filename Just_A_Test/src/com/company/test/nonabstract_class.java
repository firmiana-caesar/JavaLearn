package com.company.test;

public class nonabstract_class extends abstract_class {
    @Override
    public void call() {
        System.out.println("i can call when i fuck my girlfriend");
    }

    @Override
    public void stop() {
        System.out.println("i can not stop when i fuck my girlfriend high");
    }

    public static void main(String[] args)
    {
        nonabstract_class non = new nonabstract_class();
        non.call();
        non.stop();
    }
}
