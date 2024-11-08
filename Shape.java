package bai9;

public abstract class Shape {
    protected String color;

    public abstract double getArea();

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape";
    }
}
