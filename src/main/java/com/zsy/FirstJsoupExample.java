package com.zsy;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by xyz on 2017/10/30.
 */
public class FirstJsoupExample {
    public static void main(String args[]){
        try {
           // Document doc= Jsoup.connect("http://www.yiibai.com").get();
            Document doc= Jsoup.connect("http://zywork.top").get();
            String title=doc.title();
            System.out.println(title);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
