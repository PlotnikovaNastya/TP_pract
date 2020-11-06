package com.company;
import java.util.Scanner;
public class block4_z3 {
    public static void task3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        String rez;
        if (str.contains("_"))
            rez=camel(str);
        else rez=snake(str);
        System.out.println("Результат:" +rez);
    }

    public static String camel(String str)
    {
        String []s = str.split("_");
        String new_str = s[0];
        for(int i=1;i<s.length;i++)
        {
            new_str+=(s[i].substring(0,1).toUpperCase()+s[i].substring(1));
        }
        return new_str;
    }

    public static String snake(String str)
    {
        return str.replaceAll("([A-Z])", "_$0").toLowerCase();
    }
}
