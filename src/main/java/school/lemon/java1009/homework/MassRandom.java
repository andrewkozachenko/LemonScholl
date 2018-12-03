package school.lemon.java1009.homework;

import java.util.Arrays;
import java.util.Random;


public class MassRandom {

    public static void main(String[] args) {
        System.out.println(" is 85 in array " + search(getRandomArray(), 85));
    }

    public static boolean search(int []array, int search){
         return binarySearch( bubbleSortArray(array), search);
    }

    private static boolean binarySearch(int[] mas, int search) {
        int start=0;
        int end=mas.length;
        while (start < end){
            int mid=(start+end)/2;
            if (mas[mid]==search){
                return true;
            }else {
                System.out.println(mas[mid]);
                if(mas[mid]>search){
                    start=mid+1;
                    System.out.println("Start ->" + start);
                }else {
                    end=mid;
                    System.out.println("End ->" + end);
                }
            }
            if (start == end){
                break;
            }
            System.out.println("Mid == > "+ mid);
        }
        return false;
    }

    private static void printArray(int[] mas) {
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(mas));
    }

    private static int [] bubbleSortArray(int[] mas) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] < mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        printArray(mas);
        return mas;
    }

    private static int[] getRandomArray() {
        Random rand = new Random();

        int mas[] = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(100);

        }
        return mas;
    }
}
