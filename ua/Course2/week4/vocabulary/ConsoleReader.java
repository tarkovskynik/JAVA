package ua.Course2.week4.vocabulary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
        protected String bufferReaderStr() throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String reader = str.readLine();
        return reader;
    }

    protected int bufferReaderInt() throws IOException {
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        String numb = number.readLine();
        int result = Integer.parseInt(numb);
        return result;
    }

}
