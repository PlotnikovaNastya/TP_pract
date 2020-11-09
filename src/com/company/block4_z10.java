package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class block4_z10 {
    public static void task10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s_1=in.nextLine();
        System.out.println("Введите конец книги (один символ):");
        Character s_2=in.next().charAt(0);
       System.out.println("Количестов уникальных символов между концами книг равно  " +unic(s_1, s_2));
    }

    public static int unic(String s1, Character  s2)
    {
        Map<Character, Boolean> rez = new HashMap<Character, Boolean>();//стурктура хранения в виде пар ключ/значение
        boolean value = false;
        for (char c: s1.toCharArray())
        {
            if (value && c != s2)
                rez.put(c, true);
            if (c == s2)
            {
                if (value)
                    value = false;
                else value = true;
            }
        }
        return rez.size();
    }
}
