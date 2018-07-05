package school.lemon.fields;

public class Test2 {

    int a = 10;         // обычное поле
    static int cnt = 0; // статическое поле

    public static void print(Test2 obj) {
        System.out.println("cnt=" + cnt);
        System.out.println("a=" + obj.a);
    }

    public static void main(String args[]) {
        Test2 obj1 = new Test2();
        cnt++;          // увеличим cnt на 1
        Test2.print(obj1);
        Test2 obj2 = new Test2();
        cnt++;          // увеличим cnt на 1
        obj2.a = 0;
        print(obj1);
        print(obj2);
    }
}
