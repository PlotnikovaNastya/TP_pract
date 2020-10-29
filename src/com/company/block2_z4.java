package com.company;
import java.util.Scanner;
public class block2_z4 {
    public static void task4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++)
            array[i] = in.nextInt();
        int[] new_mas=rez_mas(array,n);
        System.out.println("Новый массив: ");
        for (int j=0;j<n;j++)
            System.out.print("["+new_mas[j]+"] ");
    }

    public static int[] rez_mas(int[] a, int n) {
        int[] new_m=new int[n];
        int j=0;
        new_m[0]=a[0];
        for (int i=1;i< n;i++) {
            new_m[i] = new_m[j] + a[i];
            j++;
        }
        return new_m;
    }
}


