package com.company;
import java.util.Scanner;
public class block2_z6 {
    public static void task6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();
        int f=ch_fib(a);
        System.out.println("Число Фибоначчи равно "+f);
    }

    public static int ch_fib(int a)
    {
        switch (a)
        {
            case 0:
                return 1;
            case 1:
                return 1;
            default:
                return ch_fib(a - 2) + ch_fib(a - 1);
        }
    }
}
