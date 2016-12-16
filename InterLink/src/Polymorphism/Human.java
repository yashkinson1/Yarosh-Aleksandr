package Polymorphism;

/**
 * Created by artem on 14.12.2016.
 */
public abstract class Human {
    protected String name;
    protected int age;
    protected int speed;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.speed=15;
    }
    //Метод который выводит инфу
    public void Information(){
        System.out.println("name " + name + " age " + age);
    }
    //Метод который изменяет возраст
    public void setAge(int age){
        this.age = age;
        System.out.println("age changed " + age);
    }
    //Абстрактный метод бег
    abstract public void run();
}
