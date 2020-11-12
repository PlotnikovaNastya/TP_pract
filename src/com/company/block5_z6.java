package com.company;
import java.util.Scanner;
public class block5_z6 {
    public static void task6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        String n = in.nextLine();
        System.out.println("Это действительно номер кредитной карты? " + card(n));
    }

    public static boolean card(String n)
    {
        long nn=Long.valueOf(n);
        if (n.length()>=14 && n.length()<=19) {
            System.out.println("Условие выполнилось");
            int kc = (int) (nn % 10);
            nn = nn / 10;
            int sum = 0;
            String new_n = Long.toString(nn);
            StringBuffer buffer = new StringBuffer(new_n);//необходимо для изменения строки без создания новой
            buffer.reverse();//изменение порядка строки
            for (int i = 0; i < new_n.length(); i++) {
                if (i % 2 == 0) {
                    int pos = Character.getNumericValue(new_n.charAt(i)) * 2;//символ в число
                    sum += pos / 10;//первая цифра числа
                    sum += pos % 10;//вторая цифра числа
                } else
                    sum += Character.getNumericValue(new_n.charAt(i));
            }
            int en=10-sum % 10;
            if (en == kc)
                return true;
            else return false;
        }
        else
            return false;
    }
}
