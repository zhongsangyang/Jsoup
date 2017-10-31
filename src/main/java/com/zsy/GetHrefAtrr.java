package com.zsy;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Created by xzy on 2017/10/30.
 */
public class GetHrefAtrr implements Mainmethod{

    public void main1(String[] args) {

    }
    public static  void main(String[] args) {
        try
        {
            Document document = Jsoup.parse(new File
                    ("src/main/resources/demo.html"), "utf-8");
            Elements links = document.select("a[href]");
            links.attr("rel", "nofollow");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
