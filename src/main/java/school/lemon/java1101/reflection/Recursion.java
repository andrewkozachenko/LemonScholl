package school.lemon.java1101.reflection;

public class Recursion {

    int n1 = 1, n2=1;



    public int  recu(int number){//5
        if (number <= 1) return number;
        else return recu(number-1) + recu(number-2);
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.recu(4));
    }
}
