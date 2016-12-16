package Inheritance3;

/**
 * Created by artem on 15.12.2016.
 */
public abstract class Figure {
    protected double x1;
    protected double x2;
    protected double y1;
    protected double y2;

    public Figure(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public abstract double dlina();
    public abstract double square();
    public abstract double perimetr();
}
