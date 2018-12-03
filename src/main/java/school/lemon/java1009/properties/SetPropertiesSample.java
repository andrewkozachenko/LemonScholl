package school.lemon.java1009.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class SetPropertiesSample {

    public static void main(String[] args) {
        Properties properties = new Properties();
        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream("config.properties");
            properties.setProperty("dbname","lemon_school");
            properties.setProperty("dbuser","postgres");
            properties.setProperty("dbpass","postgres");

            properties.store(outputStream, null);
//            properties.storeToXML(new FileOutputStream("config_xml.properties"), "XMLLL");
        }catch (IOException io){
            io.printStackTrace();
        }finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException io) {
                    io.printStackTrace();
                }
            }
        }
    }
}
