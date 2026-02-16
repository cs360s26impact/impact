package edu.lums.impact;

public class triangle extends Shape {

    public int base;
    public int height;

    public triangle(int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}
