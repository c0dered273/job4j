package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;
    private double ab;
    private double bc;
    private double ac;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
        ab = first.distance(second);
        bc = second.distance(third);
        ac = first.distance(third);
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Периметр.
     */
    public double period(double a, double b, double c) {
        return (this.ab + this.bc + this.ac) / 2;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double p = this.period(ab, bc, ac);
        if (this.exist()) {
            // написать формулу для расчета площади треугольника.
            rsl = Math.sqrt(p * (p - this.ab) * (p - this.ac) * (p - this.bc));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @return
     */
    private boolean exist() {
        return (ab + ac) > bc && (ab + bc) > ac && (ac + bc) > ab;
    }
}
