package school.lemon.reflection;

abstract class First {
    private String screenContent;

    public First(String screenContent) {
        this.screenContent = screenContent;
    }

    public String getScreenContent() {
        return screenContent;
    }

    public void setScreenContent(String screenContent) {
        this.screenContent = screenContent;
    }

    abstract String test(String screenContent);
}

abstract class Second extends First{

    public Second(String screenContent) {
        super(screenContent);
    }

    public void proceed(){
        System.out.println("Proceed");
    }
}

class Third extends Second{

    public Third(String screenContent) {
        super(screenContent);
    }

    @Override
    String test(String screenContent) {
        return screenContent;
    }
}

public class AbstractAbst {

    public static void main(String[] args) {
        First third = new Third("I am third");
        System.out.println(third.getClass().getName());
        System.out.println(third.test("THis is test"));
    }
}
