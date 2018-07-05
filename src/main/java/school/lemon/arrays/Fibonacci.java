package school.lemon.arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int fib [] = new int [10];
        for (int i = 0; i < 10; i++){
            switch (i){
                case 0:
                    fib[i] = 1;
                    break;
                case 1:
                    fib[i] = fib[i-1];
                    break;
                    default:
                        fib[i] = fib[i-1] +  fib[i-2];
            }

        }

        for (int i  : fib){
            System.out.println(" Numero =>" + i);
        }
    }
}
