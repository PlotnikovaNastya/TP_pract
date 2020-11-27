package com.company;
import java.util.Arrays;
public class block6_z9 {
    public static void task9() {
       System.out.println(formula("16 * 10 = 160 = 14 + 120"));
    }

    public static boolean formula(String s)
    {
        s = s.replaceAll(" ", "");
        String[] parts = s.split("=");
        int sr = prov(parts[0]);
        for (int i = 1; i < parts.length; i++)
        {
            if (prov(parts[i]) != sr)
            {
                return false;
            }
        }
        return true;
    }

    public static int prov(String part)
    {
        char d = '?';
        int index = 0;
        int res = 0;
        for (int i = 0; i < part.length(); i++)
        {
            char ch = part.charAt(i);
            if (ch != '+' && ch != '-')
            {
                continue;
            }
            switch (d)
            {
                case '+':
                    res += other(part.substring(index, i));
                    break;
                case '-':
                    res -= other(part.substring(index, i));
                    break;
                default:
                    res = other(part.substring(index, i));
            }
            d = ch;
            index = i+1;
        }
        switch (d)
        {
            case '+':
                if (index != part.length()-1)
                {
                    res += other(part.substring(index, part.length()));
                }
                else
                {
                    res += Integer.parseInt(Character.toString(part.charAt(index)));
                }
                break;
            case '-':
                if (index != part.length()-1)
                {
                    res -= other(part.substring(index, part.length()));
                }
                else
                {
                    res -= Integer.parseInt(Character.toString(part.charAt(index)));
                }
                break;
            default:
                res = other(part.substring(index, part.length()));
        }
        return res;
    }

    public static int other(String part)
    {
        char d = '?';
        int res = 1;
        int index = 0;
        for (int i = 0; i < part.length(); i++)
        {
            char ch = part.charAt(i);
            if (ch != '*' && ch != '/')
            {
                continue;
            }

            switch (d)
            {
                case '*':
                    res *= Integer.parseInt(part.substring(index, i));
                    break;
                case '/':
                    res /= Integer.parseInt(part.substring(index, i));
                    break;
                default:
                    res = Integer.parseInt(part.substring(index, i));
            }
            d = ch;
            index = i+1;
        }
        switch (d)
        {
            case '*':
                if (index != part.length()-1)
                {
                    res *= Integer.parseInt(part.substring(index, part.length()));
                }
                else
                {
                    res *= Integer.parseInt(Character.toString(part.charAt(index)));
                }
                break;
            case '/':
                if (index != part.length()-1)
                {
                    res /= Integer.parseInt(part.substring(index, part.length()));
                }
                else
                {
                    res /= Integer.parseInt(Character.toString(part.charAt(index)));
                }
                break;
            default:
                res = Integer.parseInt(part.substring(index, part.length()));
        }
        return res;
    }
}
