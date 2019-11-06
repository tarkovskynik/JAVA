package ua.course3.week4.day2.client;

import java.io.*;
import java.net.Socket;

public class RunClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.198", 8080);

        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is)); // отослать что-то

        StringBuilder sb = new StringBuilder();

        String line = null;

        while ((line = br.readLine()) != null){
            sb.append(line).append("\n");
        }

        System.out.println(sb.toString());

    }
}
