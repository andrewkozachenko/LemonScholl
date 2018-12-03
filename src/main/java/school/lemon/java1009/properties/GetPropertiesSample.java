package school.lemon.java1009.properties;

import java.io.*;
import java.util.Properties;

public class GetPropertiesSample {
    public static void main(String[] args) {
        Properties properties = new Properties();
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream("config.properties");
            properties.load(inputStream);
            System.out.println(properties.getProperty("dbname"));
            System.out.println(properties.getProperty("dbuser"));
            System.out.println(properties.getProperty("dbpass"));


        }catch (IOException io){
            io.printStackTrace();
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException io) {
                    io.printStackTrace();
                }
            }
        }
    }
}
