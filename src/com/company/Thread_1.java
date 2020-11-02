package com.company;
import java.util.*;
public class Thread_1 extends Thread {
    public int a;
    public void run() {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            public void run() {
                int min=0;
                int max=100;
                int a = min+(int)(Math.random()*max);
                System.out.println("Поток 1. Случайное целое число равно " + a);
                if (a % 2 == 0) {
                    try {
                        Thread_2 th_2 = new Thread_2(a);    //Создание потока
                        th_2.start();
                        th_2.join();//ожидание окончания предыдущего действия
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Thread_3 th_3 = new Thread_3(a);    //Создание потока
                        th_3.start();
                        th_3.join();//ожидание окончания предыдущего действия
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        };
        timer.scheduleAtFixedRate(timerTask,500,500);
    }
}
