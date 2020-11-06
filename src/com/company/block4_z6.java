package com.company;
import java.util.Scanner;
public class block4_z6 {
    public static void task6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int n = in.nextInt();
        System.out.println("Результат: " +num(n));
    }

    public static int num(int n)
    {
        int i = 0;
        int mul = n;
        while(mul > 9)
        {
            mul = 1;
            do
            {
                mul *= n % 10;
                n = n / 10;
            }
            while (n!=0);
            n = mul;
            i++;
        }
        return i;
    }
}
