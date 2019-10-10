package ua.course3.week3.day2.jsoupLib;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlParser {

    public static void main(String[] args) {


       Document document = Jsoup.parse("https://vertex-academy.com/tutorials/ru/reflection-api-v-java-class-field/");
       Element element = document.body();
        Elements elements = element.getElementsByTag("entry-title");

       for (Element element1 : elements){
           if(element1.attr("href").contains("/load")){
               String loadLink = element1.attr("href");
           }
       }

       element.select("entry-header");
    }
}
