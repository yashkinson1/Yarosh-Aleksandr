package Inheritance;

/**
 * Created by artem on 15.12.2016.
 */
public class Crocodile extends WildAnimal implements Ihunt {

    public Crocodile(String name, int age, String habitat) {
        super(name, age, habitat);
        type="Crocodile";
    }

    // реализованый метод с интерфейса
    @Override
    public String hunt() {
        return "I hunt ";
    }

    // переопределенный метод eat с абстрактного класса
    @Override
    public String eat() {
        return hunt();
    }

}
