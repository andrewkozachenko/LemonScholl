package school.lemon.io;

import java.io.File;
import java.io.IOException;

public class IOStart {

    public static void main(String[] args) throws IOException {
        File dir  = new File ("Hrytsyna");
        if (!dir.exists()){
            dir.mkdir();
        }
        File name = new File("Hrytsyna/name.txt");
        if(!name.exists()){
            name.createNewFile();
        }
    }

}
