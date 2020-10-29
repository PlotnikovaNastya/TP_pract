package com.company;
import java.util.Scanner;
public class block1_z4 {
    public static void task4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение prob (дробное число):");
        double prob = in.nextDouble();
        System.out.println("Введите значение prize:");
        int prize = in.nextInt();
        System.out.println("Введите значение pay:");
        int pay = in.nextInt();
        System.out.println("Результат ");
        System.out.println(profitableGamble(prob,prize,pay));
    }

    public static boolean profitableGamble(double prob, int prize, int pay) {
        if ((prob * prize - pay) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
