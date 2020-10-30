package com.company;
import java.util.Scanner;
public class block2_z10 {
    public static void task10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите шаг от 0 до 2:");
        int step = in.nextInt();
        int otvet=pole(step);
        System.out.println("Количество полей на шаге "+step+" равно "+otvet);
    }

    public static int pole(int a)
    {
        int n=0;
        if (a%2==0)
            n=a;
        if (a%2!=0)
            n=a+2;
        return n;
    }
}
