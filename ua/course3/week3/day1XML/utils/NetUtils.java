package ua.course3.week3.day1XML.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class NetUtils { // для скачивания файла с интернета

    public static void load(String url, String dest) throws URISyntaxException, IOException {

        try (InputStream is = new URI(url).toURL().openStream(); //  траем закрываем закачку
             OutputStream os = new FileOutputStream(dest);) {

            byte[] buff = new byte[1024];

            int count = 0;

            while ((count = is.read(buff)) != -1) {
                os.write(buff, 0, count);
                os.flush();
            }
        }
    }

}
