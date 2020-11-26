package com.company;
public class block6_z3 {
    public static void task3() {
        System.out.println("rgb(255,256,255)");
        System.out.println("Формат rgb правильный? " + rgbcolor("rgb(255,256,255)") );
    }

    public static boolean rgbcolor(String str)
    {
        String[] new_s = str.substring(str.indexOf('(')+1, str.indexOf(')')).split(",");
        if ((str.contains("rgba") && new_s.length != 4) || (str.contains(",,")) || (new_s.length!=3))
            return  false;
        for (int i = 0; i < new_s.length ; i++)
        {
            double n = Double.parseDouble(new_s[i]);
            if (i==3)
            {
                if (!(n >= 0 && n <= 1.0))
                    return false;
            }
            else if (!(n >= 0 && n <= 255))
                return false;
        }
        return true;
    }
}
