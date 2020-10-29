package com.company;
import java.util.Scanner;
public class block1_z5 {
    public static void task5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N:");
        int N = in.nextInt();
        System.out.println("Введите a:");
        int a = in.nextInt();
        System.out.println("Введите b:");
        int b = in.nextInt();
        System.out.println("Числа a и b ");
        System.out.println(act(N, a, b));
    }

    public static String act(int N, int a, int b)
    {
        if ((N - a) == b)
            return ("необходимо сложить");
        else if (N + b == a)
            return ("необходимо вычесть");
        else if (N / a == b)
            return ("необходимо умножить");
        else if (N * b == a)
            return ("необходимо разделить");
        else
            return ("не могут получить число N");
    }
}