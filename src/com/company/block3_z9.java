package com.company;
import java.util.Scanner;
public class block3_z9 {
    public static void task9() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();
        System.out.println("Следующее простое число равно ");
        if (pr_ch(a))
            System.out.println(a);
        else
        {
            while (!pr_ch(a))
            {
                a += 1;
            }
            System.out.println(a);
        }
    }

    public static boolean pr_ch(int a)
    {
        for (int i = 2; i < a; i++)
        {
            if ((a%i == 0) && (a != i))
            {
                return false;
            }
        }
        return true;
    }
}
