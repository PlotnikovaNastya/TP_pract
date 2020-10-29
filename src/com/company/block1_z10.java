package com.company;
import java.util.Scanner;
public class block1_z10 {
    public static void task10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();
        System.out.println("Введите третье число:");
        int c = in.nextInt();
        boolean rez=result(a,b,c);
        System.out.println("Полученное a делится на c? "+rez);
    }

    public static boolean result(int a, int b, int c)
    {
        boolean rez;
        for (int i=0; i<b;i++)
            a+=a;
        if (a/c==0)
            rez=true;
        else rez=false;
        return rez;
    }
}
