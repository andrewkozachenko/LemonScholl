package school.lemon.classes.methods;

class Oper{
    public int a;
    public int b;

    public int sum(){
        return a + b;
    }

    public int dif(){
        return a - b;
    }
}

public class Test1 {

    public static void main(String args[]) {
        Oper op = new Oper();
        op.a = 6;
        op.b = 7;
        System.out.println("Сумма=" + op.sum());
        System.out.println("Разность=" + op.dif());
    }

}
