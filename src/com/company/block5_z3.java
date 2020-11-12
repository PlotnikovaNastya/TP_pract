package com.company;
import java.util.Scanner;
public class block5_z3 {
    public static void task3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String fr = in.nextLine();
        System.out.println("Введите вторую строку:");
        String sec =  in.nextLine();
        System.out.println("Слово может быть завершено? " + end(fr, sec));
    }

    public static boolean end(String f, String s)
    {
        char[] chars = f.toCharArray();
        int k=0;
        for (int i = 0; i<chars.length;i++)
        {
            if (s.indexOf(String.valueOf(chars[i]),k) != -1)
                k = s.indexOf(String.valueOf(chars[i]),k) + 1;
            else
                return false;
        }
        return true;
    }
}
