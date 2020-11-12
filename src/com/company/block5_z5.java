package com.company;
import java.util.Scanner;
public class block5_z5 {
    public static void task5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите все слова в строку:");
        String str = in.nextLine();
        System.out.println("Слово может быть завершено? " + vowel(str));
    }

    public static String vowel(String s)
    {
        String list="";
        String[] n_s=s.split(" ");
        list+=n_s[0]+" ";
        String vowel="eyuioa";
        for(int i=1;i<n_s.length;i++)
        {
            boolean v=true;
            for(char c: vowel.toCharArray())
            {
                if (n_s[0].contains(String.valueOf(c))!=n_s[i].contains(String.valueOf(c)))
                    v=false;
            }
            if (v)
                list+=n_s[i]+" ";
        }
        return list;
    }
}
