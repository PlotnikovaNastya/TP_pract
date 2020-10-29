package com.company;
import java.util.Scanner;
public class block1_z3 {
    public static void task3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во куриц (2 ноги): ");
        int ch = in.nextInt();
        System.out.println("Введите кол-во коров (4 ноги): ");
        int cw = in.nextInt();
        System.out.println("Введите кол-во свиней (4 ноги): ");
        int pg = in.nextInt();
        int k_legs = animals_legs(ch,cw,pg);
        System.out.println("Суммарное количество ног равно " + k_legs);
    }

    public static int animals_legs(int a, int b, int c)
    {
        return a*2 + b*4 + c*4;
    }
}
