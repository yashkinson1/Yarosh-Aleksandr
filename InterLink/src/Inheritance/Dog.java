package Inheritance;

/**
 * Created by artem on 15.12.2016.
 */
public class Dog extends Pet {

    protected boolean bark;

    public Dog(String name, int age, String owner) {
        super(name, age, owner);
        type="Dog";
    }

    //Метод котрый управляет гавкает ли собака
    public void isBark(boolean bark) {
        this.bark=bark;
        //System.out.println("dog bark="+bark);
    }

    //Переопредленный метод информация о собаке
    @Override
    public String toString() {
        return String.format("name " + name + " my type " + type + " age " + age + " " + eat() + "owner " + owner + " dog bark " + bark);
    }
}
