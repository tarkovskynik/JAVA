package ua.course3.week3.JavaIOExceptions.JavaIO;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static final String PATH = new String();
    public static final String PATH1 = new String();

    public static void main(String[] args) throws IOException, URISyntaxException {

        IOUtils.getBytes("/Users/mykytatarkovskyi/Desktop/ScreenShot.png");

        IOUtils.load("/Users/mykytatarkovskyi/Desktop/ScreenShot.png", "/Users/mykytatarkovskyi/Downloads/ScreenShot123.png");
    }

}
