package com.company;
import java.util.Scanner;
public class block4_z1 {
    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый параметр:");
        int a = in.nextInt();
        System.out.println("Введите второй параметр:");
        int b = in.nextInt();
        int rez_div = division(a, b);
        System.out.println("Остаток от деления равен " + rez_div);
    }

    public static int division(int a, int b)
    {
        return a % b;
    }
}