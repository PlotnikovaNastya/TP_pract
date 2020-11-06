package com.company;
import java.util.Scanner;
public class block4_z1 {
    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество слов (от 1 до 100):");
        int n = in.nextInt();
        System.out.println("Введите количество символов в строке (от 1 до 80):");
        int k = in.nextInt();
        System.out.println("Введите строку:");
        String str = in.nextLine();
        System.out.println("Результат:\n" +bes(n,k,str));
    }

    public static String bes(int n, int k, String str)
    {
        String[] s=str.split(" ");
        str="";
        String new_s = "";
        //if ((n>=1 & n<=100) && (k >= 1 & k <= 80))
        //{
        for(int i = 0; i < n; i++) {
                if ((new_s.length() + s[i].length()) < k)
                {
                    str += s[i] + " ";
                    new_s += s[i];
                }
                else {
                    str = str.trim() + "\r\n" + s[i] + " ";
                    new_s = s[i];
                }
            }
        // } else System.out.println("Недопустимое количество слов или символов");
        return str.trim();
    }
}