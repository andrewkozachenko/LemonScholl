package school.lemon.operators;

public class SymbolTest {

    public static void main(String[] args) {
        for ( int i = 0; i < 100; i++ ) {
            char c = (char)(Math.random()*26 + 'a');
            System.out.print(c + ": ");
            switch ( c ) {
                case 'a': case 'e': case 'i':
                case 'o': case 'u':
                    System.out.println("гласная");
                    break;
                case 'y': case 'w':
                    System.out.println("иногда гласная");
                    break;
                default:
                    System.out.println("согласная");
            }
        }

    }
}
