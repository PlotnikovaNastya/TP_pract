package com.company;
import java.util.Scanner;
public class block2_z9 {
    public static void task9() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую фразу:");
        String fr = in.nextLine();
        System.out.println("Введите вторую фразу:");
        String sc = in.nextLine();
        boolean ot;
        if (sc.charAt(0)=='-')
            ot=suffix(fr,sc);
        else
            ot=prefix(fr,sc);
        System.out.println("Вторая фраза является префиксом/суффиксом? "+ot);
    }

    public static boolean prefix(String a, String b) {
        boolean rez = false;
        String st = b.substring(0, b.length() - 2);
        for (int i = 0; i < st.length(); i++)
            if (st.charAt(i) == a.charAt(i)) {
                return true;
            }
        return rez;
    }

    public static boolean suffix(String a, String b) {
        boolean rez = true;
        String st = b.substring(1,b.length());
        int j = st.length() - 1;
        for (int i = a.length() - 1; i > st.length(); i--) {
            if (j < 0)
                return rez;
            if (st.charAt(j) != a.charAt(i)) {
                return false;
            }
            j--;
        }
        return rez;
    }
}
