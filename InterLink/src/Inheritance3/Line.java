package Inheritance3;

/**
 * Created by artem on 15.12.2016.
 */
public class Line extends Figure implements Imoving {

    public Line(double x1, double x2, double y1, double y2) {
        super(x1, x2, y1, y2);
    }

    @Override
    public double dlina() {
        return (x2-x1)+(y2-y1);
    }

    @Override
    public double square() {
        return 0;
    }

    @Override
    public double perimetr() {
        return 0;
    }

    @Override
    public void move(double move) {
        x1 += move;
        x2 += move;
        y1 += move;
        y2 += move;
    }

}
