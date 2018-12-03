package school.lemon.generic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Beer{

}

class GenericT<T extends Lesch,V extends Beer>{

    private T t;
    private V v;

    public GenericT(T t) {
        this.t = t;
    }

    public GenericT(T t, V v) {
        this.t = t;
        this.v = v;
    }
}


class Lesch
{


    public void generic() throws IOException{
        List list = new ArrayList();
        list.add(26);

        Object obj  = list.get(0);
        Integer i = (Integer) list.get(0);
        list.get(216);
    }
}

class Plotva extends Lesch{
    @Override
    public void generic()  {

    }
}




public class GenericSample {

    public static void main(String[] args) {

//
//        List<Integer> ll = new ArrayList<>();
//        ll.add(45);
//
//
//        ll.add("dfdf");

        GenericT<Plotva, Beer> g = new GenericT(new Plotva(), new Beer());


    }
}
