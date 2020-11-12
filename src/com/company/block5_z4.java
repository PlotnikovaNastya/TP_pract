package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class block5_z4 {
    public static void task4() {
        System.out.println("Введите числа (после ввода всех чисел введите -1):");
        ArrayList<Integer> arr = getNumbers();
        System.out.println("Результат: " + sum(arr));
    }

    private static ArrayList<Integer> getNumbers() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while ( in.hasNextLine() ) {
            String v=in.nextLine();
            if (v.equals("")) break;
            arr.add(Integer.parseInt(v));
        }
        return arr;
    }

    public static int sum(ArrayList<Integer> arr)
    {
        int rez=0;
        for (int i : arr)
        {
            rez += i;
        }
        int mul = rez;
        while (mul > 9)
        {
            mul = 1;
            do
            {
                mul *= rez % 10;
                rez = rez / 10;
            }
            while (rez != 0);
            rez = mul;
        }
        return rez;
    }
}
