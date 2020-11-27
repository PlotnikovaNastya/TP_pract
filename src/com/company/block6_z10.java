package com.company;

public class block6_z10 {
    public static void task10() {
        System.out.println(polin(23336014));
    }

    public static boolean polin(int n)
    {
        String s = Integer.toString(n);
        while (true) {
            if (s.length() < 2) {
                return false;
            }
            if (s.length() % 2 != 0 && s.length() != 2 ) {
                    return false;
            }
            if (s.length() % 2 == 0) {
                if (s.substring(0, s.length() / 2).equals(new StringBuilder(s.substring(s.length() / 2)).reverse().toString())) {
                    return true;
                } else {
                    String buff = "";
                    for (int i = 0; i < s.length(); i += 2) {
                        buff += Integer.toString(Integer.parseInt(Character.toString(s.charAt(i))) +
                                Integer.parseInt(Character.toString(s.charAt(i + 1))));
                    }
                    s = buff;
                }
            }
        }
    }
}

