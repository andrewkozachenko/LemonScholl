package school.lemon.strings;

public class LemonStrings {

    static int a() { print("a"); return 1; }
    static int b() { print("b"); return 1; }
    static int c() { print("c"); return 1; }

    static void print(String s) { System.out.println(s); }

    public static void main(String[] p) {
        if (a() == b() || a() == c()) {
            print("d");
        }
    }
}
