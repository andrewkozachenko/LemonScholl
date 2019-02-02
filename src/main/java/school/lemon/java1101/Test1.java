package school.lemon.java1101;

import java.util.Scanner;

public class Test1 {


    public static void main(String[] args) {
        yuliaHwGG();
    }


    public static void artemHW2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Фамилию, Имя, Отчество с каждой новой строки ");
        String sername = in.nextLine();
        String name = in.nextLine();
        String fullname = in.nextLine();
        String FIO = (sername + " " + name + " " + fullname);
        String newFIO = (name + " " + fullname + " " + sername);
        System.out.println(FIO);
        System.out.println(newFIO);
    }

    public static void artemHW2V1_2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Фамилию, Имя, Отчество  через пробел");
        String FIO = in.nextLine();
        String[] arrFio = FIO.split(" ");
        FIO = arrFio[1] + " " + arrFio[2] + " " + arrFio[0];
        System.out.println(FIO);
    }

    public static void artemHW3() {
        Scanner in = new
                Scanner(System.in);
        System.out.println("Введите слово");
        String word = in.nextLine();
        System.out.println(word);
        String reverseMe = word;
        for (int i = 0; i < reverseMe.length(); i++) {
            reverseMe = reverseMe.substring(1, reverseMe.length() - i)
                    + reverseMe.substring(0, 1)
                    + reverseMe.substring(reverseMe.length() - i);
        }
        System.out.println(reverseMe);

    }

    public static void valeriiHWs() {
        String FIO = "Крутько Валерий Александрович";
        getDecimalLine(FIO);
        printNewLine();
        getReversedLine(FIO);
        printNewLine();
        getPermutedLine(FIO);
    }

    private static void getDecimalLine(String FIO) {
        for (int index = 0; index < FIO.length(); index++) {
            char character = FIO.charAt(index);
            if (character == ' ') {
                System.out.print("space(" + (int) character + ") ");
            } else {
                System.out.print((int) character + " ");
            }
        }
    }

    private static void getReversedLine(String FIO) {
        StringBuffer reversedLine = new StringBuffer(FIO.length());
        for (int index = FIO.length() - 1; index >= 0; index--) {
            char ch = FIO.charAt(index);
            reversedLine.append(ch);

        }
        System.out.print(reversedLine);
    }

    private static void getPermutedLine(String FIO) {
        StringBuffer line = new StringBuffer().append(FIO);
        int firstSpaceIndex = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                firstSpaceIndex = i;
                break;
            }
        }
        String lastName = line.substring(0, firstSpaceIndex);
        line.delete(0, firstSpaceIndex + 1);
        line.append(' ').append(lastName);

        System.out.print(line);

    }

    private static void printNewLine() {
        System.out.println();
    }

    private static void yuliaHw() {
        //значение элемента и его индекс
        String fullname = "Nefodova Yulia Vladimirovna";
        /*char[] name = {'N', 'e', 'f', 'o', 'd', 'o', 'v', 'a', 'Y', 'u', 'l', 'i', 'a', 'V', 'l', 'a', 'd', 'i', 'm', 'i', 'r', 'o', 'v', 'n', 'a'};*/
        char[] name = fullname.toCharArray();
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + "-" + (int) name[i]);

        }
        //строка в обратном порядке
        String reverse = new StringBuilder(fullname).reverse().toString();
        System.out.println("Строка в обратном порядке:" + reverse);


    }


    private static void yuliaHwGG() {
        String[] fullname = {"Nefodova", "Yulia", "Vladimirovna"};
        System.out.println(getStringArrayAsAString(fullname));
        String element ;
        for (int i = 0; i < fullname.length; i++) {
            element = fullname[i];
            fullname[i] = fullname[i+1];
            fullname[i+1] = element;
            System.out.println(getStringArrayAsAString(fullname));
        }
    }



    private static String getStringArrayAsAString(String[] arr) {
        StringBuffer buffer = new StringBuffer();
        for (String str : arr ) {
            buffer.append(str).append(" ");
        }
        return buffer.toString();
    }
}
