package com.company;
import java.util.Scanner;
public class block4_z7 {
    public static void task7() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str=in.nextLine();
        System.out.println("Звездная стенография равна " +sten(str));
    }

    public static String sten(String s)
    {
        if (s.isEmpty())
            return "";
        int count = 1;
        char c = s.charAt(0);
        String new_s = "";
        for (int i = 1; i < s.length(); i++)
        {
            if (s.charAt(i) == c)
                count++;
            else
            {
                if (count >1 )
                    new_s += c + "*"+count;
                else
                    new_s += c;
                c = s.charAt(i);
                count = 1;
            }
        }
        if (count>1)
            new_s += c + "*" + count;
        else
            new_s += c;
        return new_s;
    }
}
