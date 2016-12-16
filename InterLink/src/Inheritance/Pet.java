package Inheritance;

/**
 * Created by artem on 15.12.2016.
 */
public class Pet extends Animals {
    protected String owner;

    public Pet(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    //метод который возвращает имя владельца
    public String getName() {
        return owner;
    }

    public String playing(){
        return "I play";
    }

}
