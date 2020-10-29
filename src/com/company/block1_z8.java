package com.company;
import java.util.Scanner;
public class block1_z8 {
    public static void task8() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую сторону треуголька:");
        int a = in.nextInt();
        System.out.println("Введите вторую сторону треуголька:");
        int b = in.nextInt();
        int c= third_st(a,b);
        System.out.println("Третья сторона треугольника равно "+c);
    }

    public static int third_st (int a, int b)
    {
        return (a+b)-1;
    }
}
