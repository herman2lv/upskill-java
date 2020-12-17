package com.epam.io.internet;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;

public class FromInternetSaver {
    public static void main(String[] args) {
        try (OutputStream outputStream = new FileOutputStream("src/main/resources/outputNet.html")) {
            URL url = new URL("https://www.cia.gov/");
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream())) {
                while (true) {
                    int i = bufferedInputStream.read();
                    if (i != -1) {
                        outputStream.write(i);
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
