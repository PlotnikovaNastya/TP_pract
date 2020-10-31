package com.company;
import java.util.Scanner;
public class block3_z10 {
    public static void task10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x:");
        int x = in.nextInt();
        System.out.println("Введите y:");
        int y = in.nextInt();
        System.out.println("Введите z:");
        int z = in.nextInt();
        boolean rez = tre(x,y,z);
        System.out.println("Это ребра прямоугольного треугольника? " + rez);
    }

    public static boolean tre(int a, int b, int c)
    {
        if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) || (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) || (Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(c, 2)))
            return true;
        else return false;
    }
}