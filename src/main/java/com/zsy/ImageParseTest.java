package com.zsy;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/10/30.
 */
public class ImageParseTest {
    public static void main(String args[]){
        try
        {
            Document document = Jsoup.parse(new File("src/main/resources/demo.html"), "utf-8");
            Elements images = document.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
            for (Element image : images) {
                System.out.println("src : " + image.attr("src"));
                System.out.println("height : " + image.attr("height"));
                System.out.println("width : " + image.attr("width"));
                System.out.println("alt : " + image.attr("alt"));
            }
        }
        catch (IOException e){
        e.printStackTrace();

        }
    }
    //获取URl信息
    @Test
    public void testUrlinformation(){
        try {
//            Document doc=Jsoup.connect("https://www.baidu.com").get();
            Document doc = Jsoup.connect("http://www.yiibai.com").get();
            String keywords = doc.select("meta[name=keywords]").first().attr("content");
            System.out.println("Meta keyword : " + keywords);
            String description = doc.select("meta[name=description]").get(0).attr("content");
            System.out.println("Meta description : " + description);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
