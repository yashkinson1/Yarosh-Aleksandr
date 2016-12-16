package Inheritance3;

/**
 * Created by artem on 15.12.2016.
 */
public class Rhombus extends Parallelogram implements Imoving {

    public Rhombus(double x1, double x2, double y1, double y2, double x3, double y3, double alpha) {
        super(x1, x2, y1, y2, x3, y3, alpha);
    }

        @Override
        public double dlina() {
            return super.dlina();
        }

        @Override
        public double square() {
            return ((x2 - x1) * (y2-y1)) * Math.sin(alpha);
        }

        @Override
        public double perimetr() {
            return 4 * (x2 - x1);
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
