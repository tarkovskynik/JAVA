package ua.course3.week3.JavaIOExceptions.JavaIO;

import java.io.*;
import java.net.URISyntaxException;
import java.util.List;

public class IOUtils {
    // InputStream,  Reader - для считывания
    // OutPutStream , Write - для записывания
    // Reader, Write - для считывания текста например из (txt, xml)
    //OutPutStream, InputStream - для потока байтов (exe, img, jpeg, mp3)
    // 0-255 byte     char 0-65535


    int a = 10;

    public void String  (String a){
        System.out.println(a);
    }

    public static byte[] getBytes(String path) throws IOException {
        InputStream is = new FileInputStream(path);
        // String res = ""; // Имутейбл класс - создается новый обьект все время когда идет += val

        StringBuilder res = new StringBuilder(); // быстрее будет считывать стринг билдер не создает постоянно новый обьект стринги

        int val = -1; // метод read можно вызывать пока будет не меньше нуля
        while ((val = is.read()) != -1) {
            // res += val;
            res.append(val); // записываем результат то что считываем
        }
        return res.toString().getBytes(); // переобразовываем в байты
    }

    public static void load(String url, String dest) throws URISyntaxException, IOException {

        try (InputStream is = new FileInputStream(url);
             OutputStream os = new FileOutputStream(dest);) {
            byte[] buff = new byte[1024];
            int count = 0;

            while ((count = is.read(buff)) != -1) {
                os.write(buff, 0, count);
                os.flush();
            }
        }
    }

    // Reader - для считывания текста с файла
    public static String readFileContent(String path) throws IOException {
        Reader reader = new FileReader(path);
        StringBuilder sb = new StringBuilder();
        char[] buff = new char[1000];

        int count = -1;

        while ((count = reader.read(buff)) != -1) {

            sb.append(buff,0,count);

        }

        return sb.toString();
    }

    public static void writeIntoFile(List<String> content, String path) throws IOException {
        Writer writer = new FileWriter(path);

        for (String part: content) {
            writer.write(part);
            writer.flush(); // записывает в файл без метода close (метод клоуз не нужен работаем с флаш)
        }

      //  writer.close(); // при записывании информации нужно вызывать клоуз (сливает свой буфер) с буфера идет в файл

    }
}