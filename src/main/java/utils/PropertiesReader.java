package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    public static String getProperty(String property) {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("src/main/resources/constants.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return p.getProperty(property);
    }
}
