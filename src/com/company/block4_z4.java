package com.company;
import java.util.Scanner;
public class block4_z4 {
    public static void task4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начало рабочего дня в десятичном формате (24 часа):");
        double n = in.nextDouble();
        System.out.println("Введите конец рабочего дня в десятичном формате (24 часа):");
        double k = in.nextDouble();
        System.out.println("Введите почасовую ставку:");
        double st = in.nextDouble();
        System.out.println("Введите множитель сверхурочных работ:");
        double mn = in.nextDouble();
        System.out.println("Заработанная сумма равна " +sum(n,k,st,mn));
    }

    public static String sum(double n, double k, double s, double m)
    {
        double sum=0;
        if ((9<=n & n<=17) && (9<=k & k<=17))
            sum+=(k-n)*s;
        if ((9<=n & n<=17) && (17<k))
            sum+=(17-n)*s+(k-17)*s*m;
        if ((n>17) && (17<k))
            sum+=(n-17)*s*m+(k-17)*s*m;
        return ("$"+String.valueOf(sum));
    }
}
