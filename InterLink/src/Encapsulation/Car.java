package Encapsulation;

/**
 * Created by artem on 14.12.2016.
 */
public class Car {
    private String name;
    private int age;
    private int key_id;// переменная для запуска двигателя
    private boolean move;// переменная которая хранит передвижения
    private boolean engine;

    public Car(String name, int age, int key_id) {// конструктор в котором задаем имя, возраст автомобиля и ключ для запуска двигателя
        this.name = name;
        this.age = age;
        this.key_id = key_id;
    }


    public String getName() {// метод который возвращает марку автомобиля
        return "This car is " + name +" name";
    }

    public String getAge() {// метод который возвращает возраст автомобиля
        return "This car is " + age + " age";
    }

    public void setAge(int age) {// метод который устанавливает возраст автомобиля
        this.age = age;
    }


    public boolean isMove() {// метод который возвращает состояние движения
        return move;
    }
    public void setMove(boolean move) {// метод который управляет движением
        if(engine==true) this.move = move;
    }

    public void setEngine(boolean engine,int key_id) {// метод который управляет двигателем
        if(this.key_id==key_id)
        this.engine = engine;
        if(engine==false) this.move=false;
    }
}

