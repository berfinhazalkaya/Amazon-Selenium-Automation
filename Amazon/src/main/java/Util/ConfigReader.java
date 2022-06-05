package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties; // config.properties dosyasını okumak için method

    public static Properties initialize_Properties(){ //Return properties olduğu için public properties yazdık
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("./src/test/resources/config.properties");
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties; //config.properties kısmındaki bilgileri döndürecek
    }

    public static Properties getProperties() {
        return properties;
    }

}
 //Bu bilgileri kullanmak için Driver Factory'ye git