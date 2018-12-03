package school.lemon.java1009.exceptions;

import java.io.IOException;

class E {
    public void throwEE () throws Exception{
        System.out.println("This is IO");
    }
}

class F extends E{

    @Override
    public void throwEE() throws IOException {

    }
}


class MyException extends Exception{

}


public class ExceptionSample {
    public static void main(String[] args) {
        throw new IndexOutOfBoundsException();
    }


    public void ex() throws IOException {
        throw new IOException();
    }
}
