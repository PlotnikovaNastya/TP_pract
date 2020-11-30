package com.company;
public class URLDepthPair {
    public String url;
    public int depth;
    public URLDepthPair(String url_c, int depth_c) {
        url = url_c;
        depth = depth_c;
    }

    public String toString(){
        return url +" "+depth;
    }
}
