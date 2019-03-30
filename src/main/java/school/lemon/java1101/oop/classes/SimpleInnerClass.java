package school.lemon.java1101.oop.classes;

interface AnonymousInterface{
    void sayMyName(String name);
}



public class SimpleInnerClass {

    public static class InnerStaticClass{};

    public  class InnerNonStaticClass{};



    public static void main(String[] args) {
        AnonymousInterface anonymousInterface = new AnonymousInterface() {
            @Override
            public void sayMyName(String name) {
                System.out.println("My Name is" + name);
            }
        };

        SimpleInnerClass simpleInnerClass = new SimpleInnerClass();


        System.out.println(simpleInnerClass.getClass().getName());
        System.out.println(anonymousInterface.getClass().getSimpleName());
    }
}
