package com.zsy;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by xyz on 2017/10/30.
 */
public class FilePathParse {

    public static void main(String args[])  {

        Document document = null;
        try {
            document = Jsoup.parse
                    (new File("src/main/resources/demo.html"),
                            "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(document.title());
    }
}
