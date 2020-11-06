package com.company;
import java.util.Scanner;
public class block4_z8 {
    public static void task8() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String s_1=in.nextLine();
        System.out.println("Введите вторую строку:");
        String s_2=in.nextLine();
        System.out.println("Строки рифмуются? " +rifm(s_1, s_2));
    }

    public static boolean rifm(String s1, String s2)
    {
        s1 = s1.substring(s1.lastIndexOf(" ")).toLowerCase();
        s2 = s2.substring(s2.lastIndexOf(" ")).toLowerCase();

        for (int i = 0; i < s1.length(); i++)
        {
            if (String.valueOf(s1.charAt(i)).matches("[eyuioa]"))
                if (!s2.contains(String.valueOf(s1.charAt(i))))
                    return false;
        }
        return true;
    }
}
