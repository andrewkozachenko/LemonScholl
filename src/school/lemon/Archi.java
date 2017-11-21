package school.lemon;

public class Archi {

    public static void printArray(int index/**
     index is j
     */, int [] array){
        if (index == 0){

            index = array.length-1;
        }
        System.out.println(array[index]);
        index--;
        if(index!= 0){
            printArray(index, array);
        } else {
            System.out.println(array[index]);
        }


    }

    public static void main(String[] args) {
        int array [] = new int [5];
        for(int i =0; i < array.length; i++){
            array[i] = 4*i+8/(i+1);
        }
//        int b = 0;
//        while(b < array.length){
//            System.out.println("Array " + array [b]);
//            b++;
//        }
//        printArray(0, array);
        int d =0;
        for(int i = array.length-1; i >= 0; i--){
            System.out.println(i +  " = " + array[i]);
        }

    }
}
