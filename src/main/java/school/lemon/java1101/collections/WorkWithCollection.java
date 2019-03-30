package school.lemon.java1101.collections;

import school.lemon.java1101.collections.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class WorkWithCollection {

    static List<Car> list;

    public static void main(String[] args) {
        initListOfCar();
        System.out.println(getList().size());
        //printList(list);
        Car lanos = new Car("ZAZ","Deo", "Lanos");
//        for (Car car : list){
//            if (lanos.equals(car)){
//                list.remove(lanos);
//            }
//        }

        Car foudCar = list.stream().filter(
                car -> car.getModel().equals("Diablo")
        ).findFirst().get();
        Car foundCar2 = null;
        for (Car car : list) {
            if (car.getModel().equals("Diablo")) {
                foundCar2 = car;
            }
        }
        System.out.println(foudCar);

    }




    private static void initListOfCar(){
        list = new ArrayList<>();
        Car lanos = new Car("ZAZ","Deo", "Lanos");
        Car lada = new Car("VAZ", "Lada", "Vesta");
        Car lamorgini = new Car("VAG","Lamborgini", "Diablo");
        Car ferrari = new Car("FGA", "Ferrari", "F350");
        list.add(lanos);
        list.add(lada);
        list.add(lamorgini);
        list.add(ferrari);
    }

    public static List<Car> getList() {
        return list;
    }

    private static void printList(List<Car> list){
        System.out.println(listToString(list));
    }

    private static String listToString(List<Car> list) {
        StringBuilder builder = new StringBuilder("[\n");
        for (Car car:list ) {
            builder.append(car).append("\n");
        }
        builder.append("]");
        return builder.toString();
    }

}
