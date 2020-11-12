package com.company;
import java.util.Scanner;
public class block5_z2 {
    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фигуру:");
        String f = in.nextLine();
        System.out.println("Введите положение:");
        String pol =  in.nextLine();
        System.out.println("Введите целевую позицию:");
        String cel =  in.nextLine();
        System.out.println("Фигура может двигаться к цели? " + dviz(f, pol, cel));
    }

    public static boolean dviz (String f, String p, String c)
    {
        char pB = p.charAt(0);
        int pN = Integer.parseInt(String.valueOf(p.charAt(1)));
        char aB = c.charAt(0);
        int aN = Integer.parseInt(String.valueOf(c.charAt(1)));
        if (pB == aB && pN == aN)
            return false;
        switch (f){
            case "Пешка":
            {
                if (pB==aB && pN==2 && aN==4) return true;
                if (pB==aB && pN==(aN-1)) return true;
                return false;
            }
            case "Конь":
            {
                if ((Math.abs(pB-aB)==2 && Math.abs(pN-aN)==1)||(Math.abs(pB-aB)==1 && Math.abs(pN-aN)==2)) return true;
                return false;
            }
            case "Слон":
            {
                if (Math.abs(pB-aB)==Math.abs(pN-aN))return true;
                return false;
            }
            case "Ладья":
            {
                if ((pB==aB && pN!=aN) || (pB!=aB && pN==aN)) return true;
                return false;
            }
            case "Ферзь":
            {
                if ((pB==aB && pN!=aN) || (pB!=aB && pN==aN)) return true;
                if (Math.abs(pB-aB)==Math.abs(pN-aN))return true;
                break;
            }
            case "Король":
            {
                if (Math.abs(pB-aB)<2 && Math.abs(pN-aN)<2) return true;
                return false;
            }
            default: return false;
        }
        return false;
    }
}
