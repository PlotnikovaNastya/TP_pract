package com.company;
import java.util.Scanner;
public class block3_z7 {
    public static void task7() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();
        boolean rez = kap(a);
        System.out.println("Это число Капрекара? " + rez);
    }

    public static boolean kap(int a)
    {
        String k = String.valueOf((int)Math.pow(a, 2));
        int rg;
        int lf;
        if (k.length() == 1)
            rg = 0;
        else
            rg = Integer.parseInt(k.substring(0, (int) (k.length() / 2)));
        lf = Integer.parseInt(k.substring((int) (k.length() / 2)));
        return ((rg + lf) == a);
    }
}
