package com.zsy;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by xyz on 2017/10/30.
 */
public class StringParseHtml {
    public static void main(String args[]){
        String html="<html><head><title>First parse</title></head></html>" +
                "<body><p> parse a html into doc.</p></body>";
        Document doc= Jsoup.parse(html);
        System.out.println(doc.title());

    }

}
