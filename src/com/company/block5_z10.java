package com.company;
import java.util.Scanner;
public class block5_z10 {
    public static void task10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        String n = in.nextLine();
        System.out.println("Многострочная прямоугольная строка\n" + gec(n));
    }

    public static String gec(String s)
    {
        int n=Integer.parseInt(s);
        String mid = "";
        String top;
        int count = 1;
        int i;
        int j;
        for (i = 1; count < n; i++)
            count += i*6;
        System.out.println(count);
        if (n!=count)
            return "Недопустимо";
        for (j = 0; j < i*2-1; j++)
            mid += "o ";
        System.out.println(mid + "\n");
        top = mid;
        for (j = 1; j < i; j++)
        {
            top = " " + top.substring(0, top.length()-2);//отсекаем последний символ в строке
            System.out.println(top + "\n");
            mid = top  + "\n" +  mid + "\n" + top;
            System.out.println(mid+ "\n");
        }
        return mid;
    }
}
