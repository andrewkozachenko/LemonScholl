package interview;

import java.util.LinkedList;
import java.util.List;

public class StringToIntegerArray {

    public static List<Integer> getIntegerList(String input){
        StringBuilder firstPart =
                new StringBuilder(input.substring(0, input.length()/2))
                        .reverse()
                        .append(input.substring(input.length()/2, input.length()));

        List<Integer> result = new LinkedList<>();

        for(int i=0; i < firstPart.length(); i++){
            int buffer =  Integer.parseInt(firstPart.substring(i, i+1));
            if(i>= firstPart.length()/2){
                buffer++;
            }
            result.add(buffer);
        }

        return result;
    }


    public static void main(String[] args) {
        List<Integer> list = getIntegerList("123456");
        for (Integer i : list){
            System.out.print(" " + i );
        }
    }
}
