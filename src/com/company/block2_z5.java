package com.company;
import java.util.Scanner;
public class block2_z5 {
    public static void task5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        double n = in.nextDouble();
        int k=kol_ost(n);
        System.out.println("Количество знаков после точки равно "+k);
    }

    public static int kol_ost(double a)
    {
        int i=0;
        if (a%1==0)
            return i;
        else{
            String[] splitter = String.valueOf(a).split("\\.");//преобразование числа в строку для нахождения остатка
            i = splitter[1].length();//подсчет кол-ва чисел после запятой
        }
        return i;
    }
}

