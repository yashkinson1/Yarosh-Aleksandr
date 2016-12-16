package Inheritance;

/**
 * Created by artem on 15.12.2016.
 */
public class Cat extends Pet {

    protected boolean meow;

    public Cat(String name, int age, String owner) {
        super(name, age, owner);
        type = "Cat";
    }

    //Метод котрый управляет мяукает ли кошка
    public void isMeow(boolean meow) {
        this.meow = meow;
        //System.out.println("Cat meow " + meow);
    }

    //Переопредленный метод информация о кошке
    @Override
    public String toString() {
        return String.format("name " + name +  " my type " + type +" age " + age + " " + eat() + "owner " + owner + " cat meow " + meow);
    }
}
