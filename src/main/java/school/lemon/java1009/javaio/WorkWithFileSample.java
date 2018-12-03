package school.lemon.java1009.javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithFileSample {

    private static WorkWithFileSample fileSample;

    private WorkWithFileSample() {
    }


    public static WorkWithFileSample getInstance(){
        if(fileSample == null){
            fileSample = new WorkWithFileSample();
            return fileSample;
        } else {
            return fileSample;
        }
    }

    public static void main(String[] args) {
        WorkWithFileSample sample = WorkWithFileSample.getInstance();
        try {
            String fileName = "src/main/java/school/lemon/java1009/javaio/java1009.txt";
            File simpleFile = sample.getFile(fileName);
            String bullShit = "Hello File! 1This is BullShit! !@34";
            sample.writeBullshit(bullShit, simpleFile);
            System.out.println(sample.readBullShit(simpleFile));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }




    private File getFile(String fileName) throws IOException {
        File file = new File(fileName);
        checkAndCreate(file);
        return file;
    }

    private void checkAndCreate(File file) throws IOException {
        if(file.exists()){
            System.out.println("File exists");
        } else {
            file.createNewFile();
            System.out.println("File was created");
        }
    }

    private  String readBullShit(File file){
        System.out.println("START readBullShit()");
        StringBuffer buffer = new StringBuffer();
        try(FileInputStream inputStream = new FileInputStream(file)) {
            int data;

            while ((data = inputStream.read()) != -1){
                buffer.append((char) data);
            }

        } catch (IOException e) {
            System.out.println( " Input Error");
        }
        return buffer.toString();
    }

    private  void writeBullshit(String bullShit, File file){
        System.out.println("START writeBullshit()");
        try(FileOutputStream outputStream = new FileOutputStream(file)){

            byte [] bullshitInBytes = bullShit.getBytes();
            outputStream.write(bullshitInBytes);

        } catch (IOException e) {

        }
        System.out.println("END writeBullshit()");
    }

}
