package school.lemon.arrays;

public class ArrayTest {

    static void bubbleSort(int ar[]) {
        for (int d : ar) {
            System.out.print(d + " ");
        }
        System.out.println();
        for (int i = (ar.length - 1); i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (ar[j - 1] > ar[j]) {
                    int temp = ar[j - 1];
                    ar[j - 1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        for (int d : ar) System.out.print(d + " ");
    }

    static void arrArr() {
        int ary[][] = new int[][]{
                {1, 1, 1},
                {2, 2, 2},
                {1, 2, 3},
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("arr [" + i + "] " + " [" + j + "] = " + ary[i][j]);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {6, 4, 3, 2, 7};
//        bubbleSort(arr);
        arrArr();
    }
}
