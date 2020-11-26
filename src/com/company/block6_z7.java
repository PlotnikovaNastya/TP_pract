package com.company;

public class block6_z7 {
    public static void task7() {
        System.out.println(posl_no_pov("abcabcbb"));
    }

    private static boolean povtor(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            for(int j = 0; j < str.length(); j++)
            {
                if (i == j)
                    continue;
                if (str.charAt(i) == str.charAt(j))
                    return false;
            }
        }
        return true;
    }
    private static String posl_no_pov(String s)
    {
        String res;
        String res2 = "";
        for(int j = 0; j < s.length(); j++)
        {
            res = "";
            for (int i = j; i < s.length(); i++)
            {
                if (i == 0)
                    res += s.charAt(i);
                else
                {
                    while (povtor(res))
                    {
                        res += s.charAt(i);
                        if(i != s.length()-1) i++;
                        String r = res;
                        r += s.charAt(i);
                        if (!povtor(r)) break;
                    }
                    if(res.length() > res2.length())
                        res2 = res;
                    break;
                }
            }
        }
        return res2;
    }
}
