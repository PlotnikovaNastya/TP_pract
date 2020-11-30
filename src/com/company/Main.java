package com.company;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*System.out.println("Введите глубину");
        Scanner input = new Scanner(System.in);
        int g =input.nextInt();*/
        Crawler craw = new Crawler();
        //craw.scanWebSite("http://forum-1c.ru/",3);
        //craw.scanWebSite("http://firelied.ucoz.ru/",3);
        craw.scanWebSite("http://old.code.mu/sql/",3);

    }
}
