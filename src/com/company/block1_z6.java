package com.company;
import java.util.Scanner;
public class block1_z6 {
    public static void task6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любой символ");
        char sim = in.next().charAt(0);
        int kod=kod_ascii(sim);
        System.out.println("Код ASCII символа равен "+kod);
    }

    public static int kod_ascii (char a)
    {
        return (int) a;
    }
}
