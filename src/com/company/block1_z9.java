package com.company;
import java.util.Scanner;
public class block1_z9 {
    public static void task9() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int n = in.nextInt();
        int [] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++)
            array[i] = in.nextInt();
        int rez=cube(array);
        System.out.println("Сумма кубов элементов массива равна "+rez);
    }

    public static int cube (int a[])
    {
        int sum=0;
        for (int i=0; i<a.length; i++)
            sum+= Math.pow(a[i],3);
        return sum;
    }
}

