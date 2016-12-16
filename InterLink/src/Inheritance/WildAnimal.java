package Inheritance;

/**
 * Created by artem on 15.12.2016.
 */
public class WildAnimal extends Animals {
    protected String habitat;

    public WildAnimal(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    //Метод который возвращает среду обитания
    public String getHabitat() {
        return habitat;
    }

    public String swim(){
        return "I swim";
    }

    //Переопредленный метод информация о диких животных
    @Override
    public String toString() {
        return String.format("name " + name+ " my type " + type + " age " + age +" "+ eat() + " habitat " + habitat);
    }

}
