package com.company;
import java.util.Scanner;
public class block5_z1 {
    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите cтроку:");
        String str = in.nextLine();
        System.out.println("Введите размер массива:");
        int n = in.nextInt();
        int [] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++)
            array[i] = in.nextInt();
        System.out.println("Закодированное/декадированное сообщение:\n "+ enc(str) +"\n" + dec(array));
    }

    public static String enc(String s)
    {
        String new_s="";
        char fr=s.charAt(0);
        new_s+=(int) fr +" ";
        for(int i = 1; i < s.length(); i++)
        {
            char next=s.charAt(i);
            new_s+=next-fr + " ";
            fr=next;
        }
        return new_s;
    }

    public static String dec(int[] a)
    {
        String new_s="";
        new_s+=(char) a[0];
        for(int i = 1; i < a.length; i++)
        {
            int n_a = new_s.charAt(i-1);
            new_s += (char) (a[i]+n_a);
        }
        return new_s;
    }
}