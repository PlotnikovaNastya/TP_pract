package com.company;
import java.util.Scanner;
public class block2_z3 {
    public static void task3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++)
            array[i] = in.nextInt();
        boolean rez = sr_sn(array,n);
        System.out.println("Среднее значение элементов массива целое число? " + rez);
    }

    public static boolean sr_sn(int[] a, int n) {
        int sum=0;
        for (int i=0;i<n;i++)
            sum+=a[i];
        System.out.println(sum);
        boolean res;
        if (sum%n==0)
            res=true;
        else
            res=false;
        return res;
    }
}
