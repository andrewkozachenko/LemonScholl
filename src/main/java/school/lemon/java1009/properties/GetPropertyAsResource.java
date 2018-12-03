package school.lemon.java1009.properties;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.Set;

public class GetPropertyAsResource {
    public static void main(String[] args) {
        GetPropertyAsResource ff = new GetPropertyAsResource();
        ff.getResourceValue();

    }

    private  void getResourceValue() {
        String propertyName = "config_1.properties";
        Properties properties = new Properties();

        InputStream inputStream = null;
        try {
            URL url = getClass().getResource(propertyName);
            ClassLoader classLoader = getClass().getClassLoader();
            inputStream =classLoader.getResourceAsStream(propertyName);
            properties.load(inputStream);
            Set keys =  properties.keySet();
            for(Object o : keys){
                String key = (String)o;
                System.out.println(properties.getProperty(key));
            }
        }catch (Exception io){
            io.printStackTrace();
        }finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
