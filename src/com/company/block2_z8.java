package com.company;
import java.util.Scanner;
public class block2_z8 {
    public static void task8() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое слово:");
        String fr = in.nextLine();
        System.out.println("Введите второе слово:");
        String sc = in.nextLine();
        boolean ot=para(fr,sc);
        System.out.println("Пара строк создает странную пару? "+ot);
    }

    public static boolean para(String a, String b)
    {
        boolean rez;
        if (a.charAt(0)==b.charAt(b.length()-1) && a.charAt(a.length()-1)==b.charAt(0))
            rez=true;
        else
            rez=false;
        return rez;
    }
}
