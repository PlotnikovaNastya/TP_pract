package com.company;
import java.io.*;
import java.util.*;
public class Crawler extends Thread {
    public LinkedList<CrawlerTask> Threads= new LinkedList <CrawlerTask> ();;
    public int depth=1;
    public int g_depth=0;
    public int i = 0;
    public URLPool new_list = new URLPool();
    public URLPool old_new_list = new URLPool();
    public URLPool pool = new URLPool();
    public boolean status=false;
    public void scanWebSite(String url, int c_depth) throws IOException, InterruptedException {
        System.out.println("Сканер начал работу.");
        new_list.add(url, 1);
        g_depth=c_depth;
        Threads.add(new CrawlerTask(this));
        Threads.get(0).start();
        for(int b =1; b < c_depth; b++) {
            Threads.add(new CrawlerTask(this));
            try {
                Threads.get(b).start();
            }catch (Exception e){
                e.printStackTrace();
                return;
            }
        }
    }
}
