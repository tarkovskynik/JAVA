package ua.course3.week3.JavaIOExceptions.JavaIO;

import java.io.IOException;
import java.util.Arrays;

public class TestWriteInto {

    public static void main(String[] args) throws IOException {

        IOUtils ioUtils = new IOUtils();

        int a = ioUtils.a;

        ioUtils.String("asd");

        IOUtils.writeIntoFile(Arrays.asList("Nikitos privet "), "/Users/mykytatarkovskyi/Downloads/Temp/out.txt"); // записал в файл текст

        String res = IOUtils.readFileContent("/Users/mykytatarkovskyi/Downloads/Temp/out.txt"); // вывел текст на экран

        System.out.println(res);
    }
}
