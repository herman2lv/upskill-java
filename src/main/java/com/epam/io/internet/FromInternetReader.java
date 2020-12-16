package com.epam.io.internet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class FromInternetReader {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.vk.com/");
            InputStream inputStream = url.openStream();
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
                while (true) {
                    byte[] bytes = new byte[100];
                    int i = bufferedInputStream.read();
                    if (i != -1) {
                        System.out.print((char) i);
                    } else {
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
