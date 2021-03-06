package ru.job4j.condition;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point distPoint) {
        return Math.sqrt(Math.pow((distPoint.x - this.x), 2) + Math.pow((distPoint.y - this.y), 2));
    }

    public double distance3d(Point distPoint) {
        return Math.sqrt(Math.pow((distPoint.x - this.x), 2) +
                Math.pow((distPoint.y - this.y), 2) +
                Math.pow((distPoint.z - this.z), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(2, 2);
        Point b = new Point(10, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
