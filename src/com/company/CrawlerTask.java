package com.company;
import java.io.*;
import java.net.*;
import java.util.regex.*;
public class CrawlerTask extends Thread {
    public Crawler Craw;
    private boolean status =true;
    public int depth;
    public CrawlerTask(Crawler c_craw){
        Craw=c_craw;
    }

    public void scanURL(String url,int c_depth) throws IOException {
        status=false;
        Craw.i++;
        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader buf = new BufferedReader(new InputStreamReader(
                    yc.getInputStream()));
            String inputLine="";
            while ((inputLine = buf.readLine()) != null){
                Pattern pattern = Pattern.compile("<a href=\"(.*?)\"");
                Matcher matcher = pattern.matcher(inputLine);
                if (matcher.find() )
                {
                    if(matcher.group(1).contains("http")&&!Craw.pool.check(matcher.group(1)) &&!Craw.old_new_list.check(matcher.group(1))){
                        add(matcher.group(1),Craw.depth);
                    }

                }
            }
            buf.close();
            status=true;
            return;
        }
        catch (Exception e){
            status=true;
            return;
        }

    }
    public void add(String url_c, int depth_c){
        Craw.pool.add( url_c ,depth_c);
        Craw.old_new_list.add( url_c, depth_c);
        return ;
    }
    public void run()  {
        while(!Thread.interrupted())
        {
            if(status&&Craw.i<Craw.new_list.adr.size()) {
                try {
                    scanURL(Craw.new_list.adr.get(Craw.i).url, Craw.depth);
                    if (Craw.depth != Craw.g_depth) {
                        if (Craw.i >= Craw.new_list.adr.size() && depth != 1) {
                            Craw.new_list = Craw.old_new_list;
                            Craw.old_new_list = new URLPool();
                            Craw.depth++;
                            Craw.i = 0;
                        }
                    } else if( !Craw.status) {
                        System.out.println("Вывод");
                        Craw.status=true;
                        Craw.pool.print();
                        System.out.println("Работа сканера завершена.");
                        return;
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
