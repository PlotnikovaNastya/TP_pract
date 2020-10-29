package com.company;
import java.util.Scanner;
public class block2_z1 {
    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        System.out.println("Введите число повторений:");
        int n = in.nextInt();
        String res=rez(str,n);
        System.out.println("Результат: "+res);
    }

    public static String  rez (String a, int n)
    {
        //сложение символа в пустую строку n раз
        String s = "";
        int k = 0;
        for (int i = 0; i < a.length(); i++)
        {
            while (k < n)
            {
                s += a.charAt(i);
                k++;
            }
            k = 0;
        }
        return s;
    }
}