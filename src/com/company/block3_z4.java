package com.company;
import java.util.Scanner;
public class block3_z4 {
    public static void task4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        String rez = one_last(str);
        System.out.println("Новая строка " + rez);
    }

    public static String one_last(String a)
    {
        if (a.length()<2)
            return "Несовместимо";
        if (a.charAt(0)==a.charAt(a.length()-1))
            return "Два - это пара";
        String new_m=a.substring(1,a.length()-1);
        return a.charAt(a.length()-1)+new_m+a.charAt(0);
    }
}
