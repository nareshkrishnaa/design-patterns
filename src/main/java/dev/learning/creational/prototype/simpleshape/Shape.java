package dev.learning.creational.prototype.simpleshape;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
        System.out.println("Created Shape of color "+color+" "+this.hashCode());

    }
    public void draw(){
        System.out.println("Drawing Shape of color "+color+" "+this.hashCode());
    }
    public Shape clone(){
        System.out.println("Cloning shape of color "+this.color+ " using "+this.hashCode());
        return new Shape(this.color);
    }
}
