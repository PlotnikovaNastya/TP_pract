package com.company;
public class Player extends Person{

    public Player(String name)
    {
        setName(name);
        setRand_ch(min);
    }

    public byte attack_pl(Person el, int n)
    {
        if (el.loss(n))
        {
            return 0;
        }
        else
        {
            if (el.getRand_ch() > n)
            {
                return 1;
            }
            else
            {
                return 2;
            }
        }
    }
}
