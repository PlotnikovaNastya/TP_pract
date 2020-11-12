package com.company;
import java.util.Scanner;
public class block5_z9 {
    public static void task9() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        System.out.println("'Игра пресолов' - " + gameth(str));
    }

    public static String gameth(String s)
    {
        String[] new_s = s.split(" ");
        String rez = "";
        for (int i = 0; i < new_s.length; i++)
        {
            if (i>0)
                rez += " ";
            String[] def = new_s[i].split("-");
            for (int j = 0; j < def.length; j++)
            {
                if(j>0)
                    rez += "-";
                if (def[j].equalsIgnoreCase("and")
                        || def[j].equalsIgnoreCase("the")
                        || def[j].equalsIgnoreCase("of")
                        || def[j].equalsIgnoreCase("in"))
                {
                    rez += def[j].toLowerCase();
                }
                else
                {
                    rez += def[j].substring(0,1).toUpperCase();
                    rez += def[j].substring(1).toLowerCase();
                }
            }
        }
        return rez;
    }
}
