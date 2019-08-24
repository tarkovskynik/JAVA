package ua.course3.week3.week1;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Laptop> laptops = new ArrayList<Laptop>();

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        // Получение фабрики, чтобы после получить билдер документов.
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        // Получил из фабрики билдер, который парсит XML, создает структуру Document в виде дерева.
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Запарсили XML, создав структуру Document. Теперь есть доступ ко всем элементам.
        Document document = builder.parse(new File("laptop.xml"));

        Element element = document.getDocumentElement();

        // Вывели корневой елемент
        System.out.println(element.getTagName());

        NodeList laptopElements = document.getDocumentElement().getElementsByTagName("laptop");

        for (int i = 0; i < laptopElements.getLength(); i++) {

            Node laptop = laptopElements.item(i);

            // Получение атрибутов каждого элемента
            NamedNodeMap attributes = laptop.getAttributes();

            //System.out.println(attributes.getNamedItem("id"));

            // Добавление обьекта. Атрибут - тоже Node, потому нам нужно получить значение атрибута с помощью метода getNodeValue()
            laptops.add(new Laptop(attributes.getNamedItem("id").getNodeValue(), attributes.getNamedItem("model").getNodeValue(), attributes.getNamedItem("video").getNodeValue()));

        }


        for(Laptop laptop : laptops){
            System.out.println(laptop.toString());
        }



    }
}
