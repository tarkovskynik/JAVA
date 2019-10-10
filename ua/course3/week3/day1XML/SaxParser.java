package ua.course3.week3.day1XML;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.IOException;

public class SaxParser {   // для считки ХМЛ ( просто итерей делает)




    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();

        saxParser.parse(new FileInputStream(Constans.PATH), new MyHandler());
    }


    static class MyHandler extends DefaultHandler{

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            System.out.println(qName);
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            System.out.println(qName);
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            System.out.println(String.valueOf(ch,start,length));
        }
    }
}
