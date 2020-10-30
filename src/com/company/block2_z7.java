package com.company;
import java.util.Scanner;
public class block2_z7 {
    public static void task7() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите индекс:");
        String ind = in.nextLine();
        boolean ot=index(ind);
        System.out.println("Введенная строка действительно является индексом? "+ot);
    }

    public static boolean index(String ind)
    {
        char pr = 32;
        boolean rez=false;
        if (ind.length() <= 5)
        {
            for (int i = 0; i < ind.length(); i++)
            {
                if(ind.charAt(i) >= '0' && ind.charAt(i) <= '9')
                {
                    if (ind.charAt(i) != pr)
                    {
                        rez = true;
                    }
                    else
                    {
                        rez=false;
                    }
                }
                else
                {
                    rez =false;
                }
            }
        }
        return rez;
    }
}
