package com.company;
import java.util.Scanner;
public class block3_z8 {
    public static void task8() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите последовательность:");
        String dv = in.nextLine();
        String rez = posl(dv);
        System.out.println("Самая длинная последовательность '0': " + rez);
    }

    public static String posl(String a)
    {
        String max_p="";
        int count = 0;
        int m = 0;
        if (a.indexOf('0') == -1)
            return "Только 1";
        else
        {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == '0') {
                    count++;
                }
                else {
                    if (count >= m) {
                        m = count;
                        count = 0;
                    }
                }
            }
        }
        if (count > m) {
            m = count;
        }
        for (int i = 0; i < m; i++)
            max_p += '0';
        return max_p;
    }
}
