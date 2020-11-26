package com.company;
import java.util.Vector;
public class block6_z6 {
    public static void task6() {
        System.out.println(posl(206));
    }

    public static int posl(int n)
    {
        Vector<Integer> seq = new Vector<Integer>();
        seq.add(1);
        seq.add(2);
        for (int i = 3; i < 2000; i++)
        {
            int c = 0;
            for (int j = 0; j < seq.size()-1; j++)
            {
                for (int k = j + 1; k < seq.size(); k++)
                {
                    if (seq.get(j) + seq.get(k) == i)
                        c++;
                    if (c > 1) break;
                }
                if (c > 1) break;
            }
            if (c == 1) seq.add(i);
        }
        return seq.get(n-1);
    }
}
