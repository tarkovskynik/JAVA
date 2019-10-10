package ua.course3.week3.JavaIOExceptions.JavaIO;

import java.io.IOException;

public class TestFileReading {

    public static void main(String[] args) throws IOException {
       String res = IOUtils.readFileContent("/Users/mykytatarkovskyi/Downloads/File.txt");

        System.out.println(res);
    }
}
