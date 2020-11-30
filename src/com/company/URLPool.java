package com.company;
import java.util.LinkedList;
public class URLPool {
    public LinkedList<URLDepthPair> adr = new LinkedList <URLDepthPair> ();

    public void print(){

        for(int i=0;i<adr.size();i++){
            System.out.println( adr.get(i).toString());
        }
    }

    public boolean check(String str){
        for(int i=0;i<adr.size();i++){
            if(adr.get(i).url.equals(str))
                return true;
        }
        return false;
    }

    public void add(String url_c, int depth_c){
        adr.add(new URLDepthPair(url_c,depth_c));
    }
}
