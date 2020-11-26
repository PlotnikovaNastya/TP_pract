package com.company;
public class block6_z2 {
    public static void task2() {
        System.out.println("Flag на латинском " + wor("Flag"));
        System.out.println("Do you think it is going to rain today? на латинском " + pred("Do you think it is going to rain today?"));
    }

    public static String wor(String str)
    {
        if (str.isBlank())//пустая строка (в том числе с пробелом)
            return str;
        if  (String.valueOf(str.charAt(0)).matches("[aeyuioAEYUIO]"))
            return str + "yay";
        else
        {
            while(!String.valueOf(str.charAt(0)).matches("[aeyuioAEYUIO]"))
            {
                String sd = str.substring(0, 1);
                str = str.substring(1) + sd;
            }
            return str + "ay";
        }
    }

    public static String pred(String str)
    {
        boolean flag = false;
        String res = "";
        String sym = "";
        String s=str.substring(str.length()-1);
        if  (String.valueOf(str.charAt(str.length()-1)).matches("[.!?]"))
        {
            sym = String.valueOf(str.charAt(str.length()-1));
            str = str.substring(0, str.length()-2);
        }
        String[] each = str.split(" ");
        for (String word : each)
        {
            word = wor(word);
            if (!word.equals(word))
            {
                word = word.toLowerCase();
                word = word.substring(0,1) + word.substring(1);
            }
            if (flag)
                word+=sym;
            res += word + " ";
        }
        return res+s;
    }
}
