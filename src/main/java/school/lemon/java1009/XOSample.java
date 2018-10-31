package school.lemon.java1009;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class XOSample {

    static String winArray [] = {"012", "345", "678", "036", "147", "258", "048", "246"};

    public static void main(String[] args) {
        //XOSample xo = new
    }



    boolean checkWinner(String user ){
        char [] userC = user.toCharArray();
        List<String> list = Arrays.asList(winArray);
        for ( int i =0;i < userC.length;i++){
            String s = ""+userC[i];
            list  = checkWinnerPartTwo(s,list);
            if(i>=2) {
                if (list.isEmpty()) {
                    return false;
                }
            }
        }
        return list.size()==1;
    }

    List<String> checkWinnerPartTwo(String c, List<String> list){
        List<String> winUser = new ArrayList<>();
        for (String s : list){
            if(s.contains(c)){
                winUser.add(s);
            }
        }
        return winUser;
    }
}
