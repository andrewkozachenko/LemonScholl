package school.lemon.java1009.last_lesson;

class Dummy{
    private String name = "Dummy";
    void sayDummy(){
        System.out.println("I'm dummy");
    }

    String getName(){
        return name;
    }

    void exceptionNN() throws IllegalArgumentException{
        throw  new IllegalArgumentException();
    }
}

class Genius extends Dummy {
    @Override
    void sayDummy() {
        super.sayDummy();
    }

    void sayDummy(String word){

    }


    String getName(String newName) {
        return new StringBuilder(super.getName()+ newName).toString();
    }

    String getName(StringBuffer newName) throws NullPointerException {
        if (newName == null){
            throw new NullPointerException();
        }
        return new StringBuilder(super.getName()+ newName).toString();
    }

    @Override
    void exceptionNN() throws NullPointerException {

    }
}

public class SimpleImplements  {
}
