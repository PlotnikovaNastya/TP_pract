package com.company;
public class Thread_2 extends Thread {
    public int b;
    public Thread_2(int a) {
        b=a;
    }
    public void run()
    {
        System.out.println("Поток 2. Число "+b+" целое, его квадрат равен " +b*b);
    }
}
