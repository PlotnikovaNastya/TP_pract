package com.company;
import java.util.Scanner;
public class block3_z2 {
    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        int kolvo = two(str);
        System.out.println("Позиция второго вхождения zip равна " + kolvo);
    }

    public static int two(String a)
    {
        int z_two;
        int z_one = a.indexOf("zip");
        if (z_one == -1)
            return z_one;
        else
            z_two = a.indexOf("zip",z_one+1);
        return z_two;
    }

}
