package school.lemon.db.sample.dao.example1.better;

public class BetterThenBadPractice {
    static Dao dao = new DataBase();

    public static void main(String[] args) {
        String data = dao.getData();
        System.out.println("Necessary data");
        System.out.println(data);
    }

}

interface Dao{
    String getData();
}

class DataBase implements Dao {

    String getDataFromTable(){
        return "Data from table";
    }

    @Override
    public String getData() {
        return getDataFromTable();
    }
}

class FileSystem implements Dao{
    String getDataFromFileSystem(){
        return "Data from File System";
    }

    @Override
    public String getData() {
        return getDataFromFileSystem();
    }
}