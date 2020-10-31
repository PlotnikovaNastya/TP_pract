package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class block3_z5 {
    public static void task5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        boolean rez = kod(str);
        System.out.println("Строка является шестандцатиричны кодом? " + rez);
    }

    public static boolean kod(String a)
    {
        String[] simv = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "A", "B", "C", "D", "E", "F","a", "b", "c", "d", "e", "f"};
        List<String> list = Arrays.asList(simv);
        if (a.length() == 7 && a.charAt(0)=='#')
        {
            for (int i = 1; i < a.length(); i++)
            {
                if (list.contains(Character.toString(a.charAt(i))))
                    continue;
                else
                    return false;
            }
            return true;
        }
        return false;
    }
}