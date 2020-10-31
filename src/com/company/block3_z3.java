package com.company;
import java.util.Scanner;
public class block3_z3 {
    public static void task3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();
        boolean rez = sovr_ch(a);
        System.out.println("Число является совершенным? " + rez);
    }

    public static boolean sovr_ch(int a)
    {
        int sum = 0;
        for(int i = 1; i <= a/2; i++)
        {
            if (a%i == 0)
                sum += i;
        }
        return a == sum;
    }

}
