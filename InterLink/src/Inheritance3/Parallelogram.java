package Inheritance3;

/**
 * Created by artem on 15.12.2016.
 */
public class Parallelogram extends Line {
    protected double alpha;
    protected   double x3;
    protected double y3;
    public Parallelogram(double x1, double x2, double y1, double y2, double x3, double y3, double alpha) {
        super(x1, x2, y1, y2);
        this.alpha = alpha;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double dlina() {
        return super.dlina();
    }

    @Override
    public double square() {
        return ((x2-x1)+(y2-y1)*((x3-x1)+(y3-y1)))*Math.sin(alpha) ;
    }

    @Override
    public double perimetr() {
        return x1 + x2 + y1 + y2;
    }

    @Override
    public void move(double move) {
        x1 += move;
        x2 += move;
        x3 += move;
        y1 += move;
        y2 += move;
        y3 += move;
    }
}
