package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
	    System.out.println("Введите свое имя: ");
        String name_pl=in.nextLine();
        System.out.println("Введите имя врага: ");
        String name_vr=in.nextLine();
        Player pl = new Player(name_pl);
        Enemy vr = new Enemy(name_vr);
        while (pl.getLive() > 0 && vr.getLive() > 0)
        {
            System.out.println("Введите любое число от "+Person.min+" до " + Person.max + " включительно:");
            int chislo = in.nextInt();
            byte playerRes = pl.attack_pl(vr, chislo);
            switch (playerRes)
            {
                case 1:
                    System.out.println("Вы не угадали! Число, что вы пытаетесь угадать, больше.");
                    break;
                case 2:
                    System.out.println("Вы не угадали! Число, что вы пытаетесь угадать, меньше.");
                    break;
                default:
                    int vr_live = vr.getLive();
                    if (vr_live > 0)
                    {
                        System.out.println("Вы угадали число! У " + vr.getName() + " осталось " + vr_live+" жизней!");
                    }
                    else
                    {
                        System.out.println(vr.getName() + " побежден!");
                    }
            }
            if (vr.attack_vr(pl))
            {
                int pl_live = pl.getLive();
                int vr_live = vr.getLive();
                if (pl_live > 0 && vr_live > 0)
                {
                    System.out.println("Враг угадал число! У вас осталось " + pl_live+" жизней!");
                }
                else
                {
                    System.out.println(vr.getName() +" выиграл!");
                }
            }
            else
            {
                System.out.println(vr.getName() + " не угадал число.");
            }
        }
    }
}
