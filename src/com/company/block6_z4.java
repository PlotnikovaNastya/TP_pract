package com.company;
import java.util.HashMap;
import java.util.Map;
public class block6_z4 {
    public static void task4() {
        System.out.println(url_d("https://edabit.com?a=1&b=2&a=2","b"));
    }

    public static String url_d(String adr, String ...param)
    {
        String res = "";
        Map<String, String> map = new HashMap<>();
        String[] ur = adr.split("\\?");
        res += ur[0];
        if (ur.length!=1)
        {
            ur = ur[1].split("&");
            for (int i = 0; i<ur.length; i++)
            {
                String[] pair = ur[i].split("=");
                if (map.containsKey(pair[0]))
                {
                    map.replace(pair[0], pair[1]);
                }
                else map.put(pair[0], pair[1]);
            }
            res += "?";
        }
        for (String pam : param)
        {
            if (map.containsKey(pam)) map.remove(pam);
        }
        for (String key : map.keySet())
        {
            res += key + "=" + map.get(key) + "&";
        }
        return res.substring(0,res.length()-1);
    }
}
