package ua.course3.week3.day1XML;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
        // DOM модель (Document Object Model)
        /*Так что же такое DOM? Судя из названия это есть объектная модель документа.
        XML документ представляет собой набор тегов — узлов. Каждый узел может иметь неограниченное количество дочерних узлов.
        Каждый дочерний тоже может содержать много-много потомков или не содержать их вовсе. Таким образом получается некое дерево.
        Так вот DOM представляет собой всё это дерево в виде специальных объектов Node. Каждый Node соответствует своему XML-тегу.
        Каждый Node содержит полную информацию о том, что это за тег, какие он имеет атрибуты, какие дочерние узлы содержит внутри себя и так далее.
        На самой вершине этой иерархии находится Document.*/

public class Main {

    private static List<Laptop> laptops = new ArrayList<Laptop>();


    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {

        // Получение фабрики, чтобы после получить билдер документов.
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        // Получил из фабрики билдер, который парсит XML, создает структуру Document в виде дерева.
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Запарсили XML, создав структуру Document. Теперь есть доступ ко всем элементам.
        Document document = builder.parse(new File("laptop.xml"));

        Element element = document.getDocumentElement(); // дает root - > computerShop

        // Вывели корневой елемент
        System.out.println(element.getNodeName());
        System.out.println(element.getTagName());
        System.out.println(element.getAttribute("name"));

        NodeList laptopElements = element.getElementsByTagName("laptop"); // лэптоп это элемент ., а между эдементами в хмл файле тест Нод

        for (int i = 0; i < laptopElements.getLength(); i++) {

            Node laptop = laptopElements.item(i); // интерфейс нода

            // Получение атрибутов каждого элемента
            NamedNodeMap attributes = laptop.getAttributes();

            //System.out.println(attributes.getNamedItem("id"));

            // Добавление обьекта. Атрибут - тоже Node, потому нам нужно получить значение атрибута с помощью метода getNodeValue()
            laptops.add(new Laptop(attributes.getNamedItem("id").getNodeValue(), attributes.getNamedItem("model").getNodeValue(), attributes.getNamedItem("video").getNodeValue()));

        }


        for (Laptop laptop : laptops) {
            System.out.println(laptop.toString());
        }

        System.out.println();


        Main main = new Main();
        //String res = main.parse(element);
    //    main.parse(element);

        System.out.println(findByXPath("laptop.xml"));
    }

    // <team>... </team>  // ДЗ нужно перевести ХМЛ в ДОМ и вывести ХМЛ на экран !!!
    public void parse(Element root) throws IOException {

        NodeList innerList = root.getChildNodes();
        System.out.print("имя " + root.getTagName() + " ");
        System.out.println("id " + root.getAttribute("name"));

        for (int j = 0; j < innerList.getLength(); j++) {
            Node innnerElement = innerList.item(j);

            if (innnerElement.getNodeType() == Node.ELEMENT_NODE) {
                Element inElement = (Element) innnerElement;
                System.out.print(inElement.getNodeName() + " ");
                System.out.println(inElement.getTextContent());

            }

        }


    }

    public static String findByXPath(String xml) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {

        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(xml));

        DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();

       XPath xPath = XPathFactory.newInstance().newXPath();
       String getUserById = "//computerShop";
       String res =  xPath.compile(getUserById).evaluate(document);
       return res;

    }
}
