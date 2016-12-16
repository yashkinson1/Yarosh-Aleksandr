package Inheritance;

/**
 * Created by artem on 15.12.2016.
 */
public abstract class Animals {
    protected String name;
    protected int age;
    protected String type;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

     public String eat(){
        return " i am eat ";
    };

    @Override
    public String toString() {
        return String.format("name " + name+ " my type " + type + " age " + age +" "+ eat());
    }
}
