package com.company;
public class Thread_3 extends Thread{
    public int c;
    public Thread_3(int a) {
            c=a;
    }
    public void run()
    {
        System.out.println("Поток 3. Число "+c+" не целое, его куб равен " +c*c*c);
    }
}
