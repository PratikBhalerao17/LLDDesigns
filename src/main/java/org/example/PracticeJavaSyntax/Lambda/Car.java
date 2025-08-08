package org.example.PracticeJavaSyntax.Lambda;

import java.util.*;
import java.util.stream.Stream;

public class Car {
    String name;
    int price;
    int speed;

    public Car(String name, int price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(new Car("Audi",55,55),new Car("Mercedes",75,125),new Car("BMW",45,95));
//        Car car = new Car("Audi",55,100);
//        Comparator<Car> comparator = new Comparator<Car>() {
//            @Override
//            public int compare(Car car, Car t1) {
//                return car.speed-t1.speed;
//            }
//        };
//        Collections.sort(cars,comparator)
//        ;


//        Collections.sort(cars,(c1,c2) ->{
//            System.out.println("Sorting for "+c1 + " and "+c2);
//        return c1.speed - c2.speed;
//        });
//        System.out.println(cars);
//        Stream<Integer> = cars.stream().map()


    }
}
