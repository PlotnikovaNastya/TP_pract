package com.company;
import java.util.Scanner;
public class block1_z2 {
    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите основание треугольника:");
        int base = in.nextInt();
        System.out.println("Введите высоту треугольника:");
        int he = in.nextInt();
        double pl = area_base(base,he);
        System.out.println("Площадь треугольника равна " + pl);
    }

    public static double area_base(int a, int b)
    {
        return a*b*0.5;
    }
}