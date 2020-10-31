package com.company;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class block3_z6 {
    public static void task6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность первого массива:");
        int n = in.nextInt();
        int[] array_one = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++)
            array_one[i] = in.nextInt();
        System.out.println("Введите размерность второго массива:");
        int m = in.nextInt();
        int[] array_two = new int[m];
        System.out.println("Введите элементы массива:");
        for (int j = 0; j < m; j++)
            array_two[j] = in.nextInt();
        boolean rez=kol_el(array_one,array_two);
        System.out.println("Количество уникальных элементов совпадает?" + rez);
    }

    public static boolean kol_el(int[] a, int[] b)
    {
        Set<Integer> m_one = new HashSet<>();
        for (int x : a) {
            m_one.add(x);
        }
        Set<Integer> m_two = new HashSet<>();
        for (int y : b) {
            m_two.add(y);
        }
        return m_one.size()==m_two.size();
    }

}
