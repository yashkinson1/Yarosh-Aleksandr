package Polymorphism;

/**
 * Created by artem on 14.12.2016.
 */
public class Sportsman extends Human {
     private  int conf;

    public Sportsman(String name, int age,int conf) {
        super(name, age);
        this.conf=conf;

    }

    //преопределяющий метод с абстрактного класса
    @Override
    public void run() {
        speed*=conf;
        System.out.println("speed sportsman "+ speed);
    }
}
