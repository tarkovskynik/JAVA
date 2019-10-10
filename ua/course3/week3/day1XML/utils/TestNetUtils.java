package ua.course3.week3.day1XML.utils;

import java.io.IOException;
import java.net.URISyntaxException;

public class TestNetUtils {

    public static void main(String[] args) throws IOException, URISyntaxException {
        NetUtils.load("https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwj8xpH-ne3kAhUv2aYKHegXDjYQjRx6BAgBEAQ&url=https%3A%2F%2Fmirpozitiva.ru%2Fphoto%2F1252-krasivye-kartinki.html&psig=AOvVaw3V1TYc_9LcajaUbT44vgf4&ust=1569544217508764", "Downloads/pictures.JPEG");
        //скачиваем себе на компьютер файл
    }
}
