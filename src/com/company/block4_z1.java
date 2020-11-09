package com.company;
import java.util.Scanner;
public class block4_z1 {
    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество слов (от 1 до 100):");
        int n = Integer.parseInt(in.nextLine());
        System.out.println("Введите количество символов в строке (от 1 до 80):");
        int k = Integer.parseInt(in.nextLine());
        System.out.println("Введите строку:");
        String st = in.nextLine();
        System.out.println(bessi(n,k,st));
    }

    public static String bessi(int n, int k, String str)
    {
        String[] s=str.split(" ");//разделение строки по пробелам
        String new_s = "";
        str="";
        if ((n>=1 & n<=100) && (k >= 1 & k <= 80))
        {
        for(int i = 0; i < n; i++) {
                if (new_s.length() + s[i].length() > k)//trim - убирает пробелы
                {
                    str = str.trim() + "\r\n" + s[i] + " ";
                    new_s = s[i];
                }
                else {
                    str += s[i] + " ";
                    new_s += s[i];
                }
            }
        } else System.out.println("Недопустимое количество слов или символов");
        return str.trim();
    }
}