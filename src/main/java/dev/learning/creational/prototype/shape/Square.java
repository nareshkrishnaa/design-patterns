package dev.learning.creational.prototype.shape;

public class Square implements Shape{
    private String color;

    public Square(String color) {
        this.color = color;
        System.out.println("Square of color "+color+ " created "+this.hashCode());
    }

    @Override
    public Shape clone() {
        return new Square(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square of color "+color+" "+this.hashCode());
    }
}
