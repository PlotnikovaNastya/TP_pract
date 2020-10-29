package com.company;
import java.util.Scanner;
public class block1_z7 {
    public static void task7() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();
        int rez=summa(a);
        System.out.println("Сумма всех чисел до " + a + ", включая это число, равна " + rez);
    }

    public static int summa(int a){
        int sum=0;
        for (int i=0; i<=a; i++){
            sum=sum+i;
        }
        return sum;
    }
}