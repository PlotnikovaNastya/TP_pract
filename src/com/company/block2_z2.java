package com.company;
import java.util.Scanner;
public class block2_z2 {
    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int n = in.nextInt();
        int [] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++)
            array[i] = in.nextInt();
        int rez=razn(array);
        System.out.println("Разница между максимальным и минимальным равна: "+rez);
    }

    public static int razn (int[] a)
    {
        int raz;
        int min=Integer.MAX_VALUE;
        int max=0;
        for (int i=0; i<a.length;i++) {
            if (a[i] > max)
                max=a[i];
            if (a[i] < min)
                min=a[i];
        }
        raz=max-min;
        return raz;
    }
}
