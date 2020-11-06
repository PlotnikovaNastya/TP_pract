package com.company;
import java.util.Scanner;
public class block4_z9 {
    public static void task9() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int n = (int) in.nextLong();
        System.out.println("Введите второе число:");
        int k = (int) in.nextLong();
        System.out.println("Результат: " +pov(n,k));
    }

    public static boolean pov(int ch1, int ch2) {
        boolean r = false;
        boolean step2=false;
        int c1=0;
        int c2;
        String n = String.valueOf(ch1);
        String k = String.valueOf(ch2);
        String new_st = "";
        for (int i = 0; i < n.length() - 1; i++) {
            new_st = String.valueOf(n.charAt(i));
            if (new_st.valueOf(n.charAt(i)).equals(new_st.valueOf(n.charAt(i + 1))))
                c1++;
            if ((c1 == 2) && (!step2)) {
                step2=true;
                c2 = 0;
                for (int j = 0; j < k.length()-1; j++) {
                    new_st = String.valueOf(k.charAt(j));
                    if (new_st.valueOf(k.charAt(j)).equals(new_st.valueOf(k.charAt(j+1))))
                        c2++;
                    if (c2 == 1)
                        r = true;
                }
            }
        }
        return r;
    }
}
