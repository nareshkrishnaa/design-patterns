package dev.learning.creational.prototype.shape;

public class Circle implements Shape{
    private String color;

    public Circle(String color) {
        this.color = color;
        System.out.println("Circle of color "+color+" Created "+this.hashCode());
    }

    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle. "+this.hashCode());
    }
}
