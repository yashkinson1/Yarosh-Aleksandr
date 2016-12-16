package Encapsulation;

import java.io.Console;

/**
 * Created by artem on 14.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", 4,12345);
        System.out.println(car1.getName());
        System.out.println(car1.getAge());
        System.out.println(car1.isMove());
        car1.setEngine(true,12345);// запускаем двигаетель
        car1.setMove(true);
        System.out.println(car1.isMove());
        car1.setEngine(false,12345);// глушим двигатель
        System.out.println(car1.isMove());


    }
}
