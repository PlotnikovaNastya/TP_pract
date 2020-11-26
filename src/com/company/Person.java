package com.company;
import java.util.Random;
public class Person {
    public static int min = 1;
    public static int max = 5;
    public static int live = 10;
    public Random rand;
    private int full_live = 30;
    private String vr_name;
    private int rand_ch=min;

    public Person( )
    {
        rand = new Random();
    }

    public void setName(String name)
    {
        vr_name = name;
    }

    public String getName()
    {
        return vr_name;
    }

    public int getLive()
    {
        return full_live;
    }

    public void setRand_ch(int rn)
    {
        rand_ch = rn;
    }

    public int getRand_ch()
    {
        return rand_ch;
    }


    public void dec_live()
    {
        full_live -= live;
    }

    public boolean loss(int ch)
    {
        if (ch == rand_ch)
        {
            dec_live();
            return true;
        }
        else
        {
            return false;
        }
    }
}
