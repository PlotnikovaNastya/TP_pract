package com.company;
import java.util.Scanner;
public class block4_z2 {
    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        String rez=sp(str);
        System.out.println("Результат: " + rez);
    }

    public static String sp(String str)
    {
        int c1 = 0;
        int c2 = 0;
        String new_s = "";
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
                continue;
            if (str.charAt(i) == '(')
            {
                c1 += 1;
                new_s += "(";
            }
            else if (str.charAt(i) == ')')
            {
                c2 += 1;
                new_s += ")";
            }
            if (c1 == c2)
            {
                if (i == str.length()-1)
                    break;
                new_s += ", ";
                c1 = 0;
                c2 = 0;
            }
        }
        return new_s;
    }
}
