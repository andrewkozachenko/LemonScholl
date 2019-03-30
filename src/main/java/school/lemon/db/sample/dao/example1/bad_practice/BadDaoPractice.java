package school.lemon.db.sample.dao.example1.bad_practice;

public class BadDaoPractice {
    static DataBasePGSQL dataBase = new DataBasePGSQL();
    public static void main(String[] args) {
        String user1 = dataBase.getUserFromPGSQL(1);

        System.out.println("User from DataBaseMSSQL");
        System.out.println(user1);
    }
}


class DataBaseMSSQL {
    public String getUser(int userId){
        return "User " + userId;
    }

    public String getUsers(){
        return " Users";
    }
}


class DataBasePGSQL {
    public String getUserFromPGSQL(int userId){
        return "User " + userId;
    }

    public String getUsers(){
        return " Users";
    }
}

