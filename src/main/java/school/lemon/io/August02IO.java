package school.lemon.io;

import java.io.File;
import java.io.IOException;

public class August02IO {

    public static final String directoryName = "src/FIRE_WALL";
    public static final String fileName = "FireBall.txt";

    public static void createMyOwnDir(String dirName) {
        System.out.println("Strart createMyOwnDir");
        File dir = new File( dirName);
        if (!dir.exists()) {
            dir.mkdir();
            System.out.println("Dir was created");
        }
        else {
            System.out.println("Dir is already exists");
        }
    }

    public static void createMyOwnFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File  was created");
            } catch (IOException e) {
                System.out.println("Problem with path");
            }
        }
        else {
            System.out.println("File is already exists");
        }
    }

    public static void main(String[] args) {
        String dirName = "FIRE_WALL";
        String fileName = "FireBall.txt";
        createMyOwnDir(dirName);
        createMyOwnFile("src/" + dirName+ "/" +fileName);


    }
}
