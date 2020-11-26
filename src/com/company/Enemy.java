package com.company;
public class Enemy extends Person{

    public Enemy(String name)
    {
        setName(name);
        rand_n_vr();
    }

    public boolean attack_vr(Person el)
    {
        int n = rand.nextInt(max-min+1) + min;
        System.out.println(n);
        if (el.loss(n))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void rand_n_vr()
    {
        setRand_ch(rand.nextInt(max-min+1) + min);
    }

}
