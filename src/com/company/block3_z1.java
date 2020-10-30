package com.company;
import java.util.Scanner;
public class block3_z1 {
    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый параметр:");
        int a = in.nextInt();
        System.out.println("Введите второй параметр:");
        int b = in.nextInt();
        System.out.println("Введите третий параметр:");
        int с = in.nextInt();
        int kolvo = urav(a, b, с);
        System.out.println("Количество корней уравнения равно " + kolvo);
    }

    public static int urav(int a, int b, int c)
    {
        double d = Math.pow(b,2)-4*a*c;
        int k=0;
        if (d>0)
            k=2;
        if (d==0)
            k=1;
        if (d<0)
            k=0;
        return k;
    }
}