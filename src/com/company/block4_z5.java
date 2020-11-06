package com.company;
import java.util.Scanner;
public class block4_z5 {
    public static void task5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вес с указанием ед. измерения (кг или фунт):");
        String v = in.nextLine();
        System.out.println("Введите рост с указанием ед. измерения (м или дюйм):");
        String r = in.nextLine();
        System.out.println("ИМТ и его категория равны " +imt(v,r));
    }

    public static String imt(String v, String r)
    {
        String[] n_v = v.split(" ");
        String[] n_r = r.split(" ");
        double kg=Double.parseDouble(n_v[0]);
        double m=Double.parseDouble(n_r[0]);
        if ( n_v[1].equals("фунт"))
            kg= kg * 0.453592;
        if (n_r[1].equals("дюйм"))
            m= m * 0.0254;
        String res = "";
        double imt = kg / (m * m);
        imt = Math.round(imt * 10.0)/10.0;
        if (imt < 18.5)
            res += imt+" Недостаточный вес";
        if (imt >= 18.5 && imt <= 24.9)
            res += imt + " Нормальный вес";
        if (imt >= 25 )
            res += imt + " Избыточный вес";
        return res;
    }
}
