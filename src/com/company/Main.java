package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
public class Main {
    public static void main(String[] args) {
        String [][] res = new String[10][4];
        immig_t(res);
        System.out.println("Общее количество иммигрантов составляет "+tot_immig(res));
        System.out.println("Общий процент иммигрантов составляет "+tot_pr(res));
        mm_immig(res);
        System.out.println("Общая численность населения составляет "+tot_ch(res));
    }

    public  static void immig_t(String[][] res)
    {
        try (BufferedReader br = new BufferedReader(new
                FileReader("C://Users//aska1//Рабочий стол//lab2.txt")))
        {
            String line;
            int i = 0;
            String [] temp = new String[40];
            while ((line = br.readLine()) != null)
            {
                temp[i++] = line;
            }
            for(int j=0; j<temp.length; j++)
            {
                res[j/4][j%4] = temp[j] + " ";
                System.out.printf(res[j/4][j%4]);
                if ((j+1)%4==0) System.out.println();
            }
            System.out.println();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static int tot_immig(String[][] res)
    {
        int num = 0;
        int num_immig;
        for(int i = 0;i < res.length; i++)
        {
            num_immig = Integer.parseInt(res[i][1].trim());
            num =num+ num_immig;
        }
        return num;
    }

    public static float tot_pr(String[][] res)
    {
        float num = 0;
        float num_pr;
        for(int i = 0;i < res.length; i++)
        {
            num_pr = Float.parseFloat(res[i][2]);
            num =num+ num_pr;
        }
        return num;
    }

    public static void mm_immig(String[][] res)
    {
        float max =Float.MIN_VALUE;
        float min =Float.MAX_VALUE;
        String high="";
        String low="";
        for(int i = 0;i < res.length; i++)
        {
            if(Float.parseFloat(res[i][2]) > max){
                max=Float.parseFloat(res[i][2]);
                high=res[i][0];
            }
            if(Float.parseFloat(res[i][2]) < min){
                min=Float.parseFloat(res[i][2]);
                low=res[i][0];
            }
        }
        System.out.println("Самый высокий процент иммигрантов в "+high);
        System.out.println("Самый низкий процент иммигрантов в "+low);
        return;
    }

    public static int tot_ch(String[][] res)
    {
        int sum=0;
        float num_immig, pr_of_nat;
        for(int i = 0;i < res.length; i++) {
            num_immig=Float.parseFloat(res[i][1]);
            pr_of_nat=Float.parseFloat(res[i][3]);
            sum+=(int) (num_immig*100)/pr_of_nat;
        }
        return sum;
    }
}
