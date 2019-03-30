package school.lemon.logging;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.logging.LogManager;

public class ConnectLoggerFile {
    public static void main(String[] args) {
        try {
            LogManager.getLogManager()
                    .readConfiguration(ConnectLoggerFile.class.getResourceAsStream("logging.properties"));


            //URL path = ConnectLoggerFile.class.getResource("logging.properties");
//            ClassLoader classLoader = ConnectLoggerFile.class.getClassLoader();
//
//            Properties properties = new Properties();
//File file = new File(classLoader.getResource("logging.properties").getFile());
//            InputStream in = new FileInputStream(file);
//            properties.load(in);
//            System.out.println(properties.get("handlers"));
        } catch (Exception e){
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
    }
}
