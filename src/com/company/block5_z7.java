package com.company;
import java.util.Scanner;
public class block5_z7 {
    public static void task7() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 0 до 999:");
        int n = in.nextInt();
        System.out.println("Строковое представление:\n" + name(n));
    }

    public static String name(int n)
    {
        if(!(n >= 0 && n <= 999))
            return "Число не подходит!";
        String s = "";
        String[] e_one = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] e_tn = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
        String[] e_tw= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[] e_th = {"","one hundred","two hundred","three hundred","four hundred","five hundred",
                "six hundreds","seven hundred","eight hundred","nine hundred"};
        String[] r_one = {"ноль","один","два","три","четыре","пять","шесть","семь","восемь","девять"};
        String[] r_tn = {"десять","одинадцать","двенадцать","тринадцать","четырнадцать","пятнадцать","шестнадцать","семнадцать","восемнадцать","девятнадцать","двадцать"};
        String[] r_tw = {"","","двадцать","тридцать","сорок","пятьдесят","шестьдесят","семьдясят","восемьдесят","девяносто"};
        String[] r_th = {"","сто","двести","тристо","четыресто","пятьсот",
                "шестьсот","семьсот","восемьсот","девятьсот"};
        String c = Integer.toString(n);
        if (n < 10)
            return  e_one[n]+"\n "+r_one[n];
        else if(n>= 10 && n <= 20)
            return e_tn[n-10]+"\n"+r_tn[n-10];
        else if(n>20 && n<100)
        {
            int fr = Character.getNumericValue(c.charAt(0));
            int sc = Character.getNumericValue(c.charAt(1));
            s += e_tw[fr] + "\n" + e_one[sc] + r_tw[fr] + " " + r_one[sc];
        }
        else if(n % 100 == 0)
        {
            int fr = Character.getNumericValue(c.charAt(0));
            s += e_th[n]+"\n"+r_th[fr];
        }
        else
        {
            int fr = Character.getNumericValue(c.charAt(0));
            int sc = Character.getNumericValue(c.charAt(1));
            int th = Character.getNumericValue(c.charAt(2));
            s += e_th[fr] + " " + e_tw[sc] + " " + e_one[th]+ "\n" + r_th[fr] + " " + r_tw[sc] + " " + r_one[th];
        }
        return s;
    }
}
